package com.zensar.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import com.zensar.entitiy.Employee;

public class ReadObject {

	public static void main(String[] args) {
		ObjectInput ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("abc.txt"));
			Employee e1 = (Employee) ois.readObject();
			
			System.out.println(e1);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
