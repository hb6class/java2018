package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// �ζǹ�ȣ������
		Ball[] balls = new Ball[45];
		
		int[] memo = new int[6];
		String[] memo2 = new String[6];
		
		for(int i=0; i<balls.length; i++){
			if(i<10){
				balls[i]=new Ball(i+1,"���");
			}else if(i<20){
				balls[i]=new Ball(i+1,"�Ķ�");
			}else if(i<30){
				balls[i]=new Ball(i+1,"����");
			}else{
				balls[i]=new Ball(i+1,"����");				
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
			System.out.println(memo2[i]+"�� ��"+memo[i]+"�� ");
		}
		
	}	
}


















