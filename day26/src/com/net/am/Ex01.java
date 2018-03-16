package com.net.am;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		InetAddress addr1=null;
		InetAddress[] addr2=null;
		InetAddress[] addr3=null;
		
		try {
			addr1=InetAddress.getByName("localhost");
			addr2=InetAddress.getAllByName("daum.net");
			addr3=InetAddress.getAllByName("www.daum.net");
			
			System.out.println(addr1.getHostName());
			System.out.println("--------------------------------");
			System.out.println(addr1.getHostName());
			System.out.println(addr1.getHostAddress());
			System.out.println("--------------------------------");
			for(int i=0; i<addr2.length; i++){
				System.out.println(addr2[i].getHostAddress());				
			}
			System.out.println("--------------------------------");
			for(int i=0; i<addr3.length; i++){
				System.out.println(addr3[i].getHostAddress());				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 

	}

}
