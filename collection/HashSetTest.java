package com.collection;

import java.util.HashSet;

//HashSet (Set ����) : ���� x, �ߺ� x
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("bill");
		set.add("jane");
		set.add("june");
		set.add("bill");
		set.add("kim");
		set.add("lee");
		set.add("park");
		set.add("bill");
		
		set.remove("jane");
		System.out.println(set);
	}

}
