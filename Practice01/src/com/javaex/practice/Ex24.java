package com.javaex.practice;

public class Ex24 {
	
	public static void main(String[] args) {
		
		//다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다. 
		//결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
		
		double f = 80.0;
		//System.out.println(5/9*(f-32.0));
		System.out.println((double)5/9*(f-32.0));
		
		//5/9는 정수로 계산되기 때문에 0이 나온다. 5와 9 중 어느 한쪽을 실수로 형변환 해주면 제대로 된 계산값이 나온다.

		
	}

}
