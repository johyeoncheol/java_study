package com.basic;

public class StaticTest {

	// static field
	int count; //�ν��Ͻ�(��ü) ����
 	// static�� ��� ����ü�� �����ִ�.
	//1. static�� Ŭ���� ����, ���� ��ü���� �����ؼ� ��� (1�� �������)
	static public int scount = 999;

	public static void go() {//2. STATIC METHOD
		System.out.println("hello, static");
	}
	
	//3. STATIC BLOCK{} // ���κ��� �� ���� ������ �ȴ�.
	static {
		System.out.println("static block-1");
	}
	
	public static void main(String[] args) {
		//public�� �ƴ϶� ����!
		//Math m = new Math();
		System.out.println(Math.pow(2,3));
		
		//��ü ���� �� �ʿ� ���� Ŭ���� �̸����� �ٷ� ��� ����
		System.out.println(StaticTest.scount);
		StaticTest.go();
		//System.out.println(count);
		
//		StaticTest s1 = new StaticTest();
//		StaticTest s2 = new StaticTest();
//		StaticTest s3 = new StaticTest();
//
//		System.out.println(++s1.count + "--" + ++s2.count + "--" + ++s3.count);
//		System.out.println(++s1.scount + "--" + ++s2.scount + "--" + ++s3.scount);
////		//out�� �����ִ�... static�̱� ����
////		System.out.println();
	}
	static {
		System.out.println("static block-2");
	}

}
