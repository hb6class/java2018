package com.hb.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lec06 implements Comparable{
	int su;

	@Override
	public int compareTo(Object obj) {
		int result=this.su-((Lec06)obj).su;
		return result;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// set
		Set set = new HashSet();
		set = new TreeSet();
		Lec06 me = new Lec06();
		me.su=1;
		set.add(me);
		me = new Lec06();
		me.su=20;
		set.add(me);
		me = new Lec06();
		me.su=3;
		set.add(me);
		me = new Lec06();
		me.su=4000;
		set.add(me);
		me = new Lec06();
		me.su=5;
		set.add(me);
		
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			Lec06 item=(Lec06) ite.next();
			System.out.println(item.su);
		}
	}

}













