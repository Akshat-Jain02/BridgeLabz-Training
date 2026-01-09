package com.day07.artify;

class PrintArt extends Artwork implements IPurchasable {
	
    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void displayLicensingTerms() {
        System.out.println("Print Art Licensing (" + licenseType + "): Limited physical prints, royalty on sales.");
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.setWalletBalance(user.getWalletBalance() - price);
            System.out.println("Purchased Physical Print Art: " + title + " for $" + price);
            System.out.println("New wallet balance: $" + user.getWalletBalance());
        } else {
            System.out.println("Insufficient balance to purchase " + title);
        }
    }

    @Override
    public void license(User user, String customTerms) {
        System.out.println("Licensing Print Art: " + title + " with custom terms: " + customTerms);
    }
}