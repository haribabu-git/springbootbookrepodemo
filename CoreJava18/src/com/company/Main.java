package com.company;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("hari","IT", 2000L));
        list.add(new Employee("Don","IT", 2000L));
        list.add(new Employee("giri","network", 8000L));
        list.add(new Employee("chandra","support", 2000L));

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Employee e = (Employee) itr.next();
            e.setDept("Admin");
        }

        Map<String,List<Employee>> map =  list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
        Map<String,Long> map1 =  list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getDept));

        map.entrySet().stream().forEach(x-> System.out.println(x.getKey()+"--"+x.getValue()));



        map1.forEach((x,v) -> System.out.println(x+"..."+v));

        List<Employee> employeeList = map.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());

        List<Integer> l = Stream.of(1,3,4,3,5).distinct().collect(Collectors.toList());
        l.forEach(System.out::println);
        /*Long sal = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get()
                       .getSalary();*/

        Long sal = list.stream().max(Comparator.comparing(Employee::getSalary)).get()
                       .getSalary();

        System.out.println("Max salra"+sal);
        list.stream().filter(x->x.getSalary()>3000).map(x->x.getSalary()+(x.getSalary()/10)).collect(Collectors.toList());

        //list.stream().filter(x->x.getDept().equalsIgnoreCase("it")).collect(Collectors.toList()).forEach(System.out::println);



    }
}
