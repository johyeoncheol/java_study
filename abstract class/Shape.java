package com.abst;

public abstract class Shape {
	//�߻� Ŭ������� �ؼ� �߻� �޼ҵ尡 �� �־�� �ϴ� ���� �ƴϴ�.
	//�߻� �޼ҵ�
	public abstract double getArea(); //������ ���� ���ϴ� �޼ҵ�
	public abstract double getCircum();//������ �ѷ� ���ϴ� �޼ҵ�
	
	//���� �޼ҵ�
	public void go() {
		System.out.println("hello...");
	}
}
