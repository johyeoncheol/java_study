package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* FileNotFoundException
 * Non RuntimeException
 * �ڵ� �ۼ��ú��� ����ó�� ���ְ� ���� �ȴ�.
 * */
public class ExceptionTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
