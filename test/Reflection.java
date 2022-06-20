package com.zensar.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) {
		try {
			Class className = Class.forName("com.zensar.entitiy.Employee");
			
			Method[] methods = className.getMethods();
			for(int i=0;i<methods.length;i++) {
				System.out.println(methods[i]);
				}
			Constructor []	constructor=className.getConstructors();
			for(int i=0;i<constructor.length;i++) {
				System.out.println(constructor[i]);
				}
			
			Field [] fields	=className.getFields();
			for(int i=0;i<fields.length;i++) {
				System.out.println(fields[i]);
				}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}
}
