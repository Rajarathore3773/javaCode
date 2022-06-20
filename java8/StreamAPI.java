package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Virat");
		names.add("Rohit");
		names.add("Mahi");
		names.add("Ravindra");
		names.add("sachin");
//		for (String s : names) {
//			if (s.startsWith("R")) {
//				System.out.println(s);
//			}
//		}
		
		//names.stream().filter(name -> name.startsWith("R")).forEach(name ->System.out.println(name));
		
		List<String> nameWithR = names.stream().filter(name ->name.startsWith("R")).collect(Collectors.toList());
		System.out.println(nameWithR);
		//for loop k liye 
		IntStream.iterate(1, n-> n+1).limit(10).forEach(i ->System.out.println(i));
		// find minimum element
		int[] a = { 4, 3, 7, 1, 9, 6 };
		IntStream stream=Arrays.stream(a);
		System.out.println("Minimum value in array "+stream.min().getAsInt());
		
		System.out.println("======= sorted by accendeing order ====");
		IntStream stream1=Arrays.stream(a);
		stream1.sorted().forEach(c-> System.out.println(c));
		
		System.out.println("======= sorted by dccendeing order ====");
		IntStream stream2=Arrays.stream(a);
		List<Integer> collect = stream2.boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
}
}