package com.mycompany.oop;

public final class Point { //part2, ex5

    private final double x;
    private final double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y){
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double val){
        if( val < 0)
            val = -1 * val;
        return new Point(this.x * x, this.y * y);
    }
}
