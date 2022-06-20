package com.zensar.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.zensar.entitiy.Employee;



public interface Addition {
 public int add(int a,int b);
 public default int sub(int a,int b) {
	 return a-b;
 }
}

//class  AddtionImpl implements Addition{
//
//	@Override
//	public void add(int a,int b) {
//		// TODO Auto-generated method stub
//		System.out.println("Adding !!");
//	}
//	
//}

class  TestAdd{
	public static void main(String[] args) {
		List<String > names = new ArrayList<>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Mohiot");
		names.add("Rohit");
		//Using For Each method introduce java 1.8 
		names.forEach(  name ->System.out.println(name));
		
		names.forEach( Employee :: printEmployee);
//		Addition addition = new AddtionImpl();
//		addition.add();
//		
//		System.out.println("=======using Inner class ==========");
//		Addition addition = new Addition() {
//
//			@Override
//			public void add() {
//				// TODO Auto-generated method stub
//				System.out.println(" inner Class work Adding!!");
//			}
//			};
//			addition.add();
		
		System.out.println("=========using Lamda Expression===");
		
		
//		Addition addition=(int a,int b ) ->{
//			System.out.println("Lamda Expression Adding!!=" +a+b);
//			//String ke bad integer add karte vo bydefault "concat method" ko call karta h or output String me deta h
//			System.out.println("Lamda Expression Adding!!=" +(a+b));
//		};
		// another lambda expression using
		Addition addition=(a,b ) -> a+b;
		System.out.println("addition :"+addition.add(20,10));
		System.out.println("substraction :"+addition.sub(10, 5));
		
		// using predicate interface
//	Predicate <Integer>	p=(i) ->{
//			if(i==0) {
//				return true;
//			}else {
//				return false;
//			}
//		};
		System.out.println("=========using Lamda Expression for Predicate Interface===");
		Predicate <Integer>	p=(input) ->input % 2==0;
		System.out.println(p.test(0));
		
		System.out.println("=========using Lamda Expression for Consuemr Interface===");
		Consumer <String> c=(String name ) ->System.out.println(name);
		c.accept("Ram");
		
		System.out.println("=========using Lamda Expression for Suplier Interface===");
		Supplier <Integer> s=( ) -> 6;
		Supplier <String> s1=( ) -> "Hii Raja";
		System.out.println(s.get());
		System.out.println(s1.get());
		
		System.out.println("=========using Lamda Expression for Function Interface===");
	Function<Integer,String> f= (i)->{
		return "hello";
	};
	System.out.println(f.apply(10));
	}
}