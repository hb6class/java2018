package com.hb.am;

import java.util.Stack;
import java.util.Vector;

public class Ex03 {

	public static void main(String[] args) {
		// ����(LIFO) - a last in first out
		// ����(o)- ��������,���Լ��� - ���� in ���� out
		// �ߺ�(o)
		Stack stack01 = new Stack();
		stack01.push(1111);
		stack01.push(2222);
		stack01.push(3333);
		stack01.push(2222);
		stack01.push(4444);
//		stack01.add(1111);
//		stack01.add(2222);
//		stack01.add(3333);
//		stack01.add(4444);
//		stack01.add(2222);
//		stack01.add(3333);
		
		System.out.println("stack size:"+stack01.size());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
		System.out.println("������� ��������?"+stack01.peek());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
	}

}
