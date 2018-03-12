package com.hb.pm;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		// 로또번호 생성기
		TreeSet lotto = new TreeSet();
		while(lotto.size()<6){
		lotto.add(((int)(Math.random()*45)+1));
		}
		
		Iterator ite = lotto.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}
	}

}
