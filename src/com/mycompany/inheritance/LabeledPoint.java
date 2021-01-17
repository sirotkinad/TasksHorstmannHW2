package com.mycompany.inheritance;

import java.util.Objects;

public class LabeledPoint extends Point{

    private String label;

    public LabeledPoint(String label, double x, double y) {   //ex1
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" + "x=" + getX() +
                ", y=" + getY() +
                "label='" + label + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Double.compare(x, that.x) == 0 &&
                Double.compare(y, that.y) == 0 &&
                label.equalsIgnoreCase(that.label);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + label.hashCode();
        return result;
    }
}
