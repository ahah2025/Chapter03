//Integer.parselnt("문자열"{...}
//String.valueOf(정수){...}
//String.valueOf(실수){...}

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
		
		//덜 좋은 방식--> 필요없는 99를 넣어야 한다
		//Integer r01 = new Integer(99);
		Integer r01 = 100;  //박싱
		int result = r01.parseInt("12345");   //"123456"  --> 12345
		
		System.out.println(result + 3); 
		//12345+3 --> "12345"문자열을 숫자로 변환후 3이라는 숫자를 더해 '12348'이라는 결과값이 보임
		
		//조금더 좋은 방식 (문자열-->숫자(정수)) static 공부
		int result02 = Integer.parseInt("12345"); 
		System.out.println(result02 + 1);
		
		///////////////////////////////////////////
		//정수 --> 문자열      12345 --> "12345"
		
		//덜 좋은 방식--> 필요없는 "안녕"를 만들어야 한다
		String s = new String("안녕");
		String sNum = s.valueOf(12345);
		System.out.println(sNum+1);
		
		//조금 더 좋은 방식 (정수--> 문자열)  static 공부
		String sNum2 = String.valueOf(12345);
		System.out.println(sNum2 + 1);
	
		//                 (실수--> 문자열) static 공부,메소드 오버로딩    
		String sNum3 = String.valueOf(12345.3343);
		System.out.println(sNum3 + 1);
		
		//숫자-->문자열
		//System.out.println(12345 + "1");
		String sNum4 = ""+ 999;
		System.out.println(sNum4 + 1);
	}

}
