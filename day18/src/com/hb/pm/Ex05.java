package com.hb.pm;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream myOut = System.out;// �ý���-���
		myOut.println("test");
//		InputStream myIn=System.in; // �ý��� - �Է�
//		Scanner sc = new Scanner(myIn);
//		if(sc.nextInt()==0){
////			System.exit(0); ��������
////			System.exit(-1); ������Ȳ���� ����
//			System.exit(0);
//			return;
//		}
		System.out.println("����ϴٰ� ����");
		Map<String,String> map = System.getenv();
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> ite = set.iterator();
		while(ite.hasNext()){
			Entry<String, String> entry = ite.next();
			System.out.print("key:"+entry.getKey());
			System.out.println(", value:"+entry.getValue());
		}
	}

}
















