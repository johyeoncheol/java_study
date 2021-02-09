package com.exception;

/* ����Ŭ������ �ܼ��� ���ܸ� 'ǥ��'�Ѵٴ� å�Ӹ��� �������� ���� ������
 * ���⿡ 'ó��'�Ѵٴ� å�ӱ��� ������ Ŭ������ ���ſ����� ���������ϱⰡ ��������ϴ�.  
 * */
//������ �������� �Ǽ� ���α��� ���� �ȴ�
public class ExceptionTest2 {

	ExceptionTest2(int num) throws Exception{
		first(num);
	}
	
	private void first(int num) throws Exception {
		second(num);
	}

	private void second(int num) throws Exception {
		third(num);
	}

	private void third(int num) throws Exception {
		if(num>0) {
			System.out.println("result: " + ++num);
		}else {
			//throw : ���ܸ� �߻���Ŵ
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		try {
			ExceptionTest2 ex = new ExceptionTest2(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
