package com.net.am;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Ex03 {

	public static void main(String[] args) {
		URL url=null;
		// 프로토콜://도메인:포트번호/패스?쿼리
		// 프로토콜 = 통신방식
		// 도메인 = 컴퓨터 주소
		// 포트 = 도메인의 컴퓨터의 열린통로 (0 ~ 65535)(~1024) ~2999(x)
		// 패스 = 요청문서
		// 쿼리 = 요청(접속자의 요구사항)
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
