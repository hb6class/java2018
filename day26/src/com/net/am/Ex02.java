package com.net.am;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		URL url=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		PrintWriter pw=null;
		try {
			File file = new File("./data/naver.html");
			url=new URL("https://www.naver.com/");
			is = url.openStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			fw=new FileWriter(file);
			pw=new PrintWriter(fw);
			
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				pw.println(msg);
				System.out.println(msg);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				pw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
