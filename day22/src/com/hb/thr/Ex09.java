package com.hb.thr;

public class Ex09 extends Thread{
	int dan;
	
	public Ex09(int dan) {
		this.dan=dan;
	}
	
	@Override
		public void run() {
			if(dan==4){
				System.out.println("4단은 맨처음 시작하지 않도록 양보");
				yield();
				System.out.println("양보함");
			}
			for(int i=1; i<10; i++){
				System.out.println(dan+"x"+i+"="+(dan*i));
			}
			
		}

	public static void main(String[] args) {
		Ex09 me = new Ex09(2);
		Ex09 me2 = new Ex09(4);
		Ex09 me3 = new Ex09(6);
		me.start();
		me2.start();
		me3.start();
		me.suspend();//일시정지
		me.resume();//계속
		me.stop();//종료
	}

}
