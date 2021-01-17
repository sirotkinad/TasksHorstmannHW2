package com.mycompany.inheritance;

import java.util.Objects;


public class DiscountedItem extends Item{  //task6

    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if(!(super.equals(o))) {
            return false;
        }
        Class clazz = this.getClass();
        if(o.getClass() == clazz.getSuperclass()) {
            return true;
        }
        else {
            DiscountedItem that = (DiscountedItem) o;
            return Double.compare(that.discount, discount) == 0;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long val = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (val ^ (val >>> 32));
        return result;
    }
}
