package com.exception;

//InterruptedException: Non-Runtime Exception. ����ó���� ����� ��
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
