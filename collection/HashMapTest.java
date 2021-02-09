package com.collection;

import java.util.HashMap;
import java.util.Set;

/* HashMap(Map 종류) : key-value 구조
 * key는 중복되지 않게 해야 한다.
 * */
public class HashMapTest {

	public static void main(String[] args) {
		//int를 사용할 수 없다. Integer 같은 참조형만 사용 가능하다.
		//HashMap<String,String> map = new HashMap<>(); 
		HashMap<String,String> map = new HashMap<>(); 
		map.put("num", "123");	 
		map.put("name", "tommy");	 
		map.put("address", "seoul");	  
		
		map.put("address", "london");
		System.out.println(map.get("address"));
		System.out.println(map);
		
		//map 안으로 key만 뽑아냄
		Set<String> keys=map.keySet();
		for(String key : keys) {
			String val = map.get(key);
			System.out.println(key + ":"+val);
		}
	}

}
