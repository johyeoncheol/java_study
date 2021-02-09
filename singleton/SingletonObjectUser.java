package com.singleton;

public class SingletonObjectUser {

	public static void main(String[] args) {
		SingletonObject s1 = SingletonObject.getInstance();
		SingletonObject s2 = SingletonObject.getInstance();
		SingletonObject s3 = SingletonObject.getInstance();
		
		System.out.println(s1 == s2); // == �ּҰ� ��
		System.out.println(s2 == s3);
	}

}
