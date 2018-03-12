package com.hb.pm;

public class MyArray {
	Object[] arr;
	
	public MyArray() {
		arr=new Object[0];
	}
	
	public Object get(int index){
		return arr[index];
	}
	
	public void add(Object su){
		Object[] temp=null;
		temp=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		arr=temp;
		arr[arr.length-1]=su;
	}
	
	public void show(){
		System.out.print("[");				
		for(int i=0; i<arr.length; i++){
			if(i!=0){
				System.out.print(",");				
			}
			System.out.print(arr[i]);
		}
		System.out.println("]");				
	}
	
}
