package com.inherit;

class X{
	void print() {System.out.println("x-print");}
	void play() {System.out.println("x-play");}
}
class Y extends X{
	void play() {System.out.println("y-play");}
}
public class Z extends Y{
	void print() {System.out.println("z-print");}
	void play() {System.out.println("z-play");}
	void go() {System.out.println("gogo");}
	
	public void test() {
		Z z = new Z();
		Y y = z;
		X x = z;
		
		z.play(); // z
		z.print(); // z
		
		/* y�� ������ z���� �������̵��ؼ�
		 * z���� �ȴ�
		 * */
		y.play(); // z
		y.print(); //z
		
		x.play(); // z
		x.print(); // z
		 
		this.play(); // z
		super.play(); // y
	}
	public static void main(String[] args) {
		Z te = new Z();
		te.test();
	}
}
