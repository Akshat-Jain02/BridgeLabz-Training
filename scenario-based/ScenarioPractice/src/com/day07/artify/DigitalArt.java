package com.day07.artify;

public class DigitalArt extends Artwork implements IPurchasable{
    public DigitalArt(String title, String artist, double price, String licenseType) {
    	super(title, artist, price, licenseType);
    }
  
    @Override
    public void displayLicensingTerms() {
        System.out.println("Digital Art Licensing (" + licenseType + "): Unlimited digital use, no physical reproduction.");
    } 
    
    @Override
    public void purchase(User user) {
    	if (user.getWalletBalance() >= price) {
    		user.setWalletBalance(user.getWalletBalance() - price);
    		System.out.println("Purchased Digital Art: " + title + " for $" + price);
            System.out.println("New wallet balance: $" + user.getWalletBalance());
    	} else {
    		System.out.println("Insufficient balance to purchase : " + title);
    	}
    }
    
    @Override
    public void license(User user, String customTerms) {
        System.out.println("Licensing Digital Art: " + title + " with custom terms: " + customTerms);
        // No deduction for license example
    }
}
