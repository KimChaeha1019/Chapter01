package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args){
		
		//일반적인 방식
		double pi = 3.14;
		
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값 변경가능. 맨처음 저장소를 만들 때 double을 쓴 것, 아래의 경우에는 이미 만든 pi저장소에 접근하는 것이라 오류가 뜨지 않았음.
		//double을 또 쓰고 같은 이름을 주면 동명의 저장소를 만드는 것이기 때문에 오류 남
		pi = 3.141512;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수로 정의하는 방식
		final double PI = 3.14; //상수로 정의할때는 보통 대문자로 표기
		
		double result03 = PI*5*5;
		System.out.println(result03);
		
		/*
		//상수의 값을 변경하려고 하면 에러 발생
		PI=3.1415926; //PI는 상수로 선언 변경시 에러발생
		double result04 = PI*5*5;
		System.out.println(result04);
		*/
	}

}
