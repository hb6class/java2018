package com.net.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread {
	InputStream is;
	static ArrayList<OutputStream> list=new ArrayList<OutputStream>();
	
	Server(InputStream is){
		this.is=is;
	}
	
	@Override
	public void run() {
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			while(true){
					String msg=br.readLine();
					if(msg==null){break;}
					msg+="\n";
					for(int i=0; i<list.size(); i++){
						list.get(i).write(msg.getBytes());
					}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(3000);
			while(true){
				Socket sock=serv.accept();
				InputStream is = sock.getInputStream();
				OutputStream os = sock.getOutputStream();
				
				list.add(os);
				
				Server ser = new Server(is);
				ser.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

















