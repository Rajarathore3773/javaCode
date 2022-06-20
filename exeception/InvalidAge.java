package com.zensar.Exception;

public class InvalidAge  {

	public static boolean validateAge(int age) {
		if(age<18) return true;
		
		return false;
	}
}
