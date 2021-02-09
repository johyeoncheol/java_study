package com.inherit;

/* Object: 모든 클래스의 부모 클래스.
 * */

/* 파일 안에는 여러개의 클래스가 존재 가능
 * 하나의 클래스에만 public가 붙어야 한다.
 * 파일 이름으로 된 클래스에 public가 붙어야 한다.
 * */

/* Class A -> Class B -> Class C
 * C c = new C()
 * A가 제일 먼저 생성된다.
 * */

/* 타입의 우선순위는 부모가 자식보다 높고(참조 범위가 더 넓다)
 * 메모리는 자식이 부모보다 크다
 * Child x = new Parent()
 * Parent y = new Child()
 * */

/* 추상 클래스
 * 추상 메소드 : 함수의 body 부분이 없는 미완성의 함수
 * public abstract void go(String m);
 * 
 * 추상 클래스 : 추상 메소드를 가지는 클래스
 * public abstract class MyAbstract{
 * 	public abstract void go(String m);
 * }
 * 
 * 미완성 클래스 이므로 생성 불가
 * public abstract class MyAbstract{}
 * MyAbstract m = new MyAbstract();
 * 
 * 다른 클래스에서 추상클래스를 상속해서 미완성의 메소드를 구현해 줘야 함
 * public class Complete extends MyAbstract{
 * 	public void go(String m){}
 * }
 * */
class Parent {
	String name = "tom";
	String address = "seoul";
	
	/* 생성자의 경우 기본적으로 디폴트 생성자가 만들어진다.
	 * 파라미터를 가진 부모의 생성자를 만들면  
	 * 기본형인 디폴트 생성자를 만들어줘야 한다.
	 * */
//	Parent(){}
//	Parent(String name){
//		System.out.println("Parent 생성자");
//	}
	
	void getName() {
		//System.out.println(this.getClass().getName());
		System.out.println("name: " + name);
	}
	void getAddress() {
		System.out.println("address: " + address);
	}
}
class A{}
class B{}

public class Child extends Parent{ //자식클래스
	String email;
	
//	Child(){
//		System.out.println("Child 생성자");
//	}
	
	//method overriding: 부모 클래스로부터 상속 받은 메소드를 자식 클래스에서 재정의
	//method name, return type, parameter - 부모와 동일
	// access modifier - 
	@Override
	void getName() {
		System.out.println("name: tomson");
	}
	
	//오버라이드 되지 않은 함수에 붙이면 오류
	//@Override
	/* method overloading : 한 클래스 안에서 동일한 이름의
	 *  메소드의 파라메터가 달라서 구분되는 경우
	 */
	void go() {
		System.out.println("gogogo~~~");
	}
	int go(int x) {
		System.out.println("gogogo~~~");
		return x;
	}
	
	
	//static 는 실행하기 전에 진행된다.
	public static void main(String[] args) {
		//상속 관계에 있어서 부모가 더 크다
		//부모 > 자식
		Parent x = new Child();
		x.getName();
		//Child y = new Parent();
		
		
		//상속 관계에 있는 자식 타입의 객체를 생성하면 메모리에 부모 객체가 먼저 생성됨
		Child c = new Child();
		c.getName();
		c.getAddress();
		
		//super: 자식 클래스에서 부모 클래스를 지칭하는 레퍼런스
		//static method에서는 super, this는 안된다.
		//super.getName(); // 부모꺼
		c.CallSuper();
	}

	private void CallSuper() {
		super.getName();
	}


}
