package com.example.demo;

import java.util.*;
import java.util.stream.*;

public class CoreJava {

    public static void main(String[] args) {
        String input = "welcome";
        /*Map<Object, Long> map =  input.chars().mapToObj(x-> (char)x).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        map.entrySet().stream().forEach(x-> System.out.println( x.getKey()+"..."+x.getValue()));*/
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (!result.add(input.charAt(i)))
                System.out.println("duplicates are :" +input.charAt(i));
        }




        /*Integer[]  a = {3,6,8,2,1};

        // Bubble sort easy -- swapping technique
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }*/


 // Selection sort
        //getting the small number index  and doing swapping
       /* int index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }

            int smallNumber = a[index];
            a[index] = a[i];
            a[i] = smallNumber;

        }




        Arrays.asList(a).stream().forEach(System.out::print);*/
    }
}
