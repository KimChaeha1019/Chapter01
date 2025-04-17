package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//자동형변환
		double var01 = 2+3.5; //2-->2.0으로 <자동 형변환>됨
		System.out.println(var01);
		
		double var02 = 3.0 + 6; //6-->6.0으로 <자동 형변환>됨
		System.out.println(var02);
		
		long var03 = 12345L;
		float var04 = 1.5F;
		
		float result01 = var03 + var04;
		System.out.println(var01);
		
		//강제형변환//
		float var05 = 111.1019F;
		int var06 = (int)var05; //111.1019 --> 111 강제변환
		System.out.println(var06);
		
		//강제형변환-확대(byte(1)->int(4))//
		byte var07 = 10;
		System.out.println(var07);
		
		int result02 = (int)var07;
		System.out.println(result02);
		
		//강제형변환-축소(int(4)->byte(1))//
		int var08 = 10;
		System.out.println(var08);
		
		byte result03 = (byte)var08;
		System.out.println(result03);
		
		//강제형변환-축소(int(4)->byte(1))//
		int var09 = 203029770;
		System.out.println(var09);
		
		byte result04 = (byte)var09;
		System.out.println(result04);
		
		//강제형변환-(실수->정수)//
		double var10 = 5.57;
		System.out.println(var10);
		
		int result05 = (int)var10;
		System.out.println(result05); //소수점 없이 이용할 수 있음
		
		//강제형변환-(정수->실수)
		int var11 = 7;
		System.out.println(var11);
		
		double result06 = (double)var11;
		System.out.println(result06);
		
	}
}
