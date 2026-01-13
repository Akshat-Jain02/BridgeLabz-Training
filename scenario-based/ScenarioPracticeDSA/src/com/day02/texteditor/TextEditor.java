package com.day02.texteditor;

import java.util.Stack;

class TextEditor {
    String content = "";
    Stack<Action> undoStack = new Stack<>();
    Stack<Action> redoStack = new Stack<>();

    void insert(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear();
    }

    void delete(int n) {
        if (n > content.length()) n = content.length();
        String removed = content.substring(content.length() - n);
        content = content.substring(0, content.length() - n);
        undoStack.push(new Action("delete", removed));
        redoStack.clear();
    }

    void undo() {
        if (undoStack.isEmpty()) return;
        Action a = undoStack.pop();
        if (a.type.equals("insert")) {
            content = content.substring(0, content.length() - a.text.length());
        } else {
            content += a.text;
        }
        redoStack.push(a);
    }

    void redo() {
        if (redoStack.isEmpty()) return;
        Action a = redoStack.pop();
        if (a.type.equals("insert")) {
            content += a.text;
        } else {
            content = content.substring(0, content.length() - a.text.length());
        }
        undoStack.push(a);
    }

    String getText() {
        return content;
    }
}