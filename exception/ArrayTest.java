package com.exception;

/* ArrayIndexOutOfBoundsException 런타임 에러
 * ArithmeticException
 * */
public class ArrayTest {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		
		for(int i = 0; i <= nums.length;i++) {
			try {
				int a = 3, b = 0 , c = 0 ;
				c=a/b;
				System.out.println(nums[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				//예외 처리 코드
				System.out.println("oops, sorry!!!");
				System.out.println(e.getMessage());
				
				//모든 에러를 Exception에서 잡기 떄문에 뒤에 있는 예외는 실행될 수 없는 문장이다.
			}catch(Exception w){
				System.out.println("분모는 0이 아니여야 합니다.");
			}finally { // 예외 발생 여부와 상관없이 매번 실행되어야 하는 내용
				System.out.println("finally");
			}
		}
		System.out.println("done!!!");
	}
}
