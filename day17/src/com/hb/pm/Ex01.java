package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lec01 implements Comparable<Lec01>{
	static int num;
	int su;
	
	public Lec01() {
		num++;
		su=num;
	}

	public int compareTo(Lec01 o) {
		
		return this.su-o.su;
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// С§Че
		
//		Set<Lec01> set= new HashSet<Lec01>();
		Set<Lec01> set= new TreeSet<Lec01>();

		set.add(new Lec01());
		set.add(new Lec01());
		Lec01 lec=new Lec01();
		set.add(lec);
		set.add(new Lec01());
		set.add(lec);
		Iterator<Lec01> ite = set.iterator();
		while(ite.hasNext()){
			Lec01 val = ite.next();
			System.out.println(val);
		}
	}

}












