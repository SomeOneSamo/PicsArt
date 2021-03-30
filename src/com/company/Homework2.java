package com.company;

public class Homework2 {
    public static void main(String[] args) {
        int count = 0;
        int printLimit = 5;
        System.out.println("This is how many times we have printed this statement previously: " + count++
                + "  You still can print " + (printLimit - count) + " times");
        System.out.println("This is how many times we have printed this statement previously: " + count++
                + "  You still can print " + (printLimit - count) + " times");
        System.out.println("This is how many times we have printed this statement previously: " + count++
                + "  You still can print " + (printLimit - count) + " times");
        System.out.println("This is how many times we have printed this statement previously: " + count++
                + "  You still can print " + (printLimit - count) + " times");
        System.out.println("This is how many times we have printed this statement previously: " + count++
                + "  You still can print " + (printLimit - count) + " times");

        if (count > printLimit)
            System.out.println("You have passed your limit");
        else
            System.out.println("This is how many times we have printed this statement in total: "
                    + count + "\nYou still can print " + (printLimit - count) + " times");

        System.out.println("---------------------------------------------");

        String[] products = {"Pen", "Pencil", "Book"};
        int[] prices = {100, 50, 1500};
        System.out.println("Initial prices for the products are\n"
                + products[0] + " : " + prices[0] + "\n"
                + products[1] + " : " + prices[1] + "\n"
                + products[2] + " : " + prices[2]);

        int[] changedPrices = new int[2];
        changedPrices[0] = 80;
        changedPrices[1] = 60;
        System.out.println("Number of the prices that were changed is " + changedPrices.length + "\n"
                + products[0] + " : " + changedPrices[0] + "\n"
                + products[1] + " : " + changedPrices[1] + "\n"
                + products[2] + " : " + prices[2] + " price of " + products[2] + " was unchanged");

        System.out.println("---------------------------------------------");

        int num = 17;
        boolean isDegreeOf2 = ((num & (num - 1)) == 0) ? true : false;
        System.out.println("Is " + num + " degree of 2?\nThe answer is: " + isDegreeOf2);
        System.out.println(num + " * 2 = " + (num<<1));
        System.out.println(num + " / 2 = " + (num>>1));
    }
}
