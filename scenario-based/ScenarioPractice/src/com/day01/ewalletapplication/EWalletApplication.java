package com.day01.ewalletapplication;

public class EWalletApplication {
    public static void main(String[] args) {

        User akshat = new User("Akshat", new PersonalWallet());
        User rahul = new User("Rahul", new BusinessWallet());

        akshat.loadMoney(500);
        akshat.transferTo(rahul, 200);

        System.out.println("Akshat Balance: " + akshat.wallet.getBalance());
        System.out.println("Rahul Balance: " + rahul.wallet.getBalance());
    }
}
