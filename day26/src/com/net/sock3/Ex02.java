package com.net.sock3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex02 extends Thread {
	Socket mySock;
	static ArrayList<Socket> list=new ArrayList<Socket>();
	
	public void allPush(String msg){
		for(int i=0; i<list.size(); i++){
			Socket temp = list.get(i);
			try {
				OutputStream os = temp.getOutputStream();
				os.write(msg.getBytes());
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			is=mySock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			while(true){
				String msg=br.readLine();
				allPush(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(3000);
			while(true){
				Socket temp = serv.accept();
				list.add(temp);
				Ex02 me =new Ex02();
				me.mySock=temp;
				me.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
