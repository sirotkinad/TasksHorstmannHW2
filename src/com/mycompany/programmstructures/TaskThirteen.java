package com.mycompany.programmstructures;

/*Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TaskThirteen {

    public static void main(String[] args) {

        System.out.println("Your lottery combination is: ");
        System.out.println(printLotteryComb());

    }

    public static String printLotteryComb(){ //ex13
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 49; i++)
            numbers.add(i);
        Random rand = new Random();
        int max;
        int min = 0;
        int[] resNumbers = new int[6];
        for(int count = 0; count < 6; count++) {
            max = numbers.size() - 1;
            int randomIndex = rand.nextInt(max - min) + min;
            resNumbers[count] = numbers.remove(randomIndex);
        }
        Arrays.sort(resNumbers);
       return (Arrays.toString(resNumbers));
    }

}
