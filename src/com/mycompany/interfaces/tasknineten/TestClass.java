package com.mycompany.interfaces.tasknineten;

import java.util.Random;

public class TestClass {

    public static void main(String[] args) {

        //test task 8
        Runnable greet1 = new Greeter(5, "world");
        Runnable greet2 = new Greeter(5, "world again");

        new Thread(() -> greet1.run()).start();
        new Thread(() -> greet2.run()).start();

        //test task9
        Runnable greet3 = new Greeter(3, "sun");
        Runnable greet4 = new Greeter(4, "Java");
        Runnable greet5 = new Greeter(1, "nature");
        Runnable greet6 = new Greeter(6, "life");
        System.out.println("\n");
        runTogether(greet1, greet2, greet3, greet4, greet5, greet6);
        System.out.println("\n");
        runInOrder(greet1, greet2, greet3, greet4, greet5, greet6);

    }

    public static void runTogether(Runnable...tasks){ //for task 9
        for(Runnable t: tasks){
            new Thread(() -> t.run()).start();
        }

    }

    public static void runInOrder(Runnable...tasks){ //for task 9
        for(Runnable t: tasks){
            t.run();
        }
    }
}
