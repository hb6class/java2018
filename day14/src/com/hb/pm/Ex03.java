package com.hb.pm;

public class Ex03 {
	static int[] arr01 = new int[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(100);
		add(200);
		add(300);
		add(100);
		add(200);
		add(300);
		add(100);
		add(200);
		add(300);
		for(int i=0; i<arr01.length; i++){
			System.out.println(arr01[i]);
		}
	}
	
	public static void add(int su){
		int[] temp=null;
		temp=new int[arr01.length+1];
		for(int i=0; i<arr01.length; i++){
			temp[i]=arr01[i];
		}
		arr01=temp;
		arr01[arr01.length-1]=su;
		
	}

}













