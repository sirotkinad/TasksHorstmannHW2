package com.mycompany.inheritance;

public class Circle extends Shape{

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }


    @Override
    public Point getCenter() {
        return getP();
    }

   //deep copy
    public Shape Clone() {
        Point center = new Point(getP().getX(), getP().getY());
        return new Circle(center,radius);
    }
}
