package com.mycompany.programmstructures;

/*Write a program that produces a random string of letters and digits by
        generating a random long value and printing it in base 36*/

import java.util.Random;

public class TaskTen {
    public static void main(String[] args) {

        long res = 0;
        String str = genRandomString();
        for(int i = 0; i < str.length(); i++){
            res += str.charAt(i);
        }

        System.out.println(str);
        System.out.println(res);
    }

    public static String genRandomString(){
        Random random = new Random();
        int length = random.nextInt(100);
        final String digits = "0123456789";
        final String letters = "abcdefghijklmnopqrstuvwxyz";
        final String lettersUpper = letters.toUpperCase();
        String str = digits + letters + lettersUpper;
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0 ; i < length; i++){
            int randomInt = random.nextInt(str.length());
            sb.append(str.charAt(randomInt));
        }
        return sb.toString();
    }
}
