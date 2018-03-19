package com.net.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) {
		final int port =3000;
		ServerSocket serv=null;
		Socket sock =null;
		
		try {
			System.out.println("서버 start...");
			serv=new ServerSocket(port);
			while(true){
				System.out.println("접속 대기중...");
				sock=serv.accept();
				System.out.println("접속 완료");
				InetAddress local = sock.getLocalAddress();
				System.out.println("local ip:"+local.getHostAddress());
				SocketAddress remote = sock.getRemoteSocketAddress();
				System.out.println("client name:"+((InetSocketAddress) remote).getHostName());
				InetAddress addr = ((InetSocketAddress) remote).getAddress();
				System.out.println("client ip:"+addr.getHostAddress());
				
				InputStream is = sock.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				int su=0;
				byte[] buff=new byte[2];
				char[] cbuf=new char[50];
				StringBuffer msg=new StringBuffer();
				while(true){
					su=isr.read(cbuf);
					if(su==-1){break;}
					System.out.println(new String(cbuf,0,su));
	//				msg.append(su);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				sock.close();
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
