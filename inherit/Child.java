package com.inherit;

/* Object: ��� Ŭ������ �θ� Ŭ����.
 * */

/* ���� �ȿ��� �������� Ŭ������ ���� ����
 * �ϳ��� Ŭ�������� public�� �پ�� �Ѵ�.
 * ���� �̸����� �� Ŭ������ public�� �پ�� �Ѵ�.
 * */

/* Class A -> Class B -> Class C
 * C c = new C()
 * A�� ���� ���� �����ȴ�.
 * */

/* Ÿ���� �켱������ �θ� �ڽĺ��� ����(���� ������ �� �д�)
 * �޸𸮴� �ڽ��� �θ𺸴� ũ��
 * Child x = new Parent()
 * Parent y = new Child()
 * */

/* �߻� Ŭ����
 * �߻� �޼ҵ� : �Լ��� body �κ��� ���� �̿ϼ��� �Լ�
 * public abstract void go(String m);
 * 
 * �߻� Ŭ���� : �߻� �޼ҵ带 ������ Ŭ����
 * public abstract class MyAbstract{
 * 	public abstract void go(String m);
 * }
 * 
 * �̿ϼ� Ŭ���� �̹Ƿ� ���� �Ұ�
 * public abstract class MyAbstract{}
 * MyAbstract m = new MyAbstract();
 * 
 * �ٸ� Ŭ�������� �߻�Ŭ������ ����ؼ� �̿ϼ��� �޼ҵ带 ������ ��� ��
 * public class Complete extends MyAbstract{
 * 	public void go(String m){}
 * }
 * */
class Parent {
	String name = "tom";
	String address = "seoul";
	
	/* �������� ��� �⺻������ ����Ʈ �����ڰ� ���������.
	 * �Ķ���͸� ���� �θ��� �����ڸ� �����  
	 * �⺻���� ����Ʈ �����ڸ� �������� �Ѵ�.
	 * */
//	Parent(){}
//	Parent(String name){
//		System.out.println("Parent ������");
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

public class Child extends Parent{ //�ڽ�Ŭ����
	String email;
	
//	Child(){
//		System.out.println("Child ������");
//	}
	
	//method overriding: �θ� Ŭ�����κ��� ��� ���� �޼ҵ带 �ڽ� Ŭ�������� ������
	//method name, return type, parameter - �θ�� ����
	// access modifier - 
	@Override
	void getName() {
		System.out.println("name: tomson");
	}
	
	//�������̵� ���� ���� �Լ��� ���̸� ����
	//@Override
	/* method overloading : �� Ŭ���� �ȿ��� ������ �̸���
	 *  �޼ҵ��� �Ķ���Ͱ� �޶� ���еǴ� ���
	 */
	void go() {
		System.out.println("gogogo~~~");
	}
	int go(int x) {
		System.out.println("gogogo~~~");
		return x;
	}
	
	
	//static �� �����ϱ� ���� ����ȴ�.
	public static void main(String[] args) {
		//��� ���迡 �־ �θ� �� ũ��
		//�θ� > �ڽ�
		Parent x = new Child();
		x.getName();
		//Child y = new Parent();
		
		
		//��� ���迡 �ִ� �ڽ� Ÿ���� ��ü�� �����ϸ� �޸𸮿� �θ� ��ü�� ���� ������
		Child c = new Child();
		c.getName();
		c.getAddress();
		
		//super: �ڽ� Ŭ�������� �θ� Ŭ������ ��Ī�ϴ� ���۷���
		//static method������ super, this�� �ȵȴ�.
		//super.getName(); // �θ�
		c.CallSuper();
	}

	private void CallSuper() {
		super.getName();
	}


}
