package com.test;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 : 선언 , 생성, 사용
		int score; // 선언
		score = 99; // 사용
		
//		int[] scores; //선언 , 배열 크기 주면 안됨
//		scores = new int[5];
		int[] scores = new int[5];
		scores[0] = 90;
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 100;
		
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
		
		for(int i=0;i<scores.length;++i) {
			System.out.println(scores[i]);
		}
		
		int[] a = new int[100];
		double[] d = new double[200];
		boolean[] flag = new boolean[10];
		String[] msg = new String[10];
		
		//선언 , 생성 , 초기화
		int[] scores2 = {32,58,66,79,90};
	
//		for(int i=0;i<5;++i) {
//			System.out.println(scores2[i]);
//		}
		for(int s : scores2) {
			System.out.println(s);
		}
		
		String[] names = {"이순신","세종대왕","이성계","조현철","철수"};
		
		for(String s : names) {
			System.out.println(s);
		}
		
		System.out.println(names.length); //배열의 크기
	}

}
