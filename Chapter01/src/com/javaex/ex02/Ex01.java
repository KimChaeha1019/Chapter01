package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("---------------");
		
		int i = 12345;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "황일영";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(3+5);
		System.out.println(5/3);
		
		System.out.println("굿모닝"+"황일영");
		System.out.println(str + name);
		System.out.println(str + name + str);
		 
		System.out.println(i+i);  //정수+정수
		System.out.println(i+d);  //정수+실수 =>실수(자동형변환)+실수
		System.out.println(str + i);
		System.out.println(str + d);
		
		String result = name + d;  //문자열+정수=>문자열, 문자열+실수=>문자열
		System.out.println(result);
		
		//굿모닝랑황일영
		System.out.println(str+"랑"+name);
		
		//굿모닝 랑 황일영
		System.out.println(str+" 랑 "+name);
		
		//굿모닝 황일영
		System.out.println(str+" "+name);
		
		//제이름은 황일영 입니다.
		System.out.println("제이름은 "+name+" 입니다.");
		
		System.out.println("----------------------------");
		System.out.println(c);  //한
		System.out.println(c+c);//한한
		//char형은 코드값 숫자로 관리하기 때문에 붙여서 조합하면 코드로 인식해버린다
		
		//제이름은 "황일영" 입니다.   \"
		System.out.println("제이름은 \""+name+"\" 입니다.");
		
		//제이름은 \황일영\ 입니다.    \\
		System.out.println("제이름은 \\"+name+"\\ 입니다.");
		
		//제이름은		황일영	입니다.  \t   탭으로 넓히면 글자수가 늘어나도 간격이 밀리지 않음
		System.out.println("제이름은\t"+name+"\t입니다.");
		System.out.println("나의이름은\t"+name+"\t입니다.");
		
		//제이름은	
		//황일영	
		//입니다.  /n
		System.out.println("제이름은\n"+name+"\n입니다.");
		
		
		
		
		
	}

}
