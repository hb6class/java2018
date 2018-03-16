package com.io.am;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Ex08 {

	public static void main(String[] args) {
		FileReader fr=null;
		StreamTokenizer stken=null;
		try {
			fr=new FileReader("./data/text07.txt");
			stken=new StreamTokenizer(fr);
			while(stken.nextToken()!=StreamTokenizer.TT_EOF){
				switch (stken.ttype) {
				case StreamTokenizer.TT_NUMBER:
					System.out.println(stken.nval);
					break;
				case StreamTokenizer.TT_WORD:
					System.out.println(stken.sval);					
					break;

				default:
					System.out.println((char)stken.ttype);					
					break;
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
