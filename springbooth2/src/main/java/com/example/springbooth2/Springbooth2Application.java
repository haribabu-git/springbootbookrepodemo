package com.example.springbooth2;

import com.example.springbooth2.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.*;

import java.util.*;
import java.util.stream.*;

@SpringBootApplication
public class Springbooth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbooth2Application.class,args);


	/* String input = "welcomew";
	Map<Character,Long> map= input.chars().mapToObj(x->(char)x).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

	map.entrySet().stream().filter(x->x.getValue()>1).forEach(x-> {
		System.out.println(x.getKey());
	});*/

		/*List<Character> list = new ArrayList<>();

		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}

		System.out.println(list);

		Set<Character> set = new HashSet<>();
		for (Character c:list) {
			if (!(set.add(c)))
				System.out.println(c);
		}*/

		/*List<Employee> list = new ArrayList<>();
		list.add(new Employee("jilan","IT"));
		list.add(new Employee("hari","csc"));
		list.add(new Employee("giri","IT"));
		list.add(new Employee("chand","Admin")); /// dept name -- count Map

		Map<String,Long> map =list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));

		map.forEach((x,y) -> System.out.println(x+"...."+y));
*/

	}

}
