package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ======================================
 * 학생성적관리프로그램(ver 0.1.1)
 * ======================================
 * 총 인원>
 * 1.전체보기 2.입력 3.상세보기 >1
 * ---------------------------------------------------
 * 학번	|	성명	|	국어	|	영어	|	수학
 * ---------------------------------------------------
 * 	1		홍길동		0			0			0		
 * 	2		김말자		0			0			0		
 * ---------------------------------------------------
 * 
 * 입력시>예외처리
 * 
 * 숫자입력시 > 문자입력오류해결
 * 이름 > 3자
 * 각 점수 > 최소 0점~100점
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
						+"\n학생성적관리프로그램(ver 0.1.1)"
						+"\n======================================";
		System.out.println(title);
		int num=0;
		int tot=inputNumber(1,Integer.MAX_VALUE,"총 인원>");
		// tot수 만큼 배열 생성
		Student[] data=new Student[tot];
		for(int i=0; i<data.length; i++){
			data[i]=new Student();
		}
		int menu=0;
		
		while(true){
		menu=inputNumber(0,3,"1.전체보기 2.입력 3.상세보기 0.종료>");
			if(menu==0){
				break;
			}else if(menu==1){
				// 전체 리스트
				String tableHeader="---------------------------------------------------------------------------"
					+"\n학번\t|\t성명\t|\t국어\t|\t영어\t|\t수학"
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
				// 입력
				Student stu=data[num];
				num++;
				stu.name=inputName(num+"번 이름>");
				stu.kor=inputNumber(0,100,num+"번 국어>");
				stu.eng=inputNumber(0,100,num+"번 영어>");
				stu.math=inputNumber(0,100,num+"번 수학>");
			}else if(menu==2){
				System.out.println("모든학생의 입력이 끝났습니다!!");
				
			}else if(menu==3){
				// 상세보기
				int target=inputNumber(1,data.length,"학번>")-1;
				
				Student stu=data[target];
				
				System.out.println("------------------------");
				System.out.println("학번 : "+(target+1));
				System.out.println("------------------------");
				System.out.println("이름 : "+stu.name);
				System.out.println("------------------------");
				System.out.println("국어 : "+stu.kor);
				System.out.println("영어 : "+stu.eng);
				System.out.println("수학 : "+stu.math);
				System.out.println("------------------------");
				
			}else{
				// 잘못입력
				System.out.println("치명적 오류");
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}






















