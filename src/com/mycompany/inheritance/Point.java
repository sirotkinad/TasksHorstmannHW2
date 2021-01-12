package com.mycompany.inheritance;

import java.util.Objects;

public class Point implements Cloneable{

    protected double x;
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y =y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long val1 = Double.doubleToLongBits(x);
        long val2 = Double.doubleToLongBits(y);
        result = 31 * result + (int) (val1 ^ (val1 >>> 32));
        result = 31 * result + (int) (val2 ^ (val2 >>> 32));
        return result;
    }

    //shallow copy
    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
