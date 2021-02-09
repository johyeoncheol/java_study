package com.exception;

/* ����� ���� ���� Ŭ����
 * MyException
 * */
class MyException extends Exception{
	String message;

	public MyException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyException [message=" + message + "]";
	}
	
}

public class CustomExceptionTest {
	public void check(int num) throws MyException {
		if(num > 0 ) {
			System.out.println("result: " + ++num);
		}else {
			throw new MyException("�Ķ���ʹ� ��� �̾�� �մϴ�.");
		}
	}

	public static void main(String[] args) {
		CustomExceptionTest c =new CustomExceptionTest();
		try {
			c.check(100);
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
