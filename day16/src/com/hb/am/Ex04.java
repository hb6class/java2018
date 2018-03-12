package com.hb.am;

import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {
		// 큐(FIFO) -  a first in first out;
		// 순서(o) - 선입선출 - 먼저 in 먼저 in
		// 중복(o)
		java.util.Queue que=null;
		que = new LinkedList();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(2222);
		que.offer(4444);
		
		System.out.println("Queue size:"+que.size());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println("다음대기자:"+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}

}

















