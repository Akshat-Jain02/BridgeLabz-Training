package com.linkedlists.doubly.undoredotexteditor;

public class TextEditorUndoRedo {
	
    private TextState current;
    private final int MAX_HISTORY = 10;

    // Add a new text state (after typing or action)
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        if (current == null) {
            current = newState;
        } else {
            newState.prev = current;
            current.next = newState;
            current = newState;
            // Clear any future (redo) states
            current.next = null;
        }

        // Enforce max history limit of 10
        TextState temp = current;
        int count = 0;
        while (temp.prev != null) {
            temp = temp.prev;
            count++;
        }
        if (count >= MAX_HISTORY) {
            // Remove the oldest state
            TextState oldest = temp;
            if (oldest.next != null) {
                oldest.next.prev = null;
            }
        }

        System.out.println("New state saved: \"" + newText + "\"");
    }

    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo.");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed.");
        displayCurrent();
    }

    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo.");
            return;
        }
        current = current.next;
        System.out.println("Redo performed.");
        displayCurrent();
    }

    public void displayCurrent() {
        if (current == null) {
            System.out.println("Current text: (empty)");
        } else {
            System.out.println("Current text: \"" + current.text + "\"");
        }
    }

    public void showHistory() {
        if (current == null) {
            System.out.println("No history available.");
            return;
        }
        System.out.println("\n--- History (Oldest → Newest) ---");
        TextState temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        int index = 1;
        while (temp != null) {
            String marker = (temp == current) ? " ← CURRENT" : "";
            System.out.println(index + ". \"" + temp.text + "\"" + marker);
            temp = temp.next;
            index++;
        }
        System.out.println("----------------------------------\n");
    }
}