package com.hb.am;

import java.util.Scanner;

/*
 * ======================================
 * 학생성적관리프로그램(ver 0.1.0)
 * ======================================
 * 총원>5
 * 1.전체보기 2.입력 3.상세보기 >1
 * -----------------------------------
 * 학번	|	국어	|	영어	|	수학
 * -----------------------------------
 * 	1		0			0			0		
 * 	2		0			0			0		
 * 	3		0			0			0		
 * 	4		0			0			0		
 * 	5		0			0			0		
 * -----------------------------------
 * 1.전체보기 2.입력 3.상세보기 >2
 * 국어>90
 * 영어>80
 * 수학>70
 * 1.전체보기 2.입력 3.상세보기 >1
 * -----------------------------------
 * 학번	|	국어	|	영어	|	수학
 * -----------------------------------
 * 	1		90			80			70		
 * 	2		0			0			0		
 * 	3		0			0			0		
 * 	4		0			0			0		
 * 	5		0			0			0		
 * -----------------------------------
 * 1.전체보기 2.입력 3.상세보기 >2
 * 국어>80
 * 영어>80
 * 수학>80
 * 1.전체보기 2.입력 3.상세보기 >1
 * -----------------------------------
 * 학번	|	국어	|	영어	|	수학
 * -----------------------------------
 * 	1		90			80			70		
 * 	2		80			80			80			
 * 	3		0			0			0		
 * 	4		0			0			0		
 * 	5		0			0			0	
 * -----------------------------------
 * 1.전체보기 2.입력 3.상세보기 >2
 * 국어>70
 * 영어>70
 * 수학>70
 * 1.전체보기 2.입력 3.상세보기 >1
 * -----------------------------------
 * 학번	|	국어	|	영어	|	수학
 * -----------------------------------
 * 	1		90			80			70		
 * 	2		80			80			80		
 * 	3		70			70			70			
 * 	4		0			0			0		
 * 	5		0			0			0	
 * -----------------------------------
 * 1.전체보기 2.입력 3.상세보기 >3
 * 학번>2
 * -----------------------------------
 * 학번 : 2
 * -----------------------------------
 * 국어 : 80		
 * 영어 : 80		
 * 수학 : 80		
 * -----------------------------------
 * 합계 : 000		
 * -----------------------------------
 * 
 * 
*/
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.println("======================================");
		System.out.print("총원:");
		int tot=sc.nextInt();
		int[][] stus=new int[tot][3];
		int cnt=0;
		int input=0;
		while(true){
			System.out.print("1.전체보기 2.입력 3.상세보기 0.종료>");
			input=sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				listAll(stus);
			}else if(input==2){
				if(cnt>=tot){
					System.out.println("더이상 입력하실 학생이 없습니다");
				}else{
					System.out.print("국어>");
					int kor=sc.nextInt();
					System.out.print("영어>");
					int eng=sc.nextInt();
					System.out.print("수학>");
					int math=sc.nextInt();
									
					listAdd(cnt++, stus,kor,eng,math);
				}
			}else if(input==3){
				System.out.print("학번:");
				int num =sc.nextInt();
				if(num>0 && num<=tot){
					listOne(stus,num);
				}else{
					System.out.println(num+"학번은 존재하지 않습니다");
				}
			}else{
				System.out.println("입력이 잘못되었습니다\n메뉴를 확인하시고 다시 입력바랍니다");
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}
	
	public static void listAll(int[][] stus){
		//전체보기
		System.out.println(" -----------------------------------------------------");
		System.out.println(" 학번\t|\t국어\t|\t영어\t|\t수학");
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
		// 입력
		int[] stu=stus[a];
		stu[0]=kor;
		stu[1]=eng;
		stu[2]=math;
	}
	public static void listOne(int[][] stus, int num){
		//상세보기
		int[] stu=stus[num-1];
		System.out.println(" -----------------------------------------------------");
		System.out.println(" 학번 : "+num);
		System.out.println(" -----------------------------------------------------");
		System.out.println(" 국어 : "+stu[0]);
		System.out.println(" 영어 : "+stu[1]);
		System.out.println(" 수학 : "+stu[2]);
		System.out.println(" -----------------------------------------------------");
		int sum=0;
		for(int i=0; i<stu.length; i++){
			sum+=stu[i];
		}
		System.out.println(" 합계 :"+sum);
		System.out.println(" -----------------------------------------------------");
		
	}

}















