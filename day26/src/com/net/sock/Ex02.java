package com.net.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02 {

	public static void main(String[] args) {
		ServerSocket serv=null;
		
		InputStream is =null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStream os=null;
		try {
			serv=new ServerSocket(3000);
			System.out.println("���� �����");
			Socket sock=serv.accept();
			is = sock.getInputStream();
			os = sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String msg="����޽���:"+br.readLine();
				if(msg==null){break;}
				os.write((msg+"\n").getBytes());
//				System.out.println(msg);
			}
			System.out.println("��������");
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
