package com.mycompany.interfaces;

import javax.imageio.stream.ImageOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Class strClazz = String.class;
        Class scClazz = Scanner.class;
        Class imageClazz = ImageOutputStream.class;
        System.out.println("Supertypes of String:");
        System.out.println(getSupertypes(strClazz).toString() + "\n");
        System.out.println("Supertypes of Scanner:");
        System.out.println(getSupertypes(scClazz).toString()+ "\n");
        System.out.println("Supertypes of ImageOutputStream:");
        System.out.println(getSupertypes(imageClazz).toString()+ "\n");
    }

    public static ArrayList<Class> getSupertypes(Class clazz){
        Class[] superTypes = clazz.getInterfaces();
        ArrayList<Class> superTypesList = new ArrayList<>();
        if(superTypes.length > 0) {
            for (Class temp : superTypes) {
                superTypesList.add(temp);
            }
        }
        if(clazz.getSuperclass() != null){
            superTypesList.add(clazz.getSuperclass());
        }
        return  superTypesList;
    }

}
