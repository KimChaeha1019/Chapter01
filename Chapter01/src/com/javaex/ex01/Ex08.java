package com.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//대입연산자 =
		int a = 7;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-------------------");
		
		
		//산술연산자
		int sum = a + b;         // +
		System.out.println(sum); // +
		System.out.println(a+b); // +
		System.out.println(a-b); // -
		System.out.println(a*b); // *
		System.out.println(a/b); // 7/2 ->(3)...1 정수로 표현된다
		System.out.println(a%b); // 7/2 ->3...(1) 나누고 떨어지지 않은 나머지값이 표현된다
		
		System.out.println(7/2); //3 정수/정수=>정수
		System.out.println(7.0/2); //7.0/2.0=>3.5
		System.out.println(7.0/2.0); //7.0/2.0=>3.5
		
		System.out.println("-------------------");
		
		
		//부호연산자
		int var = -3;		
		int pVar = -var; //-(-3) => 3
		System.out.println(pVar);
		
		int mVar = +var; //+(-3) => -3
		System.out.println(mVar);
		
		
		//증감연산자
		System.out.println(a);  //7
		System.out.println(++a); //7->8 원래 값에서 하나 올리라는 뜻. 값을 올린 후, 출력
		System.out.println(a);  //7 ++은 실제 저장된 메모리값을 바꿔버린다
		
		System.out.println(b); //2
		System.out.println(--b); //1
		System.out.println(b); //1 --는 실제 저장된 메모리값을 바꿔버린다
		
		System.out.println("-------------------");
		System.out.println(a); //8
		System.out.println(a++); //8 출력먼저 후, 값을 올림
		System.out.println(a); //9
		
		System.out.println(b); //1
		System.out.println(b--); // -1, 출력
		System.out.println(b); //0
		
		//증감연산자는 해야할 일을 나열. 가장 먼저, 가장 나중에 할 지 결정.
		System.out.println("-------------------");
		
		int c = 5;
		
		System.out.println(c); //5
		System.out.println(++c*2); //12
		System.out.println(c); //6
		
		int d = 5;
		
		System.out.println(d); //5
		System.out.println(d++*2); //10
		System.out.println(d); //6
	
		
		
		
		
	}

}
