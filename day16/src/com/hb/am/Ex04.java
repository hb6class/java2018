package com.hb.am;

import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {
		// ť(FIFO) -  a first in first out;
		// ����(o) - ���Լ��� - ���� in ���� in
		// �ߺ�(o)
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
		System.out.println("���������:"+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}

}

















