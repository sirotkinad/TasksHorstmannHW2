package com.mycompany.programmstructures;

import java.util.Scanner;

/*Write a program that reads a string and prints all of its nonempty
substrings
 */

public class TaskEight {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str;
        str = s.nextLine();
        System.out.println("Substrings: " + "\n");
        for(int i = 0; i < str.length(); i++)
            for(int j = 1; j <= str.length() - i; j++)
                System.out.println(str.substring(i, i + j));

    }
}
