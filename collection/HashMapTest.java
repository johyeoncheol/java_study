package com.collection;

import java.util.HashMap;
import java.util.Set;

/* HashMap(Map ����) : key-value ����
 * key�� �ߺ����� �ʰ� �ؾ� �Ѵ�.
 * */
public class HashMapTest {

	public static void main(String[] args) {
		//int�� ����� �� ����. Integer ���� �������� ��� �����ϴ�.
		//HashMap<String,String> map = new HashMap<>(); 
		HashMap<String,String> map = new HashMap<>(); 
		map.put("num", "123");	 
		map.put("name", "tommy");	 
		map.put("address", "seoul");	  
		
		map.put("address", "london");
		System.out.println(map.get("address"));
		System.out.println(map);
		
		//map ������ key�� �̾Ƴ�
		Set<String> keys=map.keySet();
		for(String key : keys) {
			String val = map.get(key);
			System.out.println(key + ":"+val);
		}
	}

}
