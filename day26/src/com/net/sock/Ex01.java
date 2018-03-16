package com.net.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 클라이언트
		InetAddress addr=null;
		Socket sock=null;
		OutputStream os = null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		Scanner sc= new Scanner(System.in);
		try {
			addr = InetAddress.getByName("203.236.209.193");//getLocalHost();
			sock=new Socket(addr,3000);
			System.out.println("접속 시도...");
			os = sock.getOutputStream();
			is = sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			while(true){
				System.out.print(">");
				String msg=sc.nextLine();
				if("exit".equals(msg)){break;}
				os.write((msg+"\n").getBytes());
				os.flush();
				System.out.println(br.readLine());
			}
			
			System.out.println("클라이언트 접속 종료");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				os.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
