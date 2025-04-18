package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		
		//괄호 안쪽에서 생성된 변수는 괄호가 끝나면 사라진다.
		//따라서 if문 밖에서도 사용할 변수는 if문 밖에서 선언한다.
		int sum;
		
		if(time <= 8) {
			sum = time*10000;    //괄호안에서 생성된 것들은 괄호가 끝나면 사라진다.
			
		} else {
			sum = 8*10000 + (time-8)*12000;
		}
		
		System.out.println("임금은 " + sum + "원 입니다.");
		
		sc.close();

	}

}
