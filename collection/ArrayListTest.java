package com.collection;

import java.util.ArrayList;
import java.util.List;

import com.abst.Rect;

/* forEach�� �迭�� ��밡��������, 
 * Iterator�� Iteration �� ����/����ϴ� Ŭ������ ��밡���ؿ�
 * */
/* ArrayList(List ����)
 * ������ �� ������ �ְ�, ������ �����ϴ�.
 * */
public class ArrayListTest {
	public static void main(String[] args) {
		List<Rect> shape = new ArrayList<>();
//		ArrayList<Rect> shape = new ArrayList<>();
		shape.add(new Rect(4,5));
		shape.add(new Rect(2,6));
		shape.add(new Rect(7,8));
		
		//index��ġ�� ������ ������
		Rect rr= shape.get(2);
		
		//System.out.println(shape);
		shape.remove(1);// 1�� �ε��� ��ȣ
		shape.clear(); //������ �����͸� �ϴ� ����
		
		//shape�� ������ ���
		System.out.println(shape.size());
		System.out.println(shape.isEmpty());
		
		for(Rect r : shape) {
			System.out.println(r.getArea());
		}
		
		ArrayList<String> str = new ArrayList();
		str.add("red");
		str.add("blue");
		str.add("yello");
		str.add("black");
		str.add("red");
		
		for(String s : str) {
			System.out.println(s);
		}
	}
}
