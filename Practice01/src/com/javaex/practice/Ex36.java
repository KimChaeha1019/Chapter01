package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int c500 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int c100 = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int c50 = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int c10 = sc.nextInt();
		
		int sum = c500*500 + c100 *100 + c50*50 + c10*10;
		
		System.out.println("동전의 총합은 " + sum + " 원 입니다.");
		
		sc.close();
		
	}

}
