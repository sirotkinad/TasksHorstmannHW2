package com.mycompany.interfaces;

import java.io.File;
import java.io.FileFilter;

public class TaskEleven {

    public static void main(String[] args) {

        final String PATH = "C:\\Users\\Admin\\Pictures";
        System.out.println(PATH);
        printSubdir(getSubdirWithAnonymous(PATH));
        printSubdir(getSubdirWithLambda(PATH));
        printSubdir(getSubdirMethodExpr(PATH));

    }

    public static File[] getSubdirWithAnonymous(String directory){
       File f = new File(directory);
            return f.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory();
                }
            });
    }

    public static File[] getSubdirWithLambda(String directory){
        File f = new File(directory);
        return f.listFiles((file) -> file.isDirectory());

    }

    public static File[] getSubdirMethodExpr(String directory){
        File f = new File(directory);
        return f.listFiles(File::isDirectory);
    }

    public static void printSubdir(File[] subdirectories){
        for(File f: subdirectories){
            System.out.println(f.getName());
        }
    }

}
