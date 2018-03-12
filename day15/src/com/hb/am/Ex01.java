package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ----------------------------------------------
 * MyBBS게시판 (ver 0.0.1)
 * ----------------------------------------------
 * 1.목록 2.글쓰기 3.글삭제>2
 * 제목>test1
 * 내용>testtest
 * 1.목록 2.글쓰기 3.글삭제>1
 * ------------------------------------
 * 	제목	|	내용
 * ----------------------------------------------
 * 	test1	|	test01
 * ----------------------------------------------
 * 1.목록 2.글쓰기 3.글삭제>2
 * 
*/

public class Ex01 {
	
	static class Bbs{
		static int cnt;
		int num;
		String title;
		String content;
		
		public Bbs() {
			cnt++;
			num=cnt;
		}
		
		public String show(){
			return num+"\t|\t"+title+"\t|\t"+content;
		}
	}
	
	static class MyArray{
		Bbs[] objs;
		
		public MyArray() {
			objs=new Bbs[0];
		}
		
		public void remove(int idx){
			if(objs.length>0 && idx<objs.length){
				Bbs[] temp=new Bbs[objs.length-1];
				for(int i=0; i<idx; i++){
					temp[i]=objs[i];
				}
				for(int i=idx+1; i<objs.length; i++){
					temp[i-1]=objs[i];
				}
				objs=temp;
			}
		}
		
		public void add(Bbs obj){
			Bbs[] temp=new Bbs[objs.length+1];
			for(int i=0; i<objs.length; i++){
				temp[i]=objs[i];
			}
			objs=temp;
			objs[objs.length-1]=obj;
		}
		
		public Bbs get(int index){
			return objs[index];
		}
		
		public int size(){
			return objs.length;
		}
	}
	

	public static void main(String[] args) {
		String bar="----------------------------------------------------";
		String title="MyBBS게시판 (ver 0.0.1)";
		String tableHeader="글번호\t|\t제목\t|\t내용";
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		String menu="1.목록 2.글쓰기 3.글삭제 0.종료>";
		int input=-1;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		MyArray arr=new MyArray();
		while(true){
			System.out.print(menu);
			try{
				input=sc.nextInt();
			}catch(InputMismatchException ex){
				sc = new Scanner(System.in);
			}catch(Exception ex){
				
			}
			if(input==0){
				break;
			}else if(input==1){//목록
				System.out.println(bar);
				System.out.println(tableHeader);
				System.out.println(bar);
				
//				for(int i=0; i<arr.size(); i++){
//					String[] bbs=(String[])arr.get(i);
//					System.out.print(bbs[0]);
//					System.out.print("\t\t|\t");
//					System.out.println(bbs[1]);
//					System.out.println(bar);
//				}
				
				for(int i=0; i<arr.size(); i++){
					Bbs bbs=arr.get(i);
					System.out.println(bbs.show());
					System.out.println(bar);
				}
				
			}else if(input==2){//입력
				// String[]
//				String[] bbs=new String[2];
//				System.out.print("제목>");
//				bbs[0]=sc2.nextLine();
//				System.out.print("내용>");
//				bbs[1]=sc2.nextLine();
//				arr.add(bbs);
				
				// Object
				Bbs bbs= new Bbs();
				System.out.print("제목>");
				bbs.title=sc2.nextLine();
				if(bbs.title.equals("")){
					bbs.title="제목없음";
				}
				System.out.print("내용>");
				bbs.content=sc2.nextLine();
				arr.add(bbs);
				
			}else if(input==3){//삭제
				System.out.print("글번호>");
				int idx=-1;
				try{
					idx=sc.nextInt();
					arr.remove(idx-1);
				}catch(InputMismatchException ex){
					sc=new Scanner(System.in);
				}catch(Exception ex){
					
				}
			}else{
				System.out.println("입력을 확인하세요!");
			}
			
			
			
		}
	}

}





















