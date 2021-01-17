package com.mycompany.interfaces.taskfourfive;

import java.util.Arrays;

public interface IntSequence {

    default boolean hasNext(){
        return true;
    }
    int next();

    static IntSequence of(int...arguments){
        return new IntSequence(){

            int i = 0;
            final int[] elements = Arrays.copyOf(arguments, arguments.length);

            @Override
            public boolean hasNext() {
                return i < elements.length;
            }

            @Override
            public int next() {
                    return elements[i++];
            }
        };
    }

    static IntSequence constant(int number){
       return new IntSequence(){

           @Override
           public int next() {
               return number;
           }
       };

    }

}
