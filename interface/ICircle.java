package com.inter;

/* money watch trash�� Ŭ������ Thing�� �������̽��� ��� �޴´�. 
 * Thing t = new Thing();
 * Pay(t);
 * Watch w = new Watch();
 * Pay(w); // Thing�� �� ū Ÿ���̱� ������ Watch Ÿ�Ե� �ѱ� �� �ִ�.
 * 
 * public void pay(Thing x){
 * ....
 * }
 * */
class Truck{}
interface Subway{}

public class ICircle extends Truck implements IShape, Subway  {
	int r;

	public ICircle(int r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}

	@Override
	public double getCircum() {
		return 2 * Math.PI * r;
	}
}
