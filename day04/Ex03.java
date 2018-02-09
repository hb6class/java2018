class Ex03{

public static void main(String[] args){
//2ÀÇ1½Â 2ÀÇ2½Â 2ÀÇ3½Â 2ÀÇ4½Â 2ÀÇ 5½ÂÀ» Ãâ·ÂÇÏ¼¼¿ä
	int before=1;
	int cnt=0;
	while(cnt<5){
		System.out.println(before*2);
		before=before*2;
		cnt++;
	}
	System.out.println("-------------------");

System.out.println(1*2);
System.out.println(1*2*2);
System.out.println(1*2*2*2);
System.out.println(1*2*2*2*2);
System.out.println(1*2*2*2*2*2);
	System.out.println("-------------------");

System.out.println(2);
//+2
System.out.println(4);
//+4
System.out.println(8);
//+8
System.out.println(16);
//+16
System.out.println(32);

System.out.println("-------------------");
	int after=2;
	cnt=0;
	while(cnt<5){
		System.out.println(after);
		after=after+after;
		cnt++;
	}
	System.out.println("-------------------");

System.out.println(2);
System.out.println(2*2);
System.out.println(2*2*2);
System.out.println(2*2*2*2);
System.out.println(2*2*2*2*2);
	System.out.println("-------------------");
}

}