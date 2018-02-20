package com.hb.pm;

// 1/2+2/3+3/4+4/5+...999/1000=?

// (1-1/2)+(1-1/3)+(1-1/4)+...+(1-1/1000)=?

public class Ex10 {
	public static void main(String[] args) {
		double sum=0.0;
		
		for(int i=1; i<1000; i++){
			sum+=1.0*i/(i+1);
		}

		System.out.println("sum="+sum);
		System.out.println("----------------------");
		double sum2=0.0;
		
		for(int i=2; i<=1000; i++){
			sum2+=1-1.0/i;
		}
		System.out.println("sum2="+sum2);
		
		
	}

}
