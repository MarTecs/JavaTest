package com.test;

import java.util.Hashtable;
import java.util.Map;

public class Test9 {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put("age", 18);
		map.put("name", "��ͳ");
		map.put("age", 19);

		System.out.println(map.get("name"));
		System.out.println(map.get("age"));

		//����ռ��Ϳ�ֵ
		map.put(null, "a");
		
		
		

	}

}
