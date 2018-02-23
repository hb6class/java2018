package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// 로또번호생성기
		Ball[] balls = new Ball[45];
		
		int[] memo = new int[6];
		String[] memo2 = new String[6];
		
		for(int i=0; i<balls.length; i++){
			if(i<10){
				balls[i]=new Ball(i+1,"노랑");
			}else if(i<20){
				balls[i]=new Ball(i+1,"파랑");
			}else if(i<30){
				balls[i]=new Ball(i+1,"빨강");
			}else{
				balls[i]=new Ball(i+1,"검정");				
			}
		}
		
		
		for(int i=0; i<memo.length; i++){
			// 0~44
			Ball ball=balls[(int)(Math.random()*45)];
			if(ball.marking){
				i--;
				continue;
			}
				
			memo[i]=ball.showNum();
			memo2[i]=ball.color;
			ball.marking=true;
		}
		
		for(int i=0; i<memo.length; i++){
			System.out.println(memo2[i]+"색 공"+memo[i]+"번 ");
		}
		
	}	
}


















