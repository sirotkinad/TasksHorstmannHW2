package com.mycompany.programmstructures;

import java.util.Scanner;

/*. Using only the conditional operator, write a program that reads three
integers and prints the largest. Repeat with Math.max*/

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println("Max number using conditional operator: " + (a > b && a > c ? a : b > c ? b : c));
        System.out.println("Max number using method Max(): " + (Math.max(a, Math.max(b,c))));

    }
}
