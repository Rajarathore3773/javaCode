package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.zensar.entitiy.Employee;

public class StreamEmployee {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee(101, "Ram", 1000));
		employee.add(new Employee(102, "Aaksh", 5000));
		employee.add(new Employee(104, "Mohan", 2000));
		employee.add(new Employee(103, "sohan", 4000));
		employee.add(new Employee(105, "Bikash", 3000));
//sort by name

//		Comparator <Employee> comparator =(Employee e1,Employee e2) -> {
//			return e1.getEmployeeName().compareTo(e2.getEmployeeName());
//			};
//			Collections.sort(employee, comparator);	
//			
		// sort name by lamda expression
		System.out.println("=========Sort name by LAmda expression=======");
		Collections.sort(employee, (Employee e1, Employee e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));

		System.out.println("=========Sort name by LAmda expression=======");
		Collections.sort(employee, Comparator.comparing(Employee::getEmployeedSalary));
		System.out.println(employee);

		System.out.println("========Fileter By Salary ==========");
		employee.stream().filter((e) -> e.getEmployeedSalary() > 2000).forEach((e) -> System.out.println(e));
		System.out.println("========Filetr by Id===========");
		employee.stream().filter((e) -> e.getEmployeedId() > 103).forEach((e) -> System.out.println(e));

		System.out.println("====filter by salary without Lambda expression=======");
		employee.stream().filter((e) -> e.getEmployeedSalary() > 2000).forEach(System.out::println);

		System.out.println("====filter by id without Lambda expression=======");
		employee.stream().filter((e) -> e.getEmployeedId() > 2000).forEach(System.out::println);
		
		 System.out.println("===========Map ka Use kr Ke UpperCase me string ki convert karna=====");
		List<String> names = Arrays.asList("Ram","Mohan","Sohan");
		
		List<String> namesInUpperCase=names.stream().map(name ->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesInUpperCase);
		
		System.out.println("===Increase salay by 1000 =====");
		List<Integer> salary=employee.stream().map(e -> e.getEmployeedSalary()+1000).collect(Collectors.toList());
			
		System.out.println(salary);
		
		System.out.println("=====using flate Map==========");
		List<String> a= Arrays.asList("a","b","c");
		List<String> b= Arrays.asList("d","e","f");
		List<String> c= Arrays.asList("g","g","h");
		
		List<List<String>> alpha=new ArrayList<List<String>>();
		alpha.add(a);
		alpha.add(b);
		alpha.add(c);
		List<String> collects =alpha.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(collects);
		
		System.out.println("=======Using Optional Class====");
		String name= "RAja";
		Optional<String> of= Optional.ofNullable(name);
		
		of.ifPresent(e ->System.out.println(e.toUpperCase()));
		of.orElseThrow(()->{
			return new RuntimeException("Hii");
		});
	}

}
