package com.inherit;

public class BounsTest {
	//Employee에는 실제로 Manager도 들어있다.
	public void printBouns(Employee who) {
		System.out.println(who.getBonus());
	}
	public static void main(String[] args) {
		BounsTest bt = new BounsTest();
		Employee tom = new Employee(123, "tom jones", 3000);
		bt.printBouns(tom);
		
		//
		Manager bill = new Manager(890,"bill lee",5000,100);
		bt.printBouns(bill);
	}
}
