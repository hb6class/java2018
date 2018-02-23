package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// Á¤·Ä
		int[] arr={3,5,1,4,2};
		for(int j=0; j<arr.length-1; j++){
			for(int i=1+j; i<arr.length; i++){
				if(arr[j]>arr[i]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
