package com.exception;

/* 예외클래스는 단순히 예외를 '표현'한다는 책임만을 가지지는 것이 좋은데
 * 여기에 '처리'한다는 책임까지 가지면 클래스가 무거워지고 유지보수하기가 힘들어집니다.  
 * */
//오류가 전달전달 되서 메인까지 오게 된다
public class ExceptionTest2 {

	ExceptionTest2(int num) throws Exception{
		first(num);
	}
	
	private void first(int num) throws Exception {
		second(num);
	}

	private void second(int num) throws Exception {
		third(num);
	}

	private void third(int num) throws Exception {
		if(num>0) {
			System.out.println("result: " + ++num);
		}else {
			//throw : 예외를 발생시킴
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		try {
			ExceptionTest2 ex = new ExceptionTest2(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
