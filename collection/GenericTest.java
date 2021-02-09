package com.collection;

import com.abst.Circle;

/* 1. source -> compile -> exe
 * source에서 확인 과정에서 결정이 난다.
 * 일반적으로 변수를 선언하면 실행과 동시에 결정이 된다.
 * EXE 부분에서 제네릭의 형이 결정이 된다.
 * 그러나,제네릭을 사용하면 미완성은 아니지만 결정이 되지 않는다.
 * 
 * Generic programming : 클래스 설계시에 데이터의 타입을 정하지 않고
 * 런타임시에 데이터의 타입을 임의로 정하도록 유연성을 주는 방식
 * */
public class GenericTest<X> {
	private int num;
	private X what;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public X getWhat() {
		return what;
	}
	public void setWhat(X what) {
		this.what = what;
	}
	
	public static void main(String[] args) {
		/* String이라는 사실을 지금 정하는 것!
		 * 기본형 데이터를 참조형 데이터로 바꿔 놓은 것!
		 * int -> Integer(Wrapper 클래스)
		**/
		GenericTest<String> t1 = new GenericTest<>();
		GenericTest<Integer> t2 = new GenericTest<>();
		GenericTest<Circle> t3 = new GenericTest<>();
		
		t1.setWhat("hello");
		t2.setWhat(new Integer(123));
		t3.setWhat(new Circle(6));
		
		System.out.println(t1.getWhat());
		System.out.println(t2.getWhat());
		System.out.println(t3.getWhat().getArea());
	}

}
