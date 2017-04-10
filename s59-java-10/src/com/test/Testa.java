package com.test;

import java.util.Hashtable;
import java.util.Set;

public class Testa {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put("age", 18);
		map.put("name", "·¶Í³");
		map.put("age", 19);

		//¸ù¾Ý¼üÉ¾³ý
		map.remove("age");
		
		
		System.out.println(map.size());
		
		Set<String> set = map.keySet();
		for (String string : set) {
			System.out.println(map.get(string));
		}
		
		
		Set set2 = map.entrySet();
		for (Object object : set2) {
			System.out.println(object);
		}
		
		
		
		
		
		
		

	}

}
