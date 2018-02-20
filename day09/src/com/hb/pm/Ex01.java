package com.hb.pm;
/*
 * "Java Web Spring"
 * 
 * int start=0, end;
 * 
 * 0~3, 5~7, 9~14
 * 
 * 
 * Q3. 띄어쓰기로 잘라서 
 * 		String[] 에 담아 출력하시오
 * 		>> str[0]="Java"
 * 		>> str[1]="Web"
 * 		>> str[2]="Spring"
 * 
*/
public class Ex01 {

	public static void main(String[] args) {
		String msg="Java Web Spring";
		int cnt=0;
		
		for(int i=0; i<msg.length(); i++){
			if(msg.charAt(i)==' '){
				cnt++;
			}
		}
		
//		String[] box=msg.split(" ");
		
		String[] box=new String[cnt+1];
		for(int i=0; i<box.length; i++){
			box[i]="";
		}
		
//		int start, end, idx;
//		start=0; 
//		end=0;
//		idx=0;
//		for(int i=0; i<msg.length(); i++){
//			if(msg.charAt(i)==' ' || i==msg.length()-1){
//				if(i==msg.length()-1){
//					end+=2;
//				}
//				char[] temp=new char[end-start+1];
//				System.out.println(temp.length);
//				for(int j=0; j<temp.length; j++){
//					temp[j]=msg.charAt(start+j);
//				}
//				
//				box[idx++]=new String(temp);
//				start=i+1;
//			}else{
//				end++;
//			}
//		}
		
		
		char[] chs=msg.toCharArray();
		int idx=0;
		for(int i=0; i<chs.length; i++){
			if(chs[i]==' '){
				idx++;
			}else{
				box[idx]+=chs[i]+" ";
			}
		}
		
		for(int i=0; i<box.length; i++){
			System.out.println("str["+i+"]="+box[i]);
		}
		
	}

}










