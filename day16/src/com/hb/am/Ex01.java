package com.hb.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		// List ����
		// - ������ ����
		// - �ߺ����
		List list1 = new ArrayList();
		list1 = new LinkedList();
		list1 = new Vector();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);//�߰�
		list1.set(2, 3000);//����
		list1.remove(1);//����
		
		for(int i=0; i<list1.size(); i++){
			System.out.print(list1.get(i)+" ");//����
		}
		System.out.println("\n----------------------");
	}

}
