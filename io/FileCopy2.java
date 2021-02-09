package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		// try with resources(stream): 예외 발생 여부와 관계없이 자동으로 스트림을 닫아줌
		/* try(stream 생성 문장){ }
		 * 
		 * try(stream 생성문장){
		 * 		스트림 사용 문장
		 * }catch(Exception){
		 * 		예외처리 문장
		 * }
		 */
		try (FileInputStream fis = new FileInputStream("src\\com\\io\\FileCopy.java");
				FileOutputStream fos = new FileOutputStream("src\\com\\io\\Copy.java");) {
			

			for (int i = 0; (i = fis.read()) != -1;) {
				System.out.println(i);
				fos.write(i); // int type 의 코드 값을 character로 바꿔줌
			}

			System.out.println("file copied");

			// 밑에서 다 잡게 FileNotFoundException -> Exception으로 변경
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
