package com.mycompany.programmstructures;

/*What happens when you cast a double to an int that is larger than the
largest possible int value? Try it out.
 */

public class TaskFive {

    public static void main(String[] args) {

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
}
