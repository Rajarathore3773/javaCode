package com.zensar.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateAPIDemo {

	public static void main(String[] args) {
//		LocalDate date=  LocalDate.now();
//		System.out.println(date);
		
		LocalDate date  = LocalDate.of(2022,03,04);
		date=date.plusMonths(2);
		date=date.minusMonths(1);
		//date = date.atTime();
		System.out.println(date);
		
		
		//ZoneId id = ZoneId("Hongkong");
		LocalTime time = LocalTime.now();
		
			time = time.withHour(1);	
			System.out.println(time);
			
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	
	

	
	
	LocalDate birthDate = LocalDate.of(1999, 12, 12);
	LocalDate currentDate = LocalDate.now();
	
	Period period = Period.between( birthDate,currentDate);
	System.out.println(period);
	System.out.println("you are "+period.getYears()+" years and "+period.getMonths()+" months and "+period.getDays()+"days old");
	
  
	}	
}
