package com.inherit;

//���� Ŭ����
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

//���� Ŭ����
public class Manager extends Employee{
	int mcode;
	
	Manager(int num, String name, int salary,int mcode){
		//�ڽĺ��� �θ� ���� �����Ǿ�� �ϹǷ� �θ� �����ڿ� ���缭 ���� �����ؾ���
		//�ڽ� Ŭ�������� �θ� ������ ȣ��� -> super ���
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