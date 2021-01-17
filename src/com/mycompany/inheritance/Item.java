package com.mycompany.inheritance;

import java.util.Objects;

public class Item {  //task6

    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        int result = 17;
        long val = Double.doubleToLongBits(price);
        result = 31 * result + (int) (val ^ (val >>> 32));
        result = 31 * result + description.hashCode();
        return result;
    }

}
