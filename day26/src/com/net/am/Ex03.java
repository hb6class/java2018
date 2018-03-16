package com.net.am;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Ex03 {

	public static void main(String[] args) {
		URL url=null;
		// ��������://������:��Ʈ��ȣ/�н�?����
		// �������� = ��Ź��
		// ������ = ��ǻ�� �ּ�
		// ��Ʈ = �������� ��ǻ���� ������� (0 ~ 65535)(~1024) ~2999(x)
		// �н� = ��û����
		// ���� = ��û(�������� �䱸����)
		try {
			url=new URL("http://www.seoul.go.kr/v2012/seoul/?tr_code=top_menu04");
			String host=url.getHost();
			System.out.println(host);
			InetAddress addr=InetAddress.getByName(host);
			System.out.println(addr.getHostAddress());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getProtocol());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
