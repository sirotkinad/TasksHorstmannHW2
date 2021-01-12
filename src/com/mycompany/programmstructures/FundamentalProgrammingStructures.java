package com.mycompany.programmstructures;

import java.math.BigInteger;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class FundamentalProgrammingStructures {

    public static void ConvertInt(){ //ex1
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

    public static void normalizeAngle(){ //ex2
        int angle;
        System.out.println("Enter the angle: ");
        Scanner s = new Scanner(System.in);
        angle = Integer.parseInt(s.nextLine());
        int res = angle % 360;
        if(res < 0)
            res = res + 360;
        System.out.println("Normalization using %: " + res);
        res = Math.floorMod(angle, 360);
        System.out.println("Normalization using floorMod: " + res);
    }

    public static void findMaxInt(){ //ex3
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println("Max number using conditional operator: " + (a > b && a > c ? a : b > c ? b : c));
        System.out.println("Max number using method Max(): " + (Math.max(a, Math.max(b,c))));
    }

    public static void findMinAndMaxDouble(){ //ex4
        System.out.println("The smallest double value is " + Math.nextUp(0.0));
    }


    public static void castDoubleToInt(){ //ex5
        double val = (Math.random()*((100-10)+1)) + (double)Integer.MAX_VALUE;
        int res = (int) val;
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
        System.out.println("Double value: " + val);
        System.out.println("Int value: " + res);
        /*
       casting a double to an int that is larger than the
             largest possible int value: result int value is the same as integer max value.
              The fractional part is discarded and int variable keeps max possible value.
         */
    }

    public static BigInteger factorial(int n){ //ex6
       if(n < 0)
            throw new IllegalArgumentException();
       else if( n == 0 || n == 1)
           return BigInteger.ONE;
       else {
           BigInteger res = BigInteger.ONE;
           for(int i = 2; 2 <= n; i++)
               res = res.multiply(BigInteger.valueOf(i));
           return res;
       }
    }

    public static void findSubstrings(){ //ex8
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str;
        str = s.nextLine();
        System.out.println("Substrings: " + "\n");
        for(int i = 0; i < str.length(); i++)
            for(int j = 1; j <= str.length() - i; j++)
                System.out.println(str.substring(i, i + j));
    }

    public static void compareStringsExample(){ //ex9
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //false
    }



    public static void printLotteryComb(){ //ex13
        ArrayList<Integer> numbers = new ArrayList<Integer>();
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
        System.out.println("Your lottery combination is: ");
        System.out.println(Arrays.toString(resNumbers));
    }

}
