package com.hb.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lec02{
	int su;
	Lec02(int su){
		this.su=su;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// Set
		// - 순서를 갖지않고
		// - 중복허용x
		Set set01 = new HashSet();
		set01 = new TreeSet();
		set01.add(1111);// 입력
		set01.add("2222");// 입력
//		set01.add(new Lec02(1111));// 입력
//		set01.add(new Lec02(2222));// 입력
//		set01.add(new Lec02(3333));// 입력
//		set01.add(new Lec02(2222));// 입력
//		set01.add(new Lec02(4444));// 입력
//		set01.add(new Lec02(1111));// 입력
						// 수정없음
//		set01.remove("3333"); // 삭제
		
		System.out.println("set size:"+set01.size());
		Iterator ite = set01.iterator();//보기
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}
		System.out.println("\n-------------------");

	}

}
