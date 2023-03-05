package com.company;

@FunctionalInterface
public interface Func2 {
    public abstract void welcome1();
    public default void wel(){
        System.out.println("method is implemented222");

    }
}
