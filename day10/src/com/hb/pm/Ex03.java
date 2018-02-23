package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr1={1,3,5};
		int[] arr2=arr1;
		
		System.out.println("arr1引arr2:"+(arr1==arr2));
		
		int[] arr3={1,5,3};//new int[arr1.length];
//		System.arraycopy(arr1, 0, arr3, 0, arr3.length);
//		System.out.println("arr1引arr3:"+(arr1==arr3));
//		System.out.println("arr1引arr3:"+(arr1.equals(arr3)));
		int[] arr4={1,2,3,5};
		//System.out.println("arr1引arr4:"+same(arr1,arr4));
		System.out.println(arr4);
		func(arr4);
	}
	
	public static void func(int[] arr){
		System.out.println("func:"+arr);
	}
	
	public static boolean same(int[] arr1, int[] arr3){
		boolean result=true;
		if(arr1.length!=arr3.length){
			result=false;
		}else{
			for(int i=0; i<arr3.length; i++){
				if(arr1[i]!=arr3[i]){
					result=false;
				}
			}
		}
		return result;
	}

}
