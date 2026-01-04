package com.linkedlists.doubly.undoredotexteditor;

import java.util.Scanner;

public class TextEditor {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        System.out.println("=== Simple Text Editor with Undo/Redo (Doubly Linked List) ===");
        System.out.println("Commands:");
        System.out.println("  • Type any text → save new state");
        System.out.println("  • undo      → go back");
        System.out.println("  • redo      → go forward");
        System.out.println("  • show      → display current text");
        System.out.println("  • history   → show full history");
        System.out.println("  • exit      → quit\n");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                editor.undo();
            } else if (input.equalsIgnoreCase("redo")) {
                editor.redo();
            } else if (input.equalsIgnoreCase("show")) {
                editor.displayCurrent();
            } else if (input.equalsIgnoreCase("history")) {
                editor.showHistory();
            } else if (!input.isEmpty()) {
                editor.addState(input);
                editor.displayCurrent();
            } else {
                System.out.println("Please type something or use a command.");
            }
        }
        scanner.close();
    }
}