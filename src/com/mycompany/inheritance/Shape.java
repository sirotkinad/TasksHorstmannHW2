package com.mycompany.inheritance;

public abstract class Shape {

   private  Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public void moveBy(double dx, double dy){
        p.setX(p.getX() + dx); //p.x - error, protected fields of Point are avalaible only for instance LabeledPoint(ex 3)
        p.setY(p.getY() + dy);
    }

    public abstract Point getCenter();

    public abstract Shape Clone();

}
