package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//모든 클래스의 부모는 object 클래스 이다
		Goods camera = new Goods();
		camera.hashCode(); //내가 만든 메소드가 아님
						   //부모 클래스의 object 메소드
		
		Object obj = new Object();
		System.out.println(obj.getClass());  	  //class java.lang.Object      클래스정보 
		System.out.println(obj.toString());  	  //java.lang.Object@6e2c634b   출력정보
		System.out.println(obj.hashCode()); 	  //1848402763					0x333 주소라고 생각하자
		System.out.println(obj.equals(camera));   //false						두개가 같냐?
	}

}
