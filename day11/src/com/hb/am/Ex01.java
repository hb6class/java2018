package com.hb.am;

import java.util.Scanner;

/*
 * ======================================
 * �л������������α׷�(ver 0.1.0)
 * ======================================
 * �ѿ�>5
 * 1.��ü���� 2.�Է� 3.�󼼺��� >1
 * -----------------------------------
 * �й�	|	����	|	����	|	����
 * -----------------------------------
 * 	1		0			0			0		
 * 	2		0			0			0		
 * 	3		0			0			0		
 * 	4		0			0			0		
 * 	5		0			0			0		
 * -----------------------------------
 * 1.��ü���� 2.�Է� 3.�󼼺��� >2
 * ����>90
 * ����>80
 * ����>70
 * 1.��ü���� 2.�Է� 3.�󼼺��� >1
 * -----------------------------------
 * �й�	|	����	|	����	|	����
 * -----------------------------------
 * 	1		90			80			70		
 * 	2		0			0			0		
 * 	3		0			0			0		
 * 	4		0			0			0		
 * 	5		0			0			0		
 * -----------------------------------
 * 1.��ü���� 2.�Է� 3.�󼼺��� >2
 * ����>80
 * ����>80
 * ����>80
 * 1.��ü���� 2.�Է� 3.�󼼺��� >1
 * -----------------------------------
 * �й�	|	����	|	����	|	����
 * -----------------------------------
 * 	1		90			80			70		
 * 	2		80			80			80			
 * 	3		0			0			0		
 * 	4		0			0			0		
 * 	5		0			0			0	
 * -----------------------------------
 * 1.��ü���� 2.�Է� 3.�󼼺��� >2
 * ����>70
 * ����>70
 * ����>70
 * 1.��ü���� 2.�Է� 3.�󼼺��� >1
 * -----------------------------------
 * �й�	|	����	|	����	|	����
 * -----------------------------------
 * 	1		90			80			70		
 * 	2		80			80			80		
 * 	3		70			70			70			
 * 	4		0			0			0		
 * 	5		0			0			0	
 * -----------------------------------
 * 1.��ü���� 2.�Է� 3.�󼼺��� >3
 * �й�>2
 * -----------------------------------
 * �й� : 2
 * -----------------------------------
 * ���� : 80		
 * ���� : 80		
 * ���� : 80		
 * -----------------------------------
 * �հ� : 000		
 * -----------------------------------
 * 
 * 
*/
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.println("======================================");
		System.out.print("�ѿ�:");
		int tot=sc.nextInt();
		int[][] stus=new int[tot][3];
		int cnt=0;
		int input=0;
		while(true){
			System.out.print("1.��ü���� 2.�Է� 3.�󼼺��� 0.����>");
			input=sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				listAll(stus);
			}else if(input==2){
				if(cnt>=tot){
					System.out.println("���̻� �Է��Ͻ� �л��� �����ϴ�");
				}else{
					System.out.print("����>");
					int kor=sc.nextInt();
					System.out.print("����>");
					int eng=sc.nextInt();
					System.out.print("����>");
					int math=sc.nextInt();
									
					listAdd(cnt++, stus,kor,eng,math);
				}
			}else if(input==3){
				System.out.print("�й�:");
				int num =sc.nextInt();
				if(num>0 && num<=tot){
					listOne(stus,num);
				}else{
					System.out.println(num+"�й��� �������� �ʽ��ϴ�");
				}
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�\n�޴��� Ȯ���Ͻð� �ٽ� �Է¹ٶ��ϴ�");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	public static void listAll(int[][] stus){
		//��ü����
		System.out.println(" -----------------------------------------------------");
		System.out.println(" �й�\t|\t����\t|\t����\t|\t����");
		System.out.println(" -----------------------------------------------------");
		for(int i=0; i<stus.length; i++){
			
			System.out.print(i+1);
			for(int j=0; j<stus[i].length; j++){
				System.out.print("\t|\t"+stus[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(" -----------------------------------------------------");
	}
	
	public static void listAdd(int a,int[][] stus,int kor, int eng, int math){
		// �Է�
		int[] stu=stus[a];
		stu[0]=kor;
		stu[1]=eng;
		stu[2]=math;
	}
	public static void listOne(int[][] stus, int num){
		//�󼼺���
		int[] stu=stus[num-1];
		System.out.println(" -----------------------------------------------------");
		System.out.println(" �й� : "+num);
		System.out.println(" -----------------------------------------------------");
		System.out.println(" ���� : "+stu[0]);
		System.out.println(" ���� : "+stu[1]);
		System.out.println(" ���� : "+stu[2]);
		System.out.println(" -----------------------------------------------------");
		int sum=0;
		for(int i=0; i<stu.length; i++){
			sum+=stu[i];
		}
		System.out.println(" �հ� :"+sum);
		System.out.println(" -----------------------------------------------------");
		
	}

}















