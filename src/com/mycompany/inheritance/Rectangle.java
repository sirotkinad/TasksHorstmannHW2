package com.mycompany.inheritance;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }


    @Override
    public Point getCenter() {
        double centerX = getP().getX() + width;
        double centerY = getP().getY() - height;
        return new Point(centerX, centerY);
    }

    //deep copy
    public Shape Clone() {
        Point topLeft = new Point(getP().getX(), getP().getY());
        return new Rectangle(topLeft, width, height);
    }
}
