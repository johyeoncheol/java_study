package com.practice;

public class DigitTest1 {

	public static void main(String[] args) {
		int x=0;
		for(int i = 0 ; i < 5 ; ++i) {
			for(int j = 0 ; j<i ; ++j) {
				System.out.printf("%3s",' ');
			}
			for(int j = 0 ; j<5-i ; ++j) {
				x+=1;
				System.out.printf("%3d",x);
			}
			System.out.println();
		}
	}

}
