package com.mycompany.programmstructures;

/*
Write a program that reads in two integers between 0 and 4294967295,
stores them in int variables, and computes and displays their unsigned
sum, difference, product, quotient, and remainder. Do not convert them
to long values.
 */


import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {

        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers between 0 and 4294967295: ");
        a = (int) s.nextLong();
        b = (int) s.nextLong();
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum |a + b| = " + (int) Math.abs(a + b));
        System.out.println("Difference |a - b| = " + (int) Math.abs(a - b));
        System.out.println("Product |a * b| = " + (int) Math.abs(a * b));
        System.out.println("Quotient |a / b| = " + (int) Math.abs(a / b));
        System.out.println("Remainder |a % b| = " + (int) Math.abs(a % b));

    }
}
