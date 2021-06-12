package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
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
		
		
		// Arrays
		
		int zero =  0;
		int one = 1;
		
		int [] numbers = new int[3];
		
		boolean [] numbers1 = new boolean[3];
		boolean [] numbers2 = new boolean[5];
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers2));
		
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 1;
		System.out.println(Arrays.toString(numbers));
		
		numbers[0] = 190;
		numbers[1] = 0;
		numbers[2] = -94495;
		System.out.println(Arrays.toString(numbers));
		
		//other ways to write them
		int [] numbers3 = {3,2,5,8};
		int [] numbers4 = {9,5,66,787,23};
		
		System.out.println(Arrays.toString(numbers3));
		System.out.println(Arrays.toString(numbers4));
		System.out.println(numbers4.length);
		
		
		
		/// String Arrays
		String [] name = new String[] {"Jo","Bill", "Hank"};
		
		//or
		String [] name1 = {"John", "Vega", "Krys", "Doucie"};
		
		System.out.println(Arrays.toString(name));
		System.out.println(name.length);
		System.out.println(name[0]);
		System.out.println(name[2]);
		System.out.println(name[1].toUpperCase());
		
		System.out.println(Arrays.toString(name1));
		System.out.println(name1.length);
		System.out.println(name1[0]);
		System.out.println(name1[3].toCharArray());
		System.out.println(name1[2].toUpperCase());
		
		
		//Arrays and Index
		
		int [] num = {19,8384,73,288,39};
		int oneHundred = num[4];
		int four = num[3];
		System.out.println(oneHundred);
		System.out.println(four);
		
		// LOOPS ++ AND --
		
		int [] num1 = {1,8,734,89,27439,762,74};
		
		int num2 = 0;
		num2 = num2+1;
		System.out.println(num2);
		
		int num3 = 18630;
		num3 = num3+1;
		System.out.println(num3); 
		
		int num4 = 0;
		num4 = num4-1;
		System.out.println(num4);
		
		int num5 = 0;
		num5 = num5-5;
		System.out.println(num5);
		
		int num6 = 1;
		num6 = num6--;
		System.out.println(num6);
		
		int num7 = 0;
		num7 -= 1;
		System.out.println(num7);
		
		int num8 = 0;
		num8 -= 6;
		System.out.println(num8);
		
		int num9 = 0;
		num9 += 3;
		System.out.println(num9);
		
		
		//LOOP for ENHANCEMENT
		
		System.out.println("//price1 example below");
		int [] price1 = {1,3,4,5};
		for (int i=1; i<price1.length; i++) {
			System.out.println(price1[i]);
		}
		
		System.out.println("//price2 example below");
		int [] price2 = {1,3,4,5};
		for (int i=0; i<price2.length; i++) {
			System.out.println(price2[i]);
		}
		
		System.out.println("//price3 example below");
		int [] price3 = {0,1,3,4,5,374,48,900,2,4,-98,-647,-2,2,67,934,-394,334};
		for (int i=69; i<price3.length; i++) {
			System.out.println(price3[i]);
		}
		System.out.println("//price3 example is empty because [i=69 is not less than price3 length which is 18]");
		
		System.out.println("//price4 example below");
		int [] price4 = {0,1,3,4,5,374,48,900,2,4,-98,-647,-2,2,67,934,-394,334};
		for (int i=7; i<price4.length; i++) {
			System.out.println(price4[i]);
		}
		
/*		System.out.println("//price5 example below");
		int [] price5 = {0,1,3,4,5,374,48,900,2,4,-98,-647,-2,2,67,934,-394,334};
		for (int i=69; i<70; i++) {
			System.out.println(price5[i]);
		}
*/
		
		
		System.out.println("//nameA example below");
		String [] nameA = {"Joke", "Booba", "K9"};
		for (String nameB : nameA) {
			System.out.println(nameB);
		}
		
		//Other ways of writing for loops
		System.out.println("///Other ways of writing for loops");
		int [] nombre = {27,023,84};
		Arrays.stream(nombre).forEach(System.out::println);
		Arrays.stream(nameA).forEach(System.out::println);
		
		
		//Break and Continue
		
		String [] nameC = {"Jo","Gin","Guy"};
		for (String nameD : nameC) {
			System.out.println(nameD);
			break;
		}
		System.out.println("/// [nameD : nameC] ");
		for (String nameD : nameC) {
			if (nameD.equals("Gin")) {
				break;
			}
			System.out.println(nameD);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
