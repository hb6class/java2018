package com.hb.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Ex03 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(new String("ù��°"), 1111);
		map.put("�ι�°", 2222);
		map.put(new String("ù��°"), 3333);
		map.put("�׹�°", 4444);
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(key+":"+map.get(key));
		}
	}

}
