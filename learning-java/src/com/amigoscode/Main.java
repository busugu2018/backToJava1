package com.amigoscode;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub (write code here)
			
		String name = new String("amigosCode");
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(1));
		
		String code = new String("Code");
		System.out.println(name.contains(code));
		
		String code1 = new String("code");
		System.out.println(name.contains(code1));	
		
		String code2 = new String("ami");
		System.out.println(name.contains(code2));
		
		String pieceOfCode1 = new String("gosCo");
		System.out.println(name.contains(pieceOfCode1));
		
		String code3 = new String("ami");
		System.out.println(code1.contains(code3));	
		
		String code4 = new String("ami");
		System.out.println(code1.contains(code3));		
	} 

}
