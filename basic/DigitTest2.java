package com.practice;

public class DigitTest2 {

	public static void main(String[] args) {
		int x = 0;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.printf("%3s",' ');
			}
			for (int j = 0; j < 5 - 2*i; ++j) {
				x += 1;
				System.out.printf("%3d",x);
			}
			System.out.println();
		}
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 1-i; ++j) {
				System.out.printf("%3s",' ');
			}
			for (int j = 0; j <2*i+3; ++j) {
				x += 1;
				System.out.printf("%3d",x);
			}
			System.out.println();
		}
	}
}
