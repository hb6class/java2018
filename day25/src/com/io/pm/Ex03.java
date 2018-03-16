package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList temp=null;
		ArrayList temp2=null;
		File file = new File("./ex02.bin");
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			ArrayList vec1=new ArrayList();
			vec1.add("abcd");
			vec1.add(1234);
			vec1.add(true);
			
			oos.writeObject(vec1);
			oos.flush();
			
			ArrayList vec2=new ArrayList();
			vec2.add('A');
			vec2.add("AFDASF");
			
			ArrayList vec3=new ArrayList();
				vec3.add('A');
				vec3.add("AFDASF");
				vec3.add(false);
			
			vec2.add(vec3);
			
			oos.writeObject(vec2);
			oos.flush();
			
			
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			temp=(ArrayList) ois.readObject();
			temp2=(ArrayList) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<temp.size(); i++){
			System.out.println(temp.get(i));
		}
		for(int i=0; i<temp2.size(); i++){
			if(i<2){
				System.out.println(temp2.get(i));
			}else{
				ArrayList tmp3=(ArrayList) temp2.get(i);
				for(int j=0; j<tmp3.size(); j++){
					System.out.println(tmp3.get(j));
				}
			}
		}

	}

}














