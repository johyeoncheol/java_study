package com.test;

public class ArrayTest {

	public static void main(String[] args) {
		// �迭 : ���� , ����, ���
		int score; // ����
		score = 99; // ���
		
//		int[] scores; //���� , �迭 ũ�� �ָ� �ȵ�
//		scores = new int[5];
		int[] scores = new int[5];
		scores[0] = 90;
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 100;
		
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
		
		for(int i=0;i<scores.length;++i) {
			System.out.println(scores[i]);
		}
		
		int[] a = new int[100];
		double[] d = new double[200];
		boolean[] flag = new boolean[10];
		String[] msg = new String[10];
		
		//���� , ���� , �ʱ�ȭ
		int[] scores2 = {32,58,66,79,90};
	
//		for(int i=0;i<5;++i) {
//			System.out.println(scores2[i]);
//		}
		for(int s : scores2) {
			System.out.println(s);
		}
		
		String[] names = {"�̼���","�������","�̼���","����ö","ö��"};
		
		for(String s : names) {
			System.out.println(s);
		}
		
		System.out.println(names.length); //�迭�� ũ��
	}

}
