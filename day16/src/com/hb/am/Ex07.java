package com.hb.am;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		// map Ÿ��(key, value)
		//key-�ߺ�����, value-�ߺ����
		//key-SetŸ��
		
		java.util.HashMap map=null;
		
		map=new HashMap();
		
		//�߰�
		map.put(1111, 1000);
		map.put(2222, 2000);
		map.put(1111, 5000);// Ű�� �ߺ� ����
		map.put(4444, 4000);
		map.put("abc", 22222);
		map.put(null, 1111);
		map.put('A', "test");
		map.put(null, "����");
		
		map.remove(null);// ����
		
//		map.clear(); // delete All
		System.out.println(map.isEmpty()); // ����ִ°�?
		System.out.println("map size:"+map.size());
		System.out.println("value:5000 �� �����ϳ�:"
							+map.containsValue(5000));
		System.out.println("key:1111 �� �����ϳ�:"
				+map.containsKey(1111));
		// ����
		java.util.Set keys=map.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			Object key=ite.next();
			System.out.println("key:"+key+",value:"+map.get(key));
		}
		System.out.println("\n---------------------");
		Set entry = map.entrySet();
		Iterator ite2 = entry.iterator();
		while(ite2.hasNext()){
			Map.Entry ent=(Map.Entry)ite2.next();
			System.out.print("key:"+ent.getKey());
			System.out.println(",value:"+ent.getValue());
		}
		
//		System.out.println(map.get(1111));
//		System.out.println(map.get(2222));
//		System.out.println(map.get("a"));
//		System.out.println(map.get(null));
//		System.out.println(map.get(4444));

	}

}











