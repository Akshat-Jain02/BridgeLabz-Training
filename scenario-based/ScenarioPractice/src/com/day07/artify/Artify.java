package com.day07.artify;

import java.util.*;

public class Artify {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   
		System.out.println("Enter user name");
		String userName = sc.nextLine();
		
		System.out.println("Enter user balance");
		double balance = sc.nextDouble();
		
		User currentUser = new User(userName, balance);
		
		List<Artwork> artworks = new ArrayList<>();  
		artworks.add(new DigitalArt("Sunset Dreams", "Alice", 150.0, "Royalty-Free"));
        artworks.add(new DigitalArt("Cyber City", "Bob", 200.0, "Exclusive"));
        artworks.add(new PrintArt("Mountain Landscape", "Charlie", 300.0, "Limited Edition"));
        artworks.add(new PrintArt("Abstract Waves", "Diana", 250.0, "Commercial"));
        
        while (true) {
        	System.out.println("\n--- Artify Digital Art Marketplace ---");
            System.out.println("Welcome, " + currentUser.getName() + "! Wallet: $" + currentUser.getWalletBalance());
            System.out.println("Available Artworks:");
            for (int i = 0; i < artworks.size(); i++) {
                Artwork art = artworks.get(i);
                System.out.println((i + 1) + ". " + art.getTitle() + " by " + art.getArtist() +
                        " | Price: $" + art.getPrice() + " | Type: " +
                        (art instanceof DigitalArt ? "Digital" : "Print") +
                        " | License: " + art.getLicenseType());
            }
            System.out.println((artworks.size() + 1) + ". Exit");    
            
            System.out.println("Select artwork number to view/purchase/license (or exit): ");
            int choice = sc.nextInt();
            
            sc.nextLine();
            
            if (choice == (artworks.size() + 1)) {
            	System.out.println("Than you for visiting artify");
            	break;
            } else if (choice <= 0 || choice > artworks.size()) {
            	System.out.println("Please enter a valid choice");
            	continue;
            } 
            
            Artwork selected = artworks.get(choice - 1);
            IPurchasable purchasable = (IPurchasable) selected;
       
            selected.displayLicensingTerms(); // Polymorphism in action

            System.out.println("\nOptions:");
            System.out.println("1. Purchase (full ownership)");
            System.out.println("2. License (custom terms)");
            System.out.println("3. Back to list");
            
            System.out.print("Choose action: ");
            int action = sc.nextInt();
            sc.nextLine();

            if (action == 1) {
                purchasable.purchase(currentUser);
            } else if (action == 2) {
                System.out.print("Enter custom licensing terms: ");
                String terms = sc.nextLine();
                purchasable.license(currentUser, terms);
            } else {
                System.out.println("Returning to list...");
            }
            
        }
        
        sc.close();
	}
}
