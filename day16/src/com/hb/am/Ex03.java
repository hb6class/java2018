package com.hb.am;

import java.util.Stack;
import java.util.Vector;

public class Ex03 {

	public static void main(String[] args) {
		// 스택(LIFO) - a last in first out
		// 순서(o)- 선입후출,후입선출 - 먼저 in 나중 out
		// 중복(o)
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
		System.out.println("현재까지 마지막은?"+stack01.peek());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
	}

}
