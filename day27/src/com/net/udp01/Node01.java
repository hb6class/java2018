package com.net.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;

public class Node01 {

	public static void main(String[] args) {
		
		DatagramSocket ds=null;
		
		DatagramPacket dp=null;
		byte[] buf = "Hello".getBytes();
		try {
			ds=new DatagramSocket();
			InetAddress addr=InetAddress.getByName("203.236.209.193");
			dp=new DatagramPacket(buf, buf.length, addr, 3000);
			ds.send(dp);
			buf="2¹øÂ°".getBytes();
			dp=new DatagramPacket(buf, buf.length, addr, 3000);
			ds.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			ds.close();
		}
		

	}

}
