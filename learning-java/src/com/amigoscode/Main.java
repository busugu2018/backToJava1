package com.amigoscode;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub (write code here)
		
		int a = 10;
		int b = a;
		a = 100;
		
		System.out.println("a = " + a + " - b = " + b);
		
		Person alex = new Person ("alex");
		Person mariam = alex;
		
		System.out.println("Before changing alex");
		System.out.println(alex.name + " " + mariam.name);
		
		alex.name = "alexander";
		
		System.out.println("After changing alex");
		System.out.println(alex.name + " " + mariam.name);		
		
		System.out.println("No Worries");
	}
	
	static class Person {
		String name;
		Person(String name){
			this.name = name;
	//Impo
		}
	} 

}
