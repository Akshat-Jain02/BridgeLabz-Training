package com.day01.browserbuddy;

class Tab {
	
    private HistoryNode current;
    private final String tabName;

    public Tab(String tabName, String initialUrl) {
        this.tabName = tabName;
        this.current = new HistoryNode(initialUrl);
    }

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        
        System.out.println("[" + tabName + "] Visited: " + url);
    }

    public void goBack() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("[" + tabName + "] Back to: " + current.url);
        } else {
            System.out.println("[" + tabName + "] Cannot go back! (Beginning of history)");
        }
    }

    public void goForward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("[" + tabName + "] Forward to: " + current.url);
        } else {
            System.out.println("[" + tabName + "] Cannot go forward! (End of history)");
        }
    }

    public String getCurrentUrl() {
        return current.url;
    }

    public String getTabName() {
        return tabName;
    }
}