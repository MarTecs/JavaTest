package com.test;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("age", 18);
		map.put("name", "��ͳ");
		map.put("age", 19);

		System.out.println(map.get("name"));
		System.out.println(map.get("age"));

		//����ռ��Ϳ�ֵ
		map.put(null, null);
		
		
		

	}

}
