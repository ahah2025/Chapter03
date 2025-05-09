package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(); 
		
		p01.setX(5);	
		p01.setY(10);
		
		//클래스명@숫자
		System.out.println(p01.toString());
		
		
		//print(),println()  은 toString 을 실행한다
		//기본을 toString 을 찍게 되어있음
		System.out.println(p01);
		
		System.out.println(p01.getClass());  //클래스이름     class com.javaex.ex02.Point
		System.out.println(p01.hashCode());  //당분간 주소    531885035
		
		
		System.out.println("=====================================");
		
		System.out.println(p01.equals(p01));
		
		
	}

}

