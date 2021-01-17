package com.mycompany.inheritance;

public class Line extends Shape{ //ex4

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }


    @Override
    public Point getCenter() {
        double centerX = (getP().getX() + to.getX()) / 2;
        double centerY = (getP().getY() + to.getY()) / 2;
        return new Point(centerX, centerY);
    }

    //deep copy
    public Shape Clone() {
        Point from = new Point(getP().getX(), getP().getY());
        Point to = new Point(this.to.getX(), this.to.getY());
        return new Line(from, to);
    }

}
