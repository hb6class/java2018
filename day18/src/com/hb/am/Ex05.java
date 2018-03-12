package com.hb.am;
// db="학번@이름@국어@영어@수학\n";
// +"학번@이름@국어@영어@수학\n";
// +"학번@이름@국어@영어@수학\n";
// +"학번@이름@국어@영어@수학\n";

public class Ex05 {

	public static void main(String[] args) {
		String db="1@홍길동@90@91@92\n";
		db+="2@최순실@60@61@62\n";
		db+="3@정유라@50@51@42\n";
		db+="4@김개똥@80@81@82\n";
		db+="5@이말똥@70@71@72";
		
		
		System.out.println("-----------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학");
		System.out.println("-----------------------------------------");
		String[] students=db.split("\n");
		for(int i=0; i<students.length; i++){
			String temp=students[i];
			String[] stu=temp.split("@");
			System.out.print(stu[0]);
			System.out.print("\t");
			System.out.print(stu[1]);
			System.out.print("\t");
			System.out.print(stu[2]);
			System.out.print("\t");
			System.out.print(stu[3]);
			System.out.print("\t");
			System.out.println(stu[4]);
		}
		System.out.println("-----------------------------------------");
	}

}












