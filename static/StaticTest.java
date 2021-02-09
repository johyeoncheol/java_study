package com.basic;

public class StaticTest {

	// static field
	int count; //인스턴스(객체) 변수
 	// static인 경우 글자체가 누워있다.
	//1. static는 클래스 변수, 여러 객체에서 공유해서 사용 (1개 만들어짐)
	static public int scount = 999;

	public static void go() {//2. STATIC METHOD
		System.out.println("hello, static");
	}
	
	//3. STATIC BLOCK{} // 메인보다 더 먼저 실행이 된다.
	static {
		System.out.println("static block-1");
	}
	
	public static void main(String[] args) {
		//public가 아니라서 오류!
		//Math m = new Math();
		System.out.println(Math.pow(2,3));
		
		//객체 생성 할 필요 없이 클래스 이름으로 바로 사용 가능
		System.out.println(StaticTest.scount);
		StaticTest.go();
		//System.out.println(count);
		
//		StaticTest s1 = new StaticTest();
//		StaticTest s2 = new StaticTest();
//		StaticTest s3 = new StaticTest();
//
//		System.out.println(++s1.count + "--" + ++s2.count + "--" + ++s3.count);
//		System.out.println(++s1.scount + "--" + ++s2.scount + "--" + ++s3.scount);
////		//out은 누워있다... static이기 때문
////		System.out.println();
	}
	static {
		System.out.println("static block-2");
	}

}
