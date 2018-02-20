package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		// 1~10까지 중 홀수 만 출력하시오
		int a=1;
		for(int i=0; i<5; i++){
			a=i*2+1;
			System.out.print(a+" ");
		}
		System.out.println("\n--------------------\n");
		a=1;
		for(int i=0; i<10; i++){
			if(i%2==0){
				a=1+i;
				System.out.print(a+" ");
			}			
		}
		System.out.println("\n--------------------\n");
		int[] arr1 = new int[10];
		for(int i=0; i<10; i++){
			arr1[i]=i+1;
		}
		for(int i=0; i<10; i+=2){
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n--------------------\n");
		int[] arr2 = new int[5];
		for(int i=0; i<5; i++){
			arr2[i]=i*2+1;
		}
		for(int i=0; i<5; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n--------------------\n");
	}

}









