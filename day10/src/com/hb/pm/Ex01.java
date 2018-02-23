package com.hb.pm;

/*
 * 배열
 * 
 * 
 * 
 * 
*/

public class Ex01 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
		System.out.print("arr1:");
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		// 배열복사 - 얕은복사
		int[] arr2 =arr1;
		
		System.out.print("arr2:");
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		arr2[1]=22222222;
		
		System.out.print("arr1:");
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("arr2:");
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		// 배열복사 - 깊은복사
		int[] arr3;
		arr3=new int[arr1.length];
		
		for(int i=0; i<arr3.length; i++){
			arr3[i]=arr1[i];
		}
		
		//arr3[1]=2;
		
		System.out.println("-----------------------------");
		System.out.print("arr1:");
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("arr3:");
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println(arr1==arr3);
	}

}











