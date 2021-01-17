package com.mycompany.programmstructures;

/*Section 1.5.3, “String Comparison” (page 25) has an example of two strings
s and t so that s.equals(t) but s != t. Come up with a different example
that doesn’t use substring).
 */

public class TaskNine {

    public static void main(String[] args) {
        String s = "Hello";
        String t = new String("Hello");
        System.out.println(s.equals(t)); //s.equals(t) true
        System.out.println(s == t); //s = t false
    }

}
