package com.hb.thr;

public class Ex09 extends Thread{
	int dan;
	
	public Ex09(int dan) {
		this.dan=dan;
	}
	
	@Override
		public void run() {
			if(dan==4){
				System.out.println("4���� ��ó�� �������� �ʵ��� �纸");
				yield();
				System.out.println("�纸��");
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
		me.suspend();//�Ͻ�����
		me.resume();//���
		me.stop();//����
	}

}
