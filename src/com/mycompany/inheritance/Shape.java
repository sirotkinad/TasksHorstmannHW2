package com.mycompany.inheritance;

public abstract class Shape {  //ex4

   private  Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public void moveBy(double dx, double dy){
        p.setX(p.x + dx);
        p.setY(p.y + dy);
    }

    public abstract Point getCenter();

    public abstract Shape Clone();

}
