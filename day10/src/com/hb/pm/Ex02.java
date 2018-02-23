package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// 배열의 깊은복사
		int[] arr1={1,3,5,7};
		//1.
		int[] arr2=new int[arr1.length];
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr1[i];
		}
		//2.
		int[] arr3=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, 4);
//		System.arraycopy(원본-변수명
//						,원본-복사시작의인덱스
//						,사본-변수명
//						,사본-복사시작의인덱스
//						,사본-복사할 갯수)
		
		
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("arr1:arr3"+(arr1==arr3));
		
	}

}









