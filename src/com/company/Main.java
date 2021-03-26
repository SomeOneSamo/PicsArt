package com.company;

public class Main {

    public static void main(String[] args) {

        byte numberByte = 127;
        short numberShort = 25414;
        int numberInt = 5000;
        long numberLong = 500000000000l;
        float numberFloat = 3.14f;
        double numberDouble = 3.14159265359;
        boolean isBool = true;
        char comma = ',';
        System.out.println("Value of numberByte: " + numberByte);
        System.out.println("Value of numberShort: " + numberShort);
        System.out.println("Value of numberInt: " + numberInt);
        System.out.println("Value of numberLong: " + numberLong);
        System.out.println("Value of numberFloat: " + numberFloat);
        System.out.println("Value of numberDouble: " + numberDouble);
        System.out.println("Value of isBool: " + isBool);

        String expression1 = "This is expression1 String";
        String expression2 = " and this is expression2 String";

        System.out.println(expression1 + comma + expression2);
    }
}
