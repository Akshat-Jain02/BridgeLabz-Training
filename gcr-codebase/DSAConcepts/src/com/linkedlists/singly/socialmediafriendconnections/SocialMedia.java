package com.linkedlists.singly.socialmediafriendconnections;

class SocialMedia {
	
    UserNode head;

    // Add user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search by name
    void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found!");
    }

    // Add friend connection (bidirectional)
    void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        u1.friends = addFriend(u1.friends, id2);
        u2.friends = addFriend(u2.friends, id1);

        System.out.println("Friend connection added!");
    }

    // Helper to add friend ID
    FriendNode addFriend(FriendNode head, int friendId) {
        FriendNode newNode = new FriendNode(friendId);
        newNode.next = head;
        return newNode;
    }

    // Remove friend connection
    void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        u1.friends = removeFriend(u1.friends, id2);
        u2.friends = removeFriend(u2.friends, id1);

        System.out.println("Friend connection removed!");
    }

    // Helper to remove friend
    FriendNode removeFriend(FriendNode head, int id) {
        if (head == null)
            return null;

        if (head.friendId == id)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Display friends of a user
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;
        boolean found = false;

        while (f1 != null) {
            if (isFriend(u2.friends, f1.friendId)) {
                System.out.print(f1.friendId + " ");
                found = true;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    // Helper to check friend existence
    boolean isFriend(FriendNode head, int id) {
        while (head != null) {
            if (head.friendId == id)
                return true;
            head = head.next;
        }
        return false;
    }

    // Count friends for each user
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }

    // Display user
    void displayUser(UserNode u) {
        System.out.println(
            "ID: " + u.userId +
            ", Name: " + u.name +
            ", Age: " + u.age
        );
    }
}