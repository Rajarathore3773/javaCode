package com.zensar.Exception;

import java.util.Scanner;
import com.zensar.Exception.*;
public class Voiting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your age :");
	    int age =sc.nextInt();
		try{
			if(InvalidAge.validateAge(age))
				throw new Exception("Age is less Then 18 You can't Vote");
			System.out.println("You can Vote");
		}
		catch(Exception e ){
			System.out.println(e);
		}
		finally
		{
			System.out.print("completed");
		}
	}
}
