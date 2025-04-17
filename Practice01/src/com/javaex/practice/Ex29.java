package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	
	public static void main(String[] args) {
		
		//직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(가로 세로 변수 double형으로 작성)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");	
		double wd = sc.nextDouble();
		
		System.out.print("세로를 입력하세요: ");
		double ht = sc.nextDouble();
		
		System.out.println("사각형의 넓이는 "+ wd*ht);
		System.out.println(("사각형의 둘레는 ") + ( wd*2 + ht*2));
		
		
		sc.close();
		
	}

}
