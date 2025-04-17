package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4;  //1.25->1.0
		System.out.println(v01); //5/4-> 정수형(연산)정수형=>정수형
		
		double v02 = (double)5/4; //5.0/4->1.25
		System.out.println(v02);  //5.0/4<실수와 정수이기 때문에 사실은 연산이 X. 계산이 되도록 강제 형변환 한 것에 맞춰 자동 형변환된 것
			
		double v03 = 5/(double)4; //5/4.0 ->1.25
		System.out.println(v03);  //종족이 다르기 때문에 실은 연산이 X. 계산이 되도록 강제 형변환 한 것에 맞춰 자동 형변환된 것
		
		double v04 = (double)5/(double)4;  //5.0/4.0->1.25
		System.out.println(v04);
		
		int v05 = (int)1.3+(int)1.8;  //1+1 ->2
		System.out.println(v05);
			
		double v06 = (int)1.3+1.8;  //1+1.8 -> 1.0+1.8
		System.out.println(v06);		
		
		
	}

}
