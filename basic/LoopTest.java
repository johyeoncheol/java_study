package com.test;

public class LoopTest {

	public static void main(String[] args) {
		String msg = "hello";
		
		//for(�ʱ갪; ���ǽ�; ������)
		for(int i=0 ; i<5 ; i++) {
			//System.out.println(i + "." + msg);
			
			//printf("����� ���� ����", ����� ��)
			System.out.printf("%d.%s\n",i,msg);
		}

		//while
		int num = 0 ; //�ʱⰪ
		
		while(num < 5 ) {
			System.out.println("gogogo~");
			num++;//������+
		}
		
		//do~while
		int code = 0;
		
		do {
			System.out.println("welcome~");
			code++;
		}while(code<5);
		
	}

}
