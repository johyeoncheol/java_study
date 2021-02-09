package com.io;

public class Practice {
	public static void main(String[] args) {
		int x = 2, y = 7;
		// &&은 앞에가 거짓이면 뒤를 확인하지 않는다. y = 7
		// &의 경우는 뒤에도 확인 하기 떄문에 y 는 8
		if (x++ >5 & ++y > 1) {

		}
		System.out.println(y);
	}
}
