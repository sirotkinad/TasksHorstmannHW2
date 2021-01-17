package com.mycompany.interfaces.taskfourfive;

public class MainClass {

    public static void main(String[] args) {

        //test task4
        IntSequence seq = IntSequence.of(3, 1, 4, 1, 5, 9);
        while(seq.hasNext()){
            System.out.print(seq.next());
        }

        //test task5
        IntSequence sequence = IntSequence.constant(1);
        while(sequence.hasNext()){
            System.out.print(sequence.next());
        }
    }
}
