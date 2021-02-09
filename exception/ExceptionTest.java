package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* FileNotFoundException
 * Non RuntimeException
 * 코드 작성시부터 예외처리 해주고 가야 된다.
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
