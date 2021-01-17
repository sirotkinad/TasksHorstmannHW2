package com.mycompany.interfaces.taskonetwo;

public class Employee implements Measurable {

    private int id;
    private double salary;
    private String name;

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

}
