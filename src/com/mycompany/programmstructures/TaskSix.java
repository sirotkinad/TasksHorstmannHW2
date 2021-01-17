package com.mycompany.programmstructures;

import java.math.BigInteger;

/*Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
BigInteger. Compute the factorial of 1000.

 */

public class TaskSix {

    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }

    public static BigInteger factorial(int n){
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

}
