package com.company;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Create an array and fill it with 2 number.");
        int[] array1 = {2, 2, 2, 2, 2};
        /*for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }*/

        System.out.println("Create an array and fill it with numbers from 1:1000.");
        int[] array2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array2[i] = i + 1;
        }
        /*for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }*/

        System.out.println("Create an array and fill it with odd numbers from -20:20.");
        int[] array3 = new int[20];
        int index = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 == 1 || (-1 * i) % 2 == 1) {
                array3[index] = i;
                index++;
            }
        }
        /*for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }*/

        System.out.println("Create an array and fill it. Print all element which can be divided by 5.");
        int[] array4 = new int[20];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = i;
            if (array4[i] % 5 == 0) {
                System.out.println(array4[i] + " can be divided by 5 ");
            }
        }
        //implementation with 2 loops
        //for (int i = 0; i < array4.length; i++) {
        //    if (array4[i] % 5 == 0) {
        //        System.out.println("This number can be divided by 5 " + array4[i]);
        //    }
        //}

        System.out.println("Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        int[] array5 = {2, 56, 5888, 456, 457, 24};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] < 467.23 && array5[i] > 24.12) {
                System.out.println(array5[i]);
            }
        }

        System.out.println("Create an array and fill it. Print count of elements which can be divided by 2.");
        int[] array6 = new int[10];
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            array6[i] = i * 3;
            if (array6[i] % 2 == 0)
                count++;
        }
        /*for(int i = 0; i < array6.length; i++)
        {
            if (array6[i] % 2 == 0)
                count++;
        }*/
        System.out.println("Number of elements that can be divided by 2 in given array is: " + count);

        System.out.println("Given an integer N, print it's first 10 multiples.\n" +
                "Each multiple should be printed on a new line in the form: N x i = result.");
        int N = 2;
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }

}
