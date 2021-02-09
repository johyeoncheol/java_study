package com.collection;

import java.util.ArrayList;
import java.util.List;

import com.abst.Rect;

/* forEach는 배열도 사용가능하지만, 
 * Iterator는 Iteration 을 구현/상속하는 클래스만 사용가능해요
 * */
/* ArrayList(List 종류)
 * 데이터 간 순서가 있고, 증복도 가능하다.
 * */
public class ArrayListTest {
	public static void main(String[] args) {
		List<Rect> shape = new ArrayList<>();
//		ArrayList<Rect> shape = new ArrayList<>();
		shape.add(new Rect(4,5));
		shape.add(new Rect(2,6));
		shape.add(new Rect(7,8));
		
		//index위치의 데이터 꺼내기
		Rect rr= shape.get(2);
		
		//System.out.println(shape);
		shape.remove(1);// 1은 인덱스 번호
		shape.clear(); //기존의 데이터를 싹다 지움
		
		//shape의 갯수를 출력
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
