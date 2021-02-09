package com.inter;

public class IShapeUser  {

	public static void main(String[] args) {
		IShape[] is = new IShape[3];
		is[0] = new ICircle(6);
		is[1] = new IRect(12, 80);
		is[2] = new IRect(3, 5);

		for (IShape w : is) {
			System.out.println(w.getClass().getName());
			System.out.println("면적: "+w.getArea());
			System.out.println("둘레: "+w.getCircum());
			System.out.println();
		}
	}

}
