package com.abst;

public abstract class Shape {
	//추상 클래스라고 해서 추상 메소드가 꼭 있어야 하는 것은 아니다.
	//추상 메소드
	public abstract double getArea(); //도형의 면적 구하는 메소드
	public abstract double getCircum();//도형의 둘레 구하는 메소드
	
	//구현 메소드
	public void go() {
		System.out.println("hello...");
	}
}
