package com.test;

public class DataType {
	public static void main(String[] args) {
		//����: boolean
		//flag: ���� (� ���� �����ϴ� �����)
		boolean flag = true;
		
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//�Ǽ�  > ����
		
		// ������
		byte b = 12; //byte : -128 ~ 127
		short s = 1000; //
		int num = 100; // int : -21��  ~ +21��
		long l = 99999999;
		
		b = 10;
		//���� ���ͷ��� ��� vm�� 4byte�� �����ϰ� ����
		// b => 1byte 1 => 4byte  ����� 4byte�� �ȴ�.
		//b = b+1; // ����
		int b2 = b +1;
		b = (byte)(b+1);
		
		//literal(��) : ���� ���ͷ� , �Ǽ� ���ͷ�...
		// �Ǽ���
		float f = 1.2f;
		double point = 3.14;
		f= (float)point;//���ϴ� ������ Ÿ�� -> ����ȯ
		point = f;
		
		// ������ : �ѱ��� ����
		char code = 'a';
		code = 'x';
		code = 97; // ������ code ������ �ν�
		
		//String(���ڿ�) : ������
		String name ="kim";
		
		System.out.println(num);
		System.out.println(code);
		System.out.println(flag);
		
		System.out.printf("%d\n%s\n%s\n",num,code,name);
	}
}
