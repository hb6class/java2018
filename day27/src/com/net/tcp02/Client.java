package com.net.tcp02;

import java.awt.Frame;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client extends Thread {
	InputStream is;
	
	public Client() {
		
	}
	
	static class Ui extends Frame{
	static TextArea ta;

	public Ui() {
			ta=new TextArea();
			add(ta);
			setBounds(1600+400,0,300,400);
			setVisible(true);
		}
	}
	
	@Override
	public void run() {
		try {
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			Ui ui=new Ui();
			while(true){
					ui.ta.setText(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		final String ip="203.236.209.193";
		final int port =3000;
		Scanner sc = new Scanner(System.in);
		Socket sock =null;
		try {
			System.out.println("서버 접속 준비...");
			sock =new Socket(ip,port);
			System.out.println("서버 접속...");
			
			Client cli = new Client();
			
			OutputStream os = sock.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			
			cli.is = sock.getInputStream();
			
			cli.start();
			
			while(true){
				String msg=sc.nextLine();
				osw.write(msg+"\n");
				osw.flush();
				if(msg.equals("exit")){break;}
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
