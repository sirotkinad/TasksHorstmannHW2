package com.mycompany.programmstructures;

import java.util.Scanner;

/*. Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.*/

public class TaskTwo {

    public static void main(String[] args) {

        int angle;
        int maxDeg = 360;
        System.out.println("Enter the angle: ");
        Scanner s = new Scanner(System.in);
        angle = Integer.parseInt(s.nextLine());
        int res = angle % maxDeg;
        if(res < 0)
            res = res + maxDeg;
        System.out.println("Normalization using %: " + res);
        res = Math.floorMod(angle, maxDeg);
        System.out.println("Normalization using floorMod: " + res);

    }

}
