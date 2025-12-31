package com.objectmodeling.levelone;

public class BankDemo {
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI Bank");

        Customer rohan = new Customer("Rohan");
        Customer amit = new Customer("Amit");

        sbi.openAccount(rohan, 5000);
        sbi.openAccount(amit, 3000);

        rohan.viewBalance();
        amit.viewBalance();
    }
}
