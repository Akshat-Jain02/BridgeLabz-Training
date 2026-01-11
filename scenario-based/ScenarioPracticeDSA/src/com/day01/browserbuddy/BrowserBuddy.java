package com.day01.browserbuddy;

import java.util.*;

public class BrowserBuddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Tab> recentlyClosed = new Stack<>();

        System.out.print("Enter name for your first tab: ");
        String tabName = sc.nextLine();
        System.out.print("Enter initial URL: ");
        String url = sc.nextLine();

        Tab currentTab = new Tab(tabName, url);

        while (true) {
            System.out.println("\n===================================");
            System.out.println("  Current Tab: " + currentTab.getTabName() );
            System.out.println("  Current URL: " + currentTab.getCurrentUrl() );
            System.out.println("=====================================");
            System.out.println("  Commands:");
            System.out.println("   v → visit new url");
            System.out.println("   b → back");
            System.out.println("   f → forward");
            System.out.println("   n → new tab");
            System.out.println("   c → close current tab");
            System.out.println("   r → reopen last closed tab");
            System.out.println("   q → quit");
            System.out.print("→ ");

            String choice = sc.nextLine().trim().toLowerCase();

            switch (choice) {
                case "v":
                    System.out.print("Enter new URL: ");
                    String newUrl = sc.nextLine();
                    currentTab.visit(newUrl);
                    break;

                case "b":
                    currentTab.goBack();
                    break;

                case "f":
                    currentTab.goForward();
                    break;

                case "n":
                    System.out.print("Enter name for new tab: ");
                    String newTabName = sc.nextLine();
                    System.out.print("Enter starting URL: ");
                    String startUrl = sc.nextLine();
                    currentTab = new Tab(newTabName, startUrl);
                    System.out.println("→ Switched to new tab: " + newTabName);
                    break;

                case "c":
                    if (currentTab != null) {
                        System.out.println("→ Closed tab: " + currentTab.getTabName());
                        recentlyClosed.push(currentTab);
                        
                        if (!recentlyClosed.isEmpty() && recentlyClosed.size() >= 1) {
                            currentTab = recentlyClosed.isEmpty() ? null : recentlyClosed.peek();
                            if (currentTab == null) {
                                System.out.println("No more open tabs!");
                            } else {
                                System.out.println("→ Switched to: " + currentTab.getTabName());
                            }
                        } else {
                            currentTab = null;
                            System.out.println("No more open tabs!");
                        }
                    }
                    break;

                case "r":
                    if (!recentlyClosed.isEmpty()) {
                        Tab reopened = recentlyClosed.pop();
                        currentTab = reopened;
                        System.out.println("→ Reopened tab: " + reopened.getTabName());
                        System.out.println("   Back at: " + reopened.getCurrentUrl());
                    } else {
                        System.out.println("No recently closed tabs to reopen!");
                    }
                    break;

                case "q":
                    System.out.println("\nThank you for using BrowserBuddy! Goodbye~");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid command! Try again.");
            }
        }
    }
}