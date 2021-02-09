package com.singleton;
/* 디자인 패턴 -> 클래스를 설계하는 방법
 * Singleton 디자인 패턴
 * : 객체 생성을 한번만 수행하고 그 이후부터는 생성된 객체를 공유해서 사용하는 방식
 * 조건:
 * 1)field: private , static 수식어 붙어야 된다.
 * 2)생성자: private 수식어를 붙여야 한다.
 * 3)객체를 만들어서 리턴해주는 public static 메소드가 존재해야 한다.
 * */
public class SingletonObject {
	
	//field
	private static SingletonObject instance;
	
	//생성자
	private SingletonObject() {}
	
	//public method: 외부에서 사용 가능한 메소드
	public static SingletonObject getInstance() {
		if(instance == null) 
			instance = new SingletonObject();
		
		return instance;
	}
}
