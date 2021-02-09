package com.test;

public class LoopTest {

	public static void main(String[] args) {
		String msg = "hello";
		
		//for(초깃값; 조건식; 증감식)
		for(int i=0 ; i<5 ; i++) {
			//System.out.println(i + "." + msg);
			
			//printf("출력할 값의 형식", 출력할 값)
			System.out.printf("%d.%s\n",i,msg);
		}

		//while
		int num = 0 ; //초기값
		
		while(num < 5 ) {
			System.out.println("gogogo~");
			num++;//증감식+
		}
		
		//do~while
		int code = 0;
		
		do {
			System.out.println("welcome~");
			code++;
		}while(code<5);
		
	}

}
