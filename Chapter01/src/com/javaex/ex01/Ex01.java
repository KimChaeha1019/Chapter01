package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args){
		
		int myAge; //선언
		
		myAge = 25; //초기화
		
		System.out.println(myAge); //화면출력
		
		myAge = 26;
		
		System.out.println(myAge);
		
		/********************************/
		
		byte no;
		
		no = 127;	//byte -128~127까지만 가능
		
		System.out.println(no);
		
		/********************************/

		/*long형
		 * int 범위까지는 L을 붙이지 않아도 된다
		 * int 범위를 벗어나는 경우 L을 붙인다
		 * ==>L을 붙여서 쓴다
		 */
		long no2;
		
		/*no2 = 2147483648;*/
		no2 = 2147483648L;
		
		System.out.println(no2);
		
		}
}
