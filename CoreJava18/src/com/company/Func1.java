package com.company;

@FunctionalInterface
public interface Func1 {
    public abstract void welcome();
    public default void wel(){
        System.out.println("method is implemented");
    }
}
