package com.hb.pm;

import java.util.ArrayList;
import java.util.LinkedList;
public class Ex01 {

	public static void main(String[] args) {
		// jdk 1.2~
		// jdk 1.4~
		// jdk 1.5~
		// jdk 1.6~
		
		
		
//		java.util.List list =null;
		// �迭�� �̿��� �����Ҵ�
//		list = new ArrayList();
		// ��ü�� �̿��� �����Ҵ�
		java.util.LinkedList list =null;
		list = new LinkedList();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		list.add("test1");
		list.add("test3");//�Է�
		list.addLast("test7");
		//CRUD(Create, Read, Update, Delete)
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));//����
		}
		System.out.println("-------------------------------------");
		list.remove(1);//����
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------");
		list.set(2,"test5");//����
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------");
		list.add(3,"test6");//�����ֱ�
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------");
		// "test5"�� index���� ���϶�(���° �ִ°�)
		// "test5"�����ϳ�?
		System.out.println("test5 ��"+list.contains("test05"));
		System.out.println("test05�� idx="+list.indexOf(new String("test5")));
		int idx=0;
		for(idx=0; idx<list.size(); idx++){
			String temp=(String)list.get(idx);
			if("test05".equals(temp)){
				break;
			}
		}
		if(idx==list.size()){
			idx=-1;
		}
		System.out.println("test05�� idx="+idx);
		System.out.println("-------------------------------------");
		System.out.println("list�� �����"+list.isEmpty());
		list.clear();
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("list�� �����"+list.isEmpty());
		System.out.println("-------------------------------------");
		//����
//		ArrayList list2=list;
//		list2.add(1111);
//		list2.add(2222);
//		list2.add(3333);
//		list2.add(4444);
		//////////
//		ArrayList list3=new ArrayList();
//		for(int i=0; i<list.size(); i++){
//			list3.add(list.get(i));
//		}
		//////////
//		ArrayList list3=new ArrayList(list);
//		//////////
//		ArrayList list4=(ArrayList)list2.clone();
//		list3.add(5555);
//		for(int i=0; i<list3.size(); i++){
//			System.out.println(list3.get(i));
//		}
//		System.out.println("------------------------------");
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i));
//		}
		

	}

}



















