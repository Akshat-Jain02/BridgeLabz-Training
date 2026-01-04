package com.linkedlists.singly.socialmediafriendconnections;

public class SocialMediaFriends {
	
    public static void main(String[] args) {
  
        SocialMedia sm = new SocialMedia();

        // Sample users
        sm.addUser(1, "Alice", 22);
        sm.addUser(2, "Bob", 23);
        sm.addUser(3, "Charlie", 21);
        sm.addUser(4, "David", 24);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(1);
        sm.mutualFriends(1, 2);
        sm.countFriends();

    }
}