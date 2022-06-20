package com.zensar.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.zensar.entitiy.Employee;

public class WriteObject {

	
	public static void main(String[] args) {
		Employee employee =new Employee(101,"Ram",2300);
		
		ObjectOutputStream oos=null;
		
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream("abc.txt"));
			oos.writeObject(employee);
			System.out.println("object written succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(employee);
	}
	
}
