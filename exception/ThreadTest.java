package com.exception;

//InterruptedException: Non-Runtime Exception. 예외처리를 해줘야 함
public class ThreadTest {

	public static void main(String[] args) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello world!!!");
		
	}

}
