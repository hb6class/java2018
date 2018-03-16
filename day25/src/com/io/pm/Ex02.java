package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		Vector temp=null;
		Vector temp2=null;
		File file = new File("./ex02.bin");
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			Vector vec1=new Vector();
			vec1.addElement("abcd");
			vec1.addElement(1234);
			vec1.addElement(true);
			
			oos.writeObject(vec1);
			oos.flush();
			
			Vector vec2=new Vector();
			vec2.addElement('A');
			vec2.addElement("AFDASF");
			
				Vector vec3=new Vector();
				vec3.addElement('A');
				vec3.addElement("AFDASF");
				vec3.addElement(false);
			
			vec2.addElement(vec3);
			
			oos.writeObject(vec2);
			oos.flush();
			
			
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			temp=(Vector) ois.readObject();
			temp2=(Vector) ois.readObject();
			
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
				Vector tmp3=(Vector) temp2.get(i);
				for(int j=0; j<tmp3.size(); j++){
					System.out.println(tmp3.get(j));
				}
			}
		}

	}

}














