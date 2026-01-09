package com.day07.artify;

public interface IPurchasable {
	
    void purchase(User user);
    void license(User user, String customTerms);
    
}
