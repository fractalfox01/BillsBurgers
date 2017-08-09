/*
Author: FractalFox

Program Requirements:
        The purpose of the application is to help a fictitious company called Bill's Burgers to manage
        their process of selling hamburgers.
        Our application will help Bill to select types of burgers, some of the additional items (additions) to
        be added to the burgers and pricing.
        We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
        Bill's store.
        The basic hamburger should have the following items.
        bread roll type, meat and up to 4 additional toppings (things like lettuce, tomato, carrot, etc) that
        the customer can select to be added to the burger. Each one of these items gets charged an additional
        price so you need some way to track how many items got added and to calculate the price (for the base
        burger and all the additions).
        This burger has a base price and the additions are all separately priced.
        Create a Hamburger class to deal with all the above.
        The constructor should only include the roll type, meat, and price.
        Also create two extra varieties of Hamburgers (classes) to cater for
        a) Healthy burger can have a total of 6 items (additions) in total.
        hint: you have to find a way to automatically add these new additions at the time the delude burger
        object is created, and then prevent other additions being made.
        All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        plus all additionals, each showing the addition name, and addition price, and a grand total fot the
        burger.
        For the two additional classes this may require you to be looking at the base class for pricing and then
        adding totals onto that.
         */

import java.util.Scanner;

public class BillsBurgerShop {
    public static void main(String[] args){

        System.out.println("------------------------------\n\t Bills' Burger Shop\nProduction Management SoftWare\n------------------------------\n\n");

        buildBurger();
    }
    public static void buildBurger(){
        Scanner scan = new Scanner(System.in);
        int burgerType;

        System.out.println("Choose Type of Burger:\n\t1 for\tBasic\n\t2 for\tHealthy\n\t3 for\tKids\n\t-1 to\tExit");
        burgerType = scan.nextInt();

        if (pickType(scan, burgerType) == "Basic Burger Selected"){
            double price = 5.00d;
            Hamburger basic = new Hamburger("Basic","Cow",price);
        }
        if (pickType(scan, burgerType) == "Healthy Burger Selected"){
            double price = 7.50d;
            Hamburger healthy = new Hamburger("Healthy","Cow",price);
        }
        if (pickType(scan, burgerType) == "Kids Burger Selected"){
            double price = 4.00d;
            Hamburger basic = new Hamburger("Kids","Cow",price);
        }
    }
    public static String pickType(Scanner scan, int burgerType){

        while (burgerType != -1) {

            switch (burgerType) {
                case 1:
                    return ("Basic Burger Selected");
                case 2:
                    return ("Healthy Burger Selected");
                case 3:
                    return ("Kids Burger Selected");
                case -1:
                    return "Exit";
                default:
                    System.out.println("Thats not a valid option, Try again...");
                    burgerType = scan.nextInt();
            }
        }
        return "Null";
    }
}





