
package com.practice;

import java.util.Scanner;

/**
 * ����,����,�� ������ �ϴ� Ŭ����
 */
public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		// ���� �޴� ���
		System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��"); 
		System.out.println("2. 3�� 2��");  
		System.out.println("3. 1�� 1��");  
		System.out.print("��ȣ�� �Է��ϼ���.");
		
		int menu = sc.nextInt();	// ����ڰ� ������ �޴� ����
		int comWin = 0;				// ��ǻ�Ͱ� �¸��� ī��Ʈ ����
		int userWin = 0;			// ����ڰ� �¸��� ī��Ʈ ����
		
		int totalCnt = 0;			// �� ġ��� �ϴ� ���� ī��Ʈ ����			
		int winCnt = 0;				// �¸������� �����ϴ� ī��Ʈ ����
		int gameCnt = 0;			// �������� ���� ī��Ʈ ����
		
		int comNo = 0;				// ��ǻ�Ͱ� ������ ����,����,�� ����
		int userNo = 0;				// ����ڰ� ������ ����,����,�� ����
		
		// ����ڰ� ������ �޴��� ���� ��ġ����ϴ� ���� ī��Ʈ�� �¸������� �����ϴ� ī��Ʈ�� �����Ѵ�.
		if(menu==1) {
			totalCnt = 5;
			winCnt = 3;
			
		}else if(menu==2) {
			totalCnt = 3;
			winCnt = 2;
			
		}else {
			totalCnt = 1;
			winCnt = 1;
		}
		
		// �������� ���� Ƚ���� �� ���� ī��Ʈ�� ���� ������ ��ǻ��,������� �¸� ī��Ʈ�� �¸������� �������� ���Ѵٸ� �ݺ� 
		while(gameCnt++<totalCnt && comWin<winCnt && userWin<winCnt) {
			System.out.println("���������� �� �ϳ� �Է�(1:����, 2:����, 3:��): ");
			comNo = (int)(Math.random()*3)+1;	// ��ǻ�� �Է����� ������  ����,����,�� ����
			userNo = sc.nextInt();				// ����� �Է�����  ����,����,�� ����
			
			// ��ǻ�Ϳ� ����ڰ� ������ ����,����,�� ���ο� ���� �̰��� ��쿡�� �ش� �¸� ī��Ʈ ����
			// ����� ���忡�� ��/��/���º� ��� ���
			//....
			//��ǻ�Ͱ� �̱�� ���
			if( (comNo == 2 && userNo==1) || (comNo == 3 && userNo==2) ||(comNo == 1 && userNo==3) ) {
				//��ǻ�Ͱ� �̱�� ���
				comWin+=1;
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else if((comNo == 1 && userNo==2) || (comNo == 2 && userNo==3) ||(comNo == 3 && userNo==1)) {
				//����ڰ� �̱�� ���
				userWin+=1;
				System.out.println("����ڰ� �̰���ϴ�.");
			}else {
				//���� ���
				System.out.println("�����ϴ�.");
			}
						
		}
		
		// ����� �¸�Ƚ���� ��ǻ�� �¸�Ƚ�� ���Ͽ� ���� ��� ���
		if(userWin>comWin) {
			System.out.println("����ڰ�  ��!!!");
			
		}else if(userWin<comWin) {
			System.out.println("��ǻ�Ͱ� ��!!!");
			
		}else {
			System.out.println("�����ϴ�. !!!");
		}
		sc.close();
	}
}