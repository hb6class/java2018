package com.hb.am;

import java.util.LinkedList;

public class Ex05 {

	public static void main(String[] args) {
		// stack && queue
		
		java.util.Deque de01= new LinkedList();
		de01.addFirst(1111);
		de01.addFirst(2222);
		de01.addFirst(3333);
		de01.addFirst(4444);
		
		System.out.println(de01.removeFirst());
		System.out.println(de01.removeFirst());
		System.out.println(de01.removeFirst());
		System.out.println(de01.removeFirst());
		System.out.println("--------------------------------");
		java.util.Deque de02= new LinkedList();
		de02.offerFirst(5555);
		de02.offerFirst(6666);
		de02.offerFirst(7777);
		de02.offerFirst(8888);
		System.out.println(de02.pollFirst());
		System.out.println(de02.pollFirst());
		System.out.println(de02.pollFirst());
		System.out.println(de02.pollFirst());
		System.out.println("--------------------------------");
		java.util.Deque de03= new LinkedList();
		de03.addLast(1000);
		de03.addLast(2000);
		de03.addLast(3000);
		de03.addLast(4000);
		System.out.println(de03.removeLast());
		System.out.println(de03.removeLast());
		System.out.println(de03.removeLast());
		System.out.println(de03.removeLast());
		System.out.println("--------------------------------");
		java.util.Deque de04= new LinkedList();
		de04.offerLast(5000);
		de04.offerLast(6000);
		de04.offerLast(7000);
		de04.offerLast(8000);
		System.out.println(de04.pollLast());
		System.out.println(de04.pollLast());
		System.out.println(de04.pollLast());
		System.out.println(de04.pollLast());

	}

}
