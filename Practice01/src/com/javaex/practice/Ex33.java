package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double round = sc.nextDouble();
		
		System.out.println("구의부피는: " + (((4/3)*3.14)*(round*round*round)) + "입니다.");
		
		sc.close();
		
	}

}
