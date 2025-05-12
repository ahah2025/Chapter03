package com.javaex.ex07;

public class Ex01 {

	//일반메소드
	public static void main(String[] args) {

		int a =3;  //기본
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum);
		
		//박싱
		Integer v01 = 3;        //new Integer(3) 으로 맞춰줌    '박싱(박스 작업함)'
		System.out.println(v01.toString());
			
		Integer i01 = new Integer(999);  // i01 은 주소
		int b = i01;					 //언박싱					
		System.out.println(b);
	
		System.out.println("----------------------------");
		
		//Integer r01 = new Integer(100);
		Integer r01 = 100;  //박싱
		int result = r01.parseInt("12345");
		System.out.println(result + 3);
								  //문자열을 숫자(3)로 자동변환해줌
		
		
		
		
		
	}

}
