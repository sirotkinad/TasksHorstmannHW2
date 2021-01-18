package com.mycompany.interfaces;

import java.io.File;


public class TaskTwelve {

    public static void main(String[] args) {

        final String PATH = "C:\\Users\\Admin\\Pictures\\Saved Pictures";
        String extension = ".txt";
        String[] files = getFiles(PATH, extension);
        for (String s : files) {
            System.out.println(s);
        }

    }

    public static String[] getFiles(String directory, String extension) {
        File f = new File(directory);
        return f.list((dir, name) -> name.toLowerCase().endsWith(extension));
    }
}