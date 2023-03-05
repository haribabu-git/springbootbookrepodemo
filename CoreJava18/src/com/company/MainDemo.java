package com.company;

import java.nio.charset.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MainDemo {

    public static void main(String[] args) {
        String s = "welcome";

        List<Character> l = s.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        System.out.println(l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        Map<Character,Integer> map = new HashMap<>();
        char c[] =  s.toCharArray();
        for (char cch:c) {
            map.put(cch, countOfChar(cch,s));
        }
        System.out.println(map);



    }

    static int countOfChar(char ch,String s){
//        int count = 0;
//        for (int i = 0; i < s.length() ; i++) {
//            if(ch == s.charAt(i)) count++;
//        }
//        return count;
        return (int) s.codePoints().filter(cha->cha== ch).count();
    }


} /*implements Func1,Func2{
    @Override
    public void welcome() {

    }

    @Override
    public void wel() {
        Func1.super.wel();
    }

    public void call(){
        Func1.super.wel();
    }


    @Override
    public void welcome1() {

    }
}*/
