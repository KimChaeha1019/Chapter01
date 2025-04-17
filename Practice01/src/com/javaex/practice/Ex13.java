package com.javaex.practice;

public class Ex13 {
	
	public static void main(String[] args) {
		
		//다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
		
		System.out.println(13/5);					//(1)
		System.out.println((double)13/5);			//(2)
		System.out.println(13/(double)5);			//(3)
		System.out.println((double)13/(double)5);	//(4)
		System.out.println(13.0/5);					//(5)
		System.out.println(13/5.0);					//(6)
		System.out.println((double)(13/5)); 		//(7)
		
		/*정답 : (1), (7)
		  (1). 13/5는 2.6이다. 하지만 기본적으로 정수의 값으로 표현되기 때문에 2.6이 아닌, 2로 표현이 된다.
		  (7). 먼저 13/5를 계산한 이후에 double로 항변환이 되므로, 13/5의 값인 2를 실수로 항변환시켜도 2.0., 즉 2라는 값이 나온다.
		*/
		
	}

}
