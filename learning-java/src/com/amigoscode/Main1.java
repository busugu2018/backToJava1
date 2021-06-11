package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.Month;
import java.time.ZoneId;
import java.sql.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Packages and Import keywords
		
		//Date: nameDay Month Day h:m:s timeZone Year
		Date date = new Date();
		
		//LocalDate localDate Y-M-D;
		LocalDate date1 = LocalDate.now();
		
		//javaSQL date ?
		java.sql.Date date2 = new java.sql.Date(1);
		
		
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);
		
		
		//Arithmetic
		
		System.out.println(10+2+3);
		System.out.println(10-2);
		System.out.println(10%5);
		System.out.println(10%5%2);
		System.out.println(567*283);
		
		// Class Math
		System.out.println(Math.abs(-1));
		System.out.println(Math.max(3.6, 10.11));
		System.out.println(Math.min(47.23, 827.34));
		System.out.println(Math.pow(56, 2));
		System.out.println((int) Math.min(94, 0394.238));
		System.out.println((double) Math.cosh(90));
		System.out.println((short) Math.floorDiv(3, 84));
		
		
		//comparisons
		
		
		int Maroundou = 29;
		int Jalissa = 32;
		int Nziengui = 30;
		int Greg = 30;
		
		System.out.println(Maroundou > Jalissa);
		System.out.println(Greg < Maroundou);
		System.out.println(Nziengui == Greg);
		System.out.println(Nziengui >= Greg);
		System.out.println(Nziengui <= Greg);
		System.out.println(Nziengui != Jalissa);
		
		//Logical Operators
		
		boolean isAdult = false;
		boolean isStudent = true;
		System.out.println(isAdult && isStudent);
		System.out.println(isAdult || isStudent);
		System.out.println(!isAdult || isStudent);
		System.out.println(!isAdult && isStudent);
		System.out.println(10>2 & (isAdult || isStudent));
		System.out.println(((10%2)>(10%3-2)) && ((38.3*3)!=(12%4)));
		
		
		//if statement
		
		
		int age = 17;
		if (age >= 18) {
			System.out.println(isAdult);
			System.out.println("Can get an apt");
		}
		
		if (age<18) {
			System.out.println(!isAdult);
			System.out.println("You can't rent a place for yourself, you'll need a parent permission.");
		}
		
		
//		int boussougouJeanPierre = 69;
//		int igabouhiEme = 49;
//		int nzienguiBoussougou = 31;
//		int boussougouKouvass = 23;
		
		
		int yob = 1963;
		
		if (yob >= 1946 && yob <= 1964 ) {
			System.out.println("You belong to Baby boomers.");
		}else if (yob > 1964 && yob <= 1980){
			System.out.println("You belong to Gen X.");
		} else if (yob > 1980 && yob <= 1996){
			System.out.println("You belong to  Gen Y");
		} else if (yob > 1996 && yob <= 2022){
			System.out.println("You belong to Gen Z");
		} else {
			System.out.println("Don't count on our timeline");
		}
		
		
		

		
		
		int bodyCount = 19;
		
		if ( bodyCount <= 3) {
			System.out.println("She's a good girl");
		} else if (bodyCount > 3 && bodyCount <7) {
			System.out.println("Relax baby girl... 👀");
		} else if (bodyCount > 7 && bodyCount <12) {
			System.out.println("The mission changed baby girl. I'm on a mission.");
		} else {
			System.out.println("She ain't mine, can't touch that, she belongs to the streets.");
		}
		
		
		// SWITCH STATEMENT
		
		String gender = "FEMALE";
		
		//1
		
		if (gender.equals("FEMALE")) {
			System.out.println("I'm a FEMALE.");
		} else if(gender.equals("MALE")) {
			System.out.println("I'm a MALE.");
		} else if(gender.equals("Not to Say")) {
			System.out.println("I prefer not to say.");
		} else {
			System.out.println("Unknown gender.");
		}
		
		
		//2
		
		switch (gender){
			case "FEMALE":
				System.out.println("I'm a FEMALE.");
				break;
			case "Male":
				System.out.println("I'm a MALE.");
				break;
			case "Prefere not to say":
				System.out.println("I prefer not to say.");
				break;
			default:
				System.out.println("Unknown gender.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
