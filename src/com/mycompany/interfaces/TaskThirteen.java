package com.mycompany.interfaces;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class TaskThirteen {

    public static void sortFiles(File[] files){
        Arrays.sort(files, Comparator.comparing(File::isDirectory).thenComparing(File::getName));
    }

}
