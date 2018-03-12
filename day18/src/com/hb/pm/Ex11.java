package com.hb.pm;

import java.util.Arrays;
import java.util.List;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9};
//		int[] copyArr=Arrays.copyOf(arr, 5);
//		for(int i=0; i<copyArr.length; i++){
//			System.out.println(copyArr[i]);
//		}
		List<String> list = Arrays.asList("a","ab","abc","abcd");
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		int[] arr2=new int[5];
		Arrays.fill(arr2,1,4, 100);
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("--------------------------------");
		int[] arr3={45,33,1,25,42,10};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = {1,3,5,7,9};
		System.out.println(arr==arr4);
		System.out.println(arr.equals(arr4));
		System.out.println(Arrays.equals(arr, arr4));
//		System.out.println(Arrays.deepEquals(new Object[2], new Object[2]));
		
		
	}

}












