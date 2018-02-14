class Ex01{

public static void main(String[] args){ //메서드
	int a=100;
	a=10;
	//a=010; 8진수
	a=0xa;
	System.out.println("16진수 변수a="+a);
	a=0xb;
	System.out.println("16진수 변수a="+a);
	a=0xc;
	System.out.println("16진수 변수a="+a);
	a=0xd;
	System.out.println("16진수 변수a="+a);
	a=0xe;
	System.out.println("16진수 변수a="+a);
	a=0xf;
	System.out.println("16진수 변수a="+a);
	a=0x10;
	System.out.println("16진수 변수a="+a);
	// 변수의 선언 : 자료형 변수명;
	// 초기화(최초 값의 대입) : 변수명=값;
	// 수: 10진수 정수
	//byte
	//short
	//int
	//long
	// 수: 실수
	//float
	//double
	System.out.println("----------------------");
	double b1=1.000000001f;
	double b2=1.0000002f;
	double b3=b1+b2;//2.000000000000021;
	System.out.println(b3);
}

}