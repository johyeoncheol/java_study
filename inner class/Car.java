package com.inner;

public class Car {
	int num = 1234;
	
	/* member inner class
	 * 기본적으로 그냥 inner class랑 차이점은 static가 붙지 않는다.
	 *  
	 */
	public class Engine{
		public void go() {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Car c = new Car();
		//System.out.println(c.num);
		
		//member class: 바깥쪽 객체가 먼저 생성된 후에 사용 가능하다.
		Engine e = c.new Engine();
		e.go();
		System.out.println(e.getClass().getName());
	}

}
