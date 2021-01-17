package com.mycompany.programmstructures;

/*Write a program that prints the smallest and largest positive double values.
Hint: Look up Math.nextUp in the Java API.*/

public class TaskFour {

    public static void main(String[] args) {
        System.out.println("The smallest positive double value is " + Math.nextUp(0.0));
        System.out.println("The largest positive double value is " + Math.nextDown(Double.MAX_VALUE));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

}
