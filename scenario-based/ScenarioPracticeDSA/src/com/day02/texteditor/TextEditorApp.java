package com.day02.texteditor;

import java.util.*;

public class TextEditorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("1 Insert 2 Delete 3 Undo 4 Redo 5 Show 6 Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                String text = sc.nextLine();
                editor.insert(text);
            } else if (choice == 2) {
                int n = sc.nextInt();
                editor.delete(n);
            } else if (choice == 3) {
                editor.undo();
            } else if (choice == 4) {
                editor.redo();
            } else if (choice == 5) {
                System.out.println(editor.getText());
            } else {
                break;
            }
        }
    }
}






