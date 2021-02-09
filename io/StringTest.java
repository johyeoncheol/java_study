package com.io;

public class StringTest {
	static int a;
	public static void main(String[] args) {
		int c;
		System.out.println(a);
		//지역 변수는 초기화 하지 않으면 사용할 수 없다.
		//System.out.println(c);
		
		String s = "mylimeorange";
		String t = new String("mylimeorange");
		String x = "mylimeorange";
		
		if(s==t)
			System.out.println("s == t"); //false
		
		if(s.equals(t))
			System.out.println("s.equals(t)"); //true
		
		if(s==x)
			System.out.println("s == x"); //true		
	
		System.out.println(s);

		//원본 s는 바뀌지 않는다!!.
		String b = s.concat("hello");
		System.out.println(b);
		
		s = s + "gogogo";
		System.out.println(s);
		
		//StringBuilder은 원본에 수정이 가능하다!!
		StringBuilder sb = new StringBuilder("mylimeorange");
		sb.append("hello");
		sb.insert(2, 'q');
		System.out.println(sb);
	}
}
