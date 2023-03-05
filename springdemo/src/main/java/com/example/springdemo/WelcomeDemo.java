package com.example.springdemo;

import java.util.*;

public class WelcomeDemo {
    public static void main(String[] args) {
        String s  = "WWAWSAWAWS";
        String output = resultMethod(s);
        while (output.contains("AWS")){
            output = resultMethod(output);
        }
        System.out.println(output);

    }
    public static String resultMethod(String s){
        String result = "";
        if (s.contains("AWS")){
            int i = s.indexOf("AWS");
            result = s.substring(0,i);
            result =result+ s.substring(i+3,s.length());
        }
        return result;
    }
}
