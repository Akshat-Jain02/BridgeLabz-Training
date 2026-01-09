package com.day07.foodloop;

import java.util.*;

public class FoodLoop {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    	
        
        System.out.println("-----------------WELCOME TO FOOD LOOP------------------");
        
        System.out.println("\n===========MENU==============" +
                           "\n\n=======VEG ITEMS===========" +
        		            "\n1. CHOLE BHATURE     : 120 RS" +
                            "\n2. PANNER KULCHE     : 160 RS" +
        		            "\n3. VEG SANDWITCH     : 110 RS" +
                            "\n4. DOSA              : 120 Rs" +
        		            "\n\n======NON VEG ITEMS========" +
                            "\n5. CHICKEN TIKKA     : 220 Rs" +
        		            "\n6. SHORMA            : 60  Rs" +
                            "\n7. KABAB             : 50  RS" +
        		            "\n8. CHICKEN SANDWITCH : 200 Rs");
        
        List<FoodItem> list = new ArrayList<>();
        list.add(new VegItem("Chole-Bhature" ,120.0, true));
        list.add(new VegItem("Panner-Kulche" , 160 , true));
        list.add(new VegItem("Veg-Sandwitch", 110, true));
        list.add(new VegItem("Dosa", 120, true));
        list.add(new NonVegItem("Chiken-Tikka" , 220, true));
        list.add(new NonVegItem("Shorma" , 60, true));
        list.add(new NonVegItem("Kabab", 50, true));
        list.add(new NonVegItem("Chicken-Sandwitch", 200, true));
        
        Order order = new Order();
       
        char takeOrder ='y';
        do {
            
            System.out.println("Enter your choice (1 /2 /3 .... ->) || (0 -> combo) || (-1 -> cancelOrder )");
            int choice = sc.nextInt();
            
            if (choice == -1) {
            	
                do {
                    System.out.println("Enter the item no that you want to cancel");
                	int num = sc.nextInt();
                	
                	if (num > 0 && num <= list.size()) {
                		order.cancelOrder(list.get(num - 1));
                		break;
                	}
                	
                } while (true);
                
            } else if (choice == 0) {
                System.out.println("\n\n ===========COMBOS AVAILABLE============" +
                                   "\n\n1. KABAB + CHIKEKTIKKA" +
                		           "\n2. VEG SANDWITCH + PANNER KULCHE" +
                                   "\n3. SHORMA + KABAB" +
                		           "\n\n=============== 20 % percent discount on totalbill on purchase of a combo");
                
                int comboChoice = sc.nextInt();
                switch (comboChoice) {
                    case 1 -> {
                    	order.placeOrder(list.get(4), list.get(6));
                    }
                    case 2 -> {
                    	order.placeOrder(list.get(2), list.get(1));
                    }
                    case 3 -> {
                    	order.placeOrder(list.get(5), list.get(6));
                    }
                    default -> { 
                    	System.out.println("You entered a invalid choice");
                    	continue;
                    }
                }
            	
            	System.out.println("Congratulations || you got 20 % discount on total bill");
            	order.applyDiscount(20);
            } else {
            	if (choice > 0 && choice < list.size()) {
            		order.placeOrder(list.get(choice));
            	} else {
            		System.out.println("Please enter a valid choice");
            		continue;
            	}
            }
            
            System.out.println("Do you want to order somthing else (Y/N)");
            takeOrder = sc.next().toLowerCase().charAt(0);
            
        } while (takeOrder == 'y');
        
        order.display();
        
    }
}
