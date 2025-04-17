package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	
	public static void main(String[] args) {
		
		//반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요. (파이값은 3.14로 상수로 지정)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		
		double round = sc.nextInt();
		
		System.out.println("원의 넓이는 " + round*round*3.14);
				
		sc.close();
		
	}

}
