package com.javaex.ex01;

public class Ex11 {
	
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;	
		System.out.println("&& 연산자(엄격)---------------");
		
		System.out.println(true && true);    //t && t true
		System.out.println(false && false);  //f && f false
		
		System.out.println(true && false);   //t && f false
		System.out.println(false && true);   //f && t false
		
		System.out.println("|| 연산자(널널, 인자하다)---------------");
		
		System.out.println(true || true);  //true || true true
		System.out.println(true || false);  //true || false true
		System.out.println(false || true);  //false || true true
		System.out.println(false || false); //false || false false
		
		System.out.println("|| 연산자(반대)---------------");
		System.out.println(!true);  // false
		System.out.println(!false);  // true
		
		System.out.println("|| 응용---------------");
		boolean result = (a<b) && (a>b);  //5<7 && 5>7 => t && f ==>false
		System.out.println(result);
		
		System.out.println(true && false || true);  // t&&f||t > f||t > t
		System.out.println(true || false || true);  // t||f||t > t||t > t
		
		System.out.println( !(a>b) );  //5>7 false  !f=>t
		
		
		
	}

}
