package com.inter;

class Tom {
	int age = 50;
}

interface Hillary {
	//인터페이스라 static final int age와 동일하다.
	int age = 46;
}

class Bill {
}

public class LittleTom extends Tom implements Hillary {
	int age = 20;
	public void test() {
		System.out.println(age);//20
		System.out.println(this.age);//20
		System.out.println(super.age);//20
		System.out.println(Hillary.age);
	}
	public static void main(String[] args) {
		LittleTom little = new LittleTom();
		if(little instanceof Tom) {
			System.out.println("instanceof Tom");
		}
		if(little instanceof Hillary) {
			System.out.println("instanceof Hillary");
		}
		if(little instanceof LittleTom) {
			System.out.println("instanceof LittleTom");
		}
		if(little instanceof Object) {
			System.out.println("instanceof Object");
		}
//		if(little instanceof Bill) {
//			System.out.println("instanceof Bill");
//		}
		little.test();
	}
}
