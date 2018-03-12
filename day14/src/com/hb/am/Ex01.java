package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ======================================
 * �л������������α׷�(ver 0.1.1)
 * ======================================
 * �� �ο�>
 * 1.��ü���� 2.�Է� 3.�󼼺��� >1
 * ---------------------------------------------------
 * �й�	|	����	|	����	|	����	|	����
 * ---------------------------------------------------
 * 	1		ȫ�浿		0			0			0		
 * 	2		�踻��		0			0			0		
 * ---------------------------------------------------
 * 
 * �Է½�>����ó��
 * 
 * �����Է½� > �����Է¿����ذ�
 * �̸� > 3��
 * �� ���� > �ּ� 0��~100��
 * 
 * 
 */
class Student{
	String name="-";
	int kor,eng,math;
	
}

public class Ex01 {
	
	public static String inputName(String msg){
		Scanner sc = new Scanner(System.in);
		String name="";
		while(name.length()!=3){
			System.out.print(msg);
			name=sc.nextLine();
		}
		return name;
	}
	
	public static int inputNumber(int start, int end,String msg){
		Scanner sc = new Scanner(System.in);
		// 0 ~ 3
		// 0 ~ 100
		// 1 ~ 
		int su=-1;
		do{
			System.out.print(msg);
			try{
				su =sc.nextInt();
			}catch(InputMismatchException ex){
				sc = new Scanner(System.in);
			}
		}while(su<start || su>end);
		return su;
	}

	public static void main(String[] args) {
		String title="======================================"
						+"\n�л������������α׷�(ver 0.1.1)"
						+"\n======================================";
		System.out.println(title);
		int num=0;
		int tot=inputNumber(1,Integer.MAX_VALUE,"�� �ο�>");
		// tot�� ��ŭ �迭 ����
		Student[] data=new Student[tot];
		for(int i=0; i<data.length; i++){
			data[i]=new Student();
		}
		int menu=0;
		
		while(true){
		menu=inputNumber(0,3,"1.��ü���� 2.�Է� 3.�󼼺��� 0.����>");
			if(menu==0){
				break;
			}else if(menu==1){
				// ��ü ����Ʈ
				String tableHeader="---------------------------------------------------------------------------"
					+"\n�й�\t|\t����\t|\t����\t|\t����\t|\t����"
					+"\n---------------------------------------------------------------------------";
				System.out.println(tableHeader);
				for(int i=0; i<data.length; i++){
					Student stu=data[i];
					System.out.print(i+1);
					System.out.print("\t|\t");
					System.out.print(stu.name);
					System.out.print("\t|\t");
					System.out.print(stu.kor);
					System.out.print("\t|\t");
					System.out.print(stu.eng);
					System.out.print("\t|\t");
					System.out.println(stu.math);
				}
				System.out.println("---------------------------------------------------------------------------");
			}else if(menu==2 && num<tot){
				// �Է�
				Student stu=data[num];
				num++;
				stu.name=inputName(num+"�� �̸�>");
				stu.kor=inputNumber(0,100,num+"�� ����>");
				stu.eng=inputNumber(0,100,num+"�� ����>");
				stu.math=inputNumber(0,100,num+"�� ����>");
			}else if(menu==2){
				System.out.println("����л��� �Է��� �������ϴ�!!");
				
			}else if(menu==3){
				// �󼼺���
				int target=inputNumber(1,data.length,"�й�>")-1;
				
				Student stu=data[target];
				
				System.out.println("------------------------");
				System.out.println("�й� : "+(target+1));
				System.out.println("------------------------");
				System.out.println("�̸� : "+stu.name);
				System.out.println("------------------------");
				System.out.println("���� : "+stu.kor);
				System.out.println("���� : "+stu.eng);
				System.out.println("���� : "+stu.math);
				System.out.println("------------------------");
				
			}else{
				// �߸��Է�
				System.out.println("ġ���� ����");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}






















