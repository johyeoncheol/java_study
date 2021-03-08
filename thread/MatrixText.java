package com.thread;

class Matrix extends Thread{
	//자신이 출력해야 되는 단 정보
	int num;
	
	//자신이 맡은 단 값을 받아와 저장
	public Matrix(int num) {
		this.num = num;
	}

	//자신이 맡은 단 출력
	public void run() {
			for (int i = 1; i < 10; i++) {
				System.out.println(num+" X "+i+"="+(num*i));
			}
	}
}

public class MatrixText {

	public static void main(String[] args) throws InterruptedException {
		//2단부터 9단까지 출력하기
		for (int i = 2; i < 10; i++) {
			Matrix ma = new Matrix(i);
			ma.start();
			ma.join();
		}
	}	
}