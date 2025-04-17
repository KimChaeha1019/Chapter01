package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		
		int old = sc.nextInt();
		
		sc.nextLine(); //에러

		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + old + " 입니다.");
		
		//키보드 해제
		sc.close();				
		
	}

}
