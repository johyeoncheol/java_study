package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			fis = new FileInputStream("src\\com\\io\\FileCopy.java");
			fos = new FileOutputStream("src\\com\\io\\Copy.java");
			
			for(int i = 0 ; (i = fis.read())!=-1;)  {
				System.out.println(i);
				fos.write(i); // int type 의 코드 값을 character로 바꿔줌
			}
			
			fis.close();
			fos.close();
			
			System.out.println("file copied");
			
			//밑에서 다 잡게 FileNotFoundException -> Exception으로 변경
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
