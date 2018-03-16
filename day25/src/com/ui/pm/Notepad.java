package com.ui.pm;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Notepad extends Frame implements ActionListener {
	int x,y;
	TextArea ta;
	public Notepad() {
		super("제목없음");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		MenuBar mb=new MenuBar();
		Menu mn1=new Menu("파일");
		String[] msgs={"열기","저장","종료","정보"};
		MenuItem[] mnItm1=new MenuItem[3];
		for(int i=0; i<mnItm1.length; i++){
			mnItm1[i]=new MenuItem(msgs[i]);
			if(i==2){
				mn1.addSeparator();
			}
			mnItm1[i].addActionListener(this);
			mn1.add(mnItm1[i]);
		}
		
		
		mb.add(mn1);
		Menu mn2=new Menu("도움말");
		MenuItem mnItm2=new MenuItem("정보");
		mnItm2.addActionListener(this);
		mn2.add(mnItm2);
		mb.add(mn2);
		setMenuBar(mb);
		
		
		ta = new TextArea();
		add(ta);
		
		Dimension screan = kit.getScreenSize();
		Dimension frame=new Dimension(400,400);
		x=screan.width/2-frame.width/2+1600;
		y=screan.height/2-frame.height/2;
		setBounds(x, y, frame.width, frame.height);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Notepad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(((MenuItem)e.getSource()).getLabel());
		String msg=((MenuItem)e.getSource()).getLabel();
		if(msg.equals("종료")){
			dispose();
		}else if(msg.equals("정보")){
			final Dialog dia = new Dialog(this,"정보");
			dia.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dia.setVisible(false);
				}
			});
			int x=this.getX()+(int)this.getWidth()/2-300/2;
			int y=this.getY()+(int)this.getHeight()/2-200/2;
			dia.setBounds(x, y, 300, 200);
			dia.setVisible(true);
		}else{ 
			FileDialog dia=new FileDialog(this);
			int x=this.getX()+(int)this.getWidth()/2-300/2;
			int y=this.getY()+(int)this.getHeight()/2-200/2;
			dia.setBounds(x, y, 300, 200);
			String title=getTitle();
			if(msg.equals("열기")){
				dia.setMode(FileDialog.LOAD);
				dia.setVisible(true);
				title=dia.getFile();
				File f = new File(dia.getDirectory(),dia.getFile());
				FileReader fr=null;
				BufferedReader br=null;
				try {
					fr=new FileReader(f);
					br=new BufferedReader(fr);
					while(true){
						String temp=br.readLine();
						if(temp==null){break;}
						if(ta.getText().trim().equals("")){
							ta.setText(temp);
						}else{
							ta.setText(ta.getText()+"\n"+temp);
						}
					}
					setTitle(title);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally{
					try {
						br.close();
						fr.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
			}else if(msg.equals("저장")){
				dia.setMode(FileDialog.SAVE);
				dia.setVisible(true);
				File f=null;
				try{
					f=new File(dia.getDirectory(),dia.getFile());
				}catch(Exception ex){
					return;
				}
				FileWriter fw=null;
				BufferedWriter bw=null;
				PrintWriter pw=null;
				try {
					f.createNewFile();
					fw=new FileWriter(f);
					bw=new BufferedWriter(fw);
					pw=new PrintWriter(bw);
					
					pw.print(ta.getText());
					
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally{
					try {
						pw.close();
						bw.close();
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

}
















