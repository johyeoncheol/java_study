package com.inherit;

//직원 클래스
class Employee{
	int num;
	String name;
	int salary;
	
	public Employee(int num, String name, int salary) {
		this.num = num;
		this.name = name;
		this.salary = salary;
	}
	
	double getBonus() {
		return salary*0.3;
	}
	
}

//과장 클래스
public class Manager extends Employee{
	int mcode;
	
	Manager(int num, String name, int salary,int mcode){
		//자식보다 부모가 먼저 생성되어야 하므로 부모 생성자에 맞춰서 값을 전달해야함
		//자식 클래스에서 부모 생성자 호출시 -> super 사용
		super(num,name,salary);
		this.mcode = mcode;
	}
	
	@Override
	double getBonus() {
		return salary*0.5;
	}

	public static void main(String[] args) {
		Employee tom = new Employee(239, "tom", 3000);
		//Manager bill = new Manager(123,"bill kim",5000,100);
		Employee bill = new Manager(123,"bill kim",5000,100);
		
		System.out.println(tom.getBonus());
		System.out.println(bill.getBonus());
	}
}

//class CEO extends Employee{
//	
//}