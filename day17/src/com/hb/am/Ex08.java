package com.hb.am;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(1111);
		stack.push(2222);
		stack.push(3333);
		stack.push(4444);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());			
		}
		
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(4444);
		while(!que.isEmpty()){
			System.out.println(que.poll());
		}
	}

}














