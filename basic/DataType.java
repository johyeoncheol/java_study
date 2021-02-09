package com.test;

public class DataType {
	public static void main(String[] args) {
		//논리형: boolean
		//flag: 변수 (어떤 값을 저장하는 저장소)
		boolean flag = true;
		
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//실수  > 정수
		
		// 정수형
		byte b = 12; //byte : -128 ~ 127
		short s = 1000; //
		int num = 100; // int : -21억  ~ +21억
		long l = 99999999;
		
		b = 10;
		//정수 리터럴의 경우 vm이 4byte에 저장하고 있음
		// b => 1byte 1 => 4byte  결과는 4byte로 된다.
		//b = b+1; // 오류
		int b2 = b +1;
		b = (byte)(b+1);
		
		//literal(값) : 정수 리터럴 , 실수 리터럴...
		// 실수형
		float f = 1.2f;
		double point = 3.14;
		f= (float)point;//원하는 데이터 타입 -> 형변환
		point = f;
		
		// 문자형 : 한글자 저장
		char code = 'a';
		code = 'x';
		code = 97; // 글자의 code 값으로 인식
		
		//String(문자열) : 참조형
		String name ="kim";
		
		System.out.println(num);
		System.out.println(code);
		System.out.println(flag);
		
		System.out.printf("%d\n%s\n%s\n",num,code,name);
	}
}
