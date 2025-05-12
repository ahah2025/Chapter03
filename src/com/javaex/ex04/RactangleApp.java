package com.javaex.ex04;

import java.util.Scanner;

public class RactangleApp {

	public static void main(String[] args) {
		//각각의 width, height 값이 같으면 같은것 

		Ractangle a = new Ractangle(6,4); 
		Ractangle b = new Ractangle(6,4);
		Ractangle c = new Ractangle(12,2);
	
		//com.javaex.ex04.Ractangle@443
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //false
		
	}
}
