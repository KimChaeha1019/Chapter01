package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine();   //문자열은 nextLine. 대기상태. 사용자가 이름을 입력하면 넘어감
				
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		//키보드 해제
		sc.close();
		
	}

}
