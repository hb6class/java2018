package com.hb.pm;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * String db="";
 * 
 * ------------------------------------------------------------
 * 학생성적관리프로그램(ver. 0.3.0)
 * -------------------------------------------------------------
 * 1.입력 2.보기 3.상세보기 4.삭제 0.종료>1
 * 이름>홍길동
 * 국어>90
 * 영어>87
 * 수학>84
 * 1.입력 2.보기 3.상세보기 4.삭제 0.종료>2
 * ----------------------------------------------------------
 * 학번		| 이름		| 국어	|영어	| 수학
 * ----------------------------------------------------------
 * 1			홍길동		90		87		84
 * ----------------------------------------------------------
 * 1.입력 2.보기 3.상세보기 4.삭제 0.종료>1
 * 이름>홍길동
 * 국어>90
 * 영어>87
 * 수학>84
 * 1.입력 2.보기 3.상세보기 4.삭제 0.종료>2
 * ----------------------------------------------------------
 * 학번		| 이름		| 국어	|영어	| 수학
 * ----------------------------------------------------------
 * 1			홍길동		90		87		84
 * 1			홍길동		90		87		84
 * ----------------------------------------------------------
 * 
 * 
 * 
*/

class Student{
	int num, kor, eng, math;
	String name;
}

public class Ex03 {
	static String bar="------------------------------------------------------------";
	final static String title="학생성적관리프로그램(ver. 0.3.0)";
	final static String menu="1.입력 2.보기 3.상세보기 4.삭제 5.저장 0.종료>";
	final static String[] menus={"학번","이름","국어","영어","수학"};
	
	public static void main(String[] args) {
		String db="";
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		int input=0;
		String temp=null;
//		boolean first=true;
		int cnt=0;
		while(true){
		
			System.out.print(menu);
			try{
				temp=sc.nextLine();
				input=Integer.parseInt(temp);
			}catch(Exception ex){
				input=-1;
			}
		
			if(input==0){
				break;
			}else if(input==1){//입력
				cnt++;
				Student stu=new Student();
				stu.num=cnt;
				System.out.print(menus[1]+">");
				stu.name=sc.nextLine();
				System.out.println(menus[2]+">");
				temp=sc.nextLine();
				stu.kor=Integer.parseInt(temp);
				System.out.println(menus[3]+">");
				temp=sc.nextLine();
				stu.eng=Integer.parseInt(temp);
				System.out.println(menus[4]+">");
				temp=sc.nextLine();
				stu.math=Integer.parseInt(temp);
//				if(cnt==1){
//					db+=cnt+" "+name+" "+kor+" "+eng+" "+math;
////					first=!first;
//				}else{
//					db+="\n"+cnt+" "+name+" "+kor+" "+eng+" "+math;
//				}
				list.add(stu);
				
			}else if(input==2){//보기
				System.out.println(bar);
				System.out.println(menus[0]+"\t| "+menus[1]+"\t| "+menus[2]+"\t| "+menus[3]+"\t| "+menus[4]);
				System.out.println(bar);
				
//				if(cnt==0){
//					System.out.println("입력하신 내용이 없습니다");
//				}else{
//					String[] stu=db.split("\n");
//					for(int i=0; i<stu.length; i++){
//						String[] studb=stu[i].split(" ");
//						for(int j=0; j<studb.length; j++){
//							System.out.print(studb[j]);
//							System.out.print("\t");
//						}
//						System.out.println();
//					}
//				}
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					System.out.print(stu.num);
					System.out.print("\t");
					System.out.print(stu.name);
					System.out.print("\t");
					System.out.print(stu.kor);
					System.out.print("\t");
					System.out.print(stu.eng);
					System.out.print("\t");
					System.out.println(stu.math);
				}
				
				System.out.println(bar);
				
				
			}else if(input==3){//상세보기
				
			}else if(input==4){//삭제
				
			}else if(input==5){//저장
				
			}else{
				System.out.println("메뉴를 확인하고 입력하세요");
			}
		
		}
		System.out.println("이용해 주셔서 감사합니다");
	}

}












