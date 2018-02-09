class Ex06{

public static void main(String[] args){
	int t='a'-'A';
	int ch=(int)'A'+t;

	while(ch<=(int)'Z'+t){
	System.out.print((char)ch+"\t");
	ch++;
	}

}


}