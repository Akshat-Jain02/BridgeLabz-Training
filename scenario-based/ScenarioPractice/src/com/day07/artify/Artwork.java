package com.day07.artify;

public abstract class Artwork {
	protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;
    
    public Artwork(String title, String artist, double price, String licenceType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenceType;
    }
    
    public abstract void displayLicensingTerms();

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public double getPrice() {
		return price;
	}

	public String getLicenseType() {
		return licenseType;
	}
    
}
