package com.inner;

/* 한 자바 파일 안에 클래스에 public를 여러개 못붙인다고 했었다.
 * 그것은 탑 클래스 간에는 못붙이지만 , inner 클래스의 경우는 탑 클래스가 아니기 때문에
 * 여러개의 public 를 붙일 수 있다.
 * */
//inner class
public class Outer {
	
	static int count = 99;
	
	//static inner class
	static class Inner{
		public void go() {
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		System.out.println(count);
		System.out.println(Outer.count);
		Inner i = new Inner();
		Inner i2 = new Outer.Inner();
		i.go();
		/* Inner 클래스는
		 * $표시가 붙어있다.
		 * */
		System.out.println(i.getClass().getName());
	}

}
