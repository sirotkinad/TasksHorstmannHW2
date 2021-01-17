package com.mycompany.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaskEight {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aaaaa");
        list.add("a");
        list.add("aaaa");
        list.add("aaa");
        System.out.println("Before: " + list.toString());
        luckySort(list, Comparator.comparing(String::length));
        System.out.println("After: " + list.toString());

    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        while(! checkOrder(strings, comp)){
            Collections.shuffle(strings);
        }
    }

    public static boolean checkOrder(ArrayList<String> strings, Comparator<String> comp){
        for(int i = 0; i < strings.size() - 1; i++){
            if(comp.compare(strings.get(i), strings.get(i + 1)) > 0)
                return false;
        }
        return true;
    }
}
