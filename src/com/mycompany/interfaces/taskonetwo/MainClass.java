package com.mycompany.interfaces.taskonetwo;

import java.util.Arrays;
import java.util.Comparator;

public class MainClass {

    public static void main(String[] args) {

        Measurable emp1 = new Employee(1, 10, "Alex");
        Measurable emp2 = new Employee(2, 15, "Mike");
        Measurable emp3 = new Employee(3, 20, "Kate");
        Measurable emp4 = new Employee(4, 25, "Anna");
        Measurable emp5 = new Employee(5, 35, "Richard");

        Measurable[] employees = {emp1, emp2, emp3, emp4, emp5};

        System.out.println("Average salary is " + average(employees));
        System.out.println("Name of employee with the largest salary " + ((Employee) largest(employees)).getName());

    }

    public static double average (Measurable[] objects){
        if(objects.length == 0) {
            return 0.0;
        }
        else {
            double result = 0;
            for (Measurable o : objects) {
                result += o.getMeasure();
            }
            return result / objects.length;
        }
    }

    public static Measurable largest(Measurable[] objects) {
        Arrays.sort(objects,Comparator.comparingDouble(Measurable::getMeasure));
        return objects[objects.length - 1];
        }
}
