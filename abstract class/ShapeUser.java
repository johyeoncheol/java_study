package com.abst;

public class ShapeUser {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Circle(10);
		s[1] = new Rect(3, 5);
		s[2] = new Circle(15);
		
		for(Shape x :s) {
			System.out.println("면적: "+x.getArea());
			System.out.println("둘레: "+x.getCircum());
			System.out.println(x.getClass().getName());
			System.out.println();
		}
	}

}
