package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// 배열
		// 자료형[] 변수명 = new 자료형[개수];
		// 변수명[인덱스]
		// 	인덱스
		// 	- 0부터 시작, 연속된 숫자
		//  - 시작 = 0, 끝 = 배열갯수-1
		// 초기화
		// 변수명[인덱스]=초기값;
		
		int[] arr1= new int[5];
		
		for(int i=0; i<5; i++){
			arr1[i]=i+1;
		}
		for(int i=0; i<5; i++){
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
//		int a0=1;
//		int a1=4;
//		int a2=10;
//		int a3=6;
//		int a4=2;
		System.out.println("------------------------");
//		int[] arr2=new int[5]{1,4,10,6,2};
		int[] arr2=new int[]{1,4,10,6,2};
//		arr2[0]=1;
//		arr2[1]=4;
//		arr2[2]=10;
//		arr2[3]=6;
//		arr2[4]=2;
		for(int i=0; i<5; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("------------------------");
//		int[] arr3=new int[5]{1,4,10,6,2};
//		int[] arr3=new int[]{1,4,10,6,2};
		int[] arr3={1,4,10,6,2};
		for(int i=0; i<5; i++){
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
	}

}
