package com.net.tcp01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		final String ip="203.236.209.193";
		final int port =3000;
		Scanner sc = new Scanner(System.in);
		Socket sock =null;
		try {
			System.out.println("���� ���� �غ�...");
			sock =new Socket(ip,port);
			System.out.println("���� ����...");
			
			OutputStream os = sock.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			while(true){
				String msg=sc.nextLine();
				if(msg.equals("exit")){break;}
				osw.write(msg);
				osw.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
