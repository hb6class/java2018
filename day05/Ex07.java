class Ex07{

	public static void main(String[] args){
	// 계산기
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("첫번째 수:");
	int a=sc.nextInt();
	System.out.print("두번째 수:");
	int b=sc.nextInt();
	System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기:");
	int c=sc.nextInt();
	int d=0;
		switch(c){
			case 1: d=plus(a,b); break;
			case 2: d=minus(a,b); break;
			case 3: d=multi(a,b); break;
			case 4: d=div(a,b); break;
		}//switch end
	show(a,b,c,d);
	}//main end

	public static void show(int a, int b, int c, int d){
		// 출력담당
		String st="나누";
		switch(c){
			case 1: st="더하"; break;
			case 2: st="빼"; break;
			case 3: st="곱하"; break;
		}//switch end
		//System.out.print(""+a+ch+b+"="+d);
		//System.out.print(d+"="+a+ch+b);
		System.out.println(a+"와 "+b+"를 "+st+"면 "+d+"입니다");
	}

	public static int div(int a, int b){
		return a/b;
	}

	public static int multi(int a, int b){
		return a*b;
	}

	public static int minus(int a, int b){
		return a-b;
	}

	public static int plus(int a, int b){
		return a+b;
	}
	

}//class end