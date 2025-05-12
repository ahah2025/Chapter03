package com.javaex.ex05;

public class RectangleApp {

	public static void main(String[] args) {
		//각각의 width, height 값이 같으면 같은것

		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);
				
		//com.javaex.ex04.Rectangle@2f92e0f4 이런식으로 안나오게 하기
		System.out.println(a);   
		System.out.println(b);   
		System.out.println(c);   
			
		System.out.println(a.equals(b));    //true
		System.out.println(a.equals(c));    //false
		
		/*
		//구해지는 면적이 같으면 두 객체가 같은 것으로 정의

		Rectangle a = new Rectangle(6,4); 
		Rectangle b = new Rectangle(6,4);
		Rectangle c = new Rectangle(12,2);
		Rectangle d = new Rectangle(3,8);
		Rectangle e = new Rectangle(12,4);
	
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //false
		System.out.println(a.equals(d)); //false
		System.out.println(a.equals(e)); //false
		System.out.println(d.equals(e)); //false
		*/
	}
}
