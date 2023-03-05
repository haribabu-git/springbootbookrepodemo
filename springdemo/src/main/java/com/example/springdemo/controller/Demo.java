package com.example.springdemo.controller;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        int number= 126078;

        List<Integer> list = new ArrayList<>();

        while (number >0){

            int x= number % 10;
            number = number /10;
            list.add(x);
        }
        list.sort((x,y) -> -x.compareTo(y));
        int resu = 0;
        for (Integer i:list) {
            resu = resu *10 +i;
            System.out.println(resu);
        }
        System.out.println(resu);
    }
}
