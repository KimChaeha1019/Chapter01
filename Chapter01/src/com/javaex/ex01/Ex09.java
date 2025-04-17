package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//관계연산자
		int a =5;
		int b =3;
		
		System.out.println(a<b);  //5<3 => false
		System.out.println(a>b);  //5>3 => true
		
		System.out.println(a<=b);  //5<=3 => false
		System.out.println(a>=b);  //5>=3 => true
		
		System.out.println(a==b);  //5=3 => false, = 하나만 붙이면 왼쪽값에 오른쪽 값을 대입하라는 뜻. (5=3 3을 5에 대입해라)
		System.out.println(a!=b);  //5와 3이 다른 값인가? true
		
		boolean result = a==b;
		System.out.println(result);
		
		
	}

}
