package com.singleton;
/* ������ ���� -> Ŭ������ �����ϴ� ���
 * Singleton ������ ����
 * : ��ü ������ �ѹ��� �����ϰ� �� ���ĺ��ʹ� ������ ��ü�� �����ؼ� ����ϴ� ���
 * ����:
 * 1)field: private , static ���ľ� �پ�� �ȴ�.
 * 2)������: private ���ľ �ٿ��� �Ѵ�.
 * 3)��ü�� ���� �������ִ� public static �޼ҵ尡 �����ؾ� �Ѵ�.
 * */
public class SingletonObject {
	
	//field
	private static SingletonObject instance;
	
	//������
	private SingletonObject() {}
	
	//public method: �ܺο��� ��� ������ �޼ҵ�
	public static SingletonObject getInstance() {
		if(instance == null) 
			instance = new SingletonObject();
		
		return instance;
	}
}
