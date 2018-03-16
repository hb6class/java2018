package com.net.sock2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1.문제 맞추시오?");
		list.add("2.문제 맞추시오?");
		list.add("3.문제 맞추시오?");
		list.add("4.문제 맞추시오?");
		list.add("5.문제 맞추시오?");
		ServerSocket serv=null;
		
		InputStream is =null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStream os=null;
		try {
			serv=new ServerSocket(3000);
			System.out.println("서버 대기중");
			Socket sock=serv.accept();
			is = sock.getInputStream();
			os = sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			for(int i=0; i<list.size(); i++){
				os.write((list.get(i)+"\n").getBytes());
				String msg="응답메시지:"+br.readLine();
				System.out.println(msg);
			}
			os.write(("exit\n").getBytes());
			System.out.println("서버종료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			try {
				br.close();
				isr.close();
				is.close();
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
