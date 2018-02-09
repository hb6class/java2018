/*
Q1. 1~10까지 중 짝수를 출력하시오
	-> 2 4 6 8 10

Q2. 1~50까지의 합계를 구하시오
	-> 1~50의 합계는 xxx입니다

Q3. 구구단 7단을 출력하시오
	7x1=7
	7x2=14
	7x3=21
	...
	7x9=63
*/

class Ex09{

public static void main(String[] args){
	for(int a=2;a<=10; a++){
	System.out.print(a+" ");
	a++;
	}
	System.out.println("------------------");
	int sum=0;
	for(int a=1; a<=50; a++){
		sum+=a;//sum=sum+a;
	}
	System.out.println("1~50의 합계는 "+sum+"입니다");
	System.out.println("------------------");
	int dan=2;
	for(int a=1; a<10; a++){
	System.out.println(dan+"x"+a+"="+dan*a);
	}
}

}














