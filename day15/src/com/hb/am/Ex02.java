package com.hb.am;

class Node{
	int val;
	Node node;
}

class MyLink{
	// 객체를 이용한 동적할당
	int cnt;
	Node start;
	
	public int get(int idx){
		int su=0;
		Node temp=start;
		for(int i=0; i<idx; i++){
			temp=temp.node;
		}
		su=temp.val;
//		// 0
//		su=start.val;
//		// 1
//		su=start.node.val;
//		// 2
//		su=start.node.node.val;
//		// 3
//		su=start.node.node.node.val;
		
		return su;
	}
	
	public void add(int a){
		if(cnt==0){
			// 1
			start=new Node();
			start.val=a;
			cnt++;
		}else{
			Node temp=start;
			while(true){
				if(temp.node==null){
					break;
				}
				temp=temp.node;
			}
			temp.node=new Node();
			temp.node.val=a;
			cnt++;
//			// 2
//			start.node=new Node();
//			start.node.val=a;
//			// 3
//			start.node.node=new Node();
//			start.node.node.val=a;
//			// 4
//			start.node.node.node=new Node();
//			start.node.node.node.val=a;
		}
	}
}

class MyArr{
	// 배열의 이용한 동적할당
	int[] arr;
	
	public MyArr() {
		arr=new int[0];
	}
	
	public void add(int a){
		int[] temp = new int[arr.length+1];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr=temp;
		arr[arr.length-1]=a;
	}
	
	public int get(int idx){
		return arr[idx];
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		MyLink arr1=new MyLink();
		arr1.add(1111);
		arr1.add(2222);
		arr1.add(33);
		arr1.add(444);
		arr1.add(5555);
		for(int i=0; i<arr1.cnt; i++){
			System.out.println(arr1.get(i));
		}
	}

}
