package com.amigoscode;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub (write code here)
		
		String name = new String("Amigoscode");
		System.out.println(name.toUpperCase());
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getYear());
		
	}

}
