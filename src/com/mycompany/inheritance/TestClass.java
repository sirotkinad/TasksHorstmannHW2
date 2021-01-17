package com.mycompany.inheritance;


public class TestClass {

    public static void main(String[] args) {

        //task3
        Point point = new Point(1.0, 1.0);
        LabeledPoint labeledPoint = new LabeledPoint("label", 1.0, 1.0);
        System.out.println(point.x);
        System.out.println(labeledPoint.x); //labeledPoint.x - OK because Labeled Point is subclass, fields of superclass are protected
        System.out.println("\n");

        //task6
        Item first = new Item("i", 100.0);
        DiscountedItem second = new DiscountedItem("i", 100.0, 10.0);
        DiscountedItem third = new DiscountedItem("i", 100.0, 1.0);

        //check symmetry - OK
        System.out.println(first.equals(second)); //true
        System.out.println(second.equals(first)); //true
        System.out.println(second.equals(third)); //false
        System.out.println(third.equals(second)); //false
        System.out.println(first.equals(third)); //true
        System.out.println(third.equals(first)); //true

        System.out.println("\n");

        //check transitivity - failed
        System.out.println(first.equals(second)); //true
        System.out.println(first.equals(third)); //true
        System.out.println(second.equals(third)); //false
    }

}
