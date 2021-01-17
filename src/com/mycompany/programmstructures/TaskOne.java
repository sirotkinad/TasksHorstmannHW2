package com.mycompany.programmstructures;

import java.util.Scanner;

/*
        Write a program that reads an integer and prints it in binary, octal, and
        hexadecimal. Print the reciprocal as a hexadecimal floating-point number.*/

public class TaskOne {

    public static void main(String[] args) {

        int number;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        number = Integer.parseInt(s.nextLine());
        System.out.println("Entered number: "
                + number);
        System.out.println("Binary form: " + Integer.toString(number, 2));
        System.out.println("Octal form: " + Integer.toString(number, 8));
        System.out.println("Hexadecimal form: " + Integer.toString(number, 16));
        Float val = Float.valueOf(1 / (float) number);
        System.out.println("The reciprocal as a hexadecimal floating-point number: " + Float.toHexString(val));

    }
}
