package com.hb.pm;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * String db="";
 * 
 * ------------------------------------------------------------
 * �л������������α׷�(ver. 0.3.0)
 * -------------------------------------------------------------
 * 1.�Է� 2.���� 3.�󼼺��� 4.���� 0.����>1
 * �̸�>ȫ�浿
 * ����>90
 * ����>87
 * ����>84
 * 1.�Է� 2.���� 3.�󼼺��� 4.���� 0.����>2
 * ----------------------------------------------------------
 * �й�		| �̸�		| ����	|����	| ����
 * ----------------------------------------------------------
 * 1			ȫ�浿		90		87		84
 * ----------------------------------------------------------
 * 1.�Է� 2.���� 3.�󼼺��� 4.���� 0.����>1
 * �̸�>ȫ�浿
 * ����>90
 * ����>87
 * ����>84
 * 1.�Է� 2.���� 3.�󼼺��� 4.���� 0.����>2
 * ----------------------------------------------------------
 * �й�		| �̸�		| ����	|����	| ����
 * ----------------------------------------------------------
 * 1			ȫ�浿		90		87		84
 * 1			ȫ�浿		90		87		84
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
	final static String title="�л������������α׷�(ver. 0.3.0)";
	final static String menu="1.�Է� 2.���� 3.�󼼺��� 4.���� 5.���� 0.����>";
	final static String[] menus={"�й�","�̸�","����","����","����"};
	
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
			}else if(input==1){//�Է�
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
				
			}else if(input==2){//����
				System.out.println(bar);
				System.out.println(menus[0]+"\t| "+menus[1]+"\t| "+menus[2]+"\t| "+menus[3]+"\t| "+menus[4]);
				System.out.println(bar);
				
//				if(cnt==0){
//					System.out.println("�Է��Ͻ� ������ �����ϴ�");
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
				
				
			}else if(input==3){//�󼼺���
				
			}else if(input==4){//����
				
			}else if(input==5){//����
				
			}else{
				System.out.println("�޴��� Ȯ���ϰ� �Է��ϼ���");
			}
		
		}
		System.out.println("�̿��� �ּż� �����մϴ�");
	}

}












