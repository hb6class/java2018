class Ex01{

public static void main(String[] args){

	//제어문 - 반복문
	// while문
	// while(조건){
	//   실행문;
	// }
	int a=0;
	boolean result=true;
	while(result){
		a++;
		System.out.print(2*a+" ");
		if(a==5){
			result=false;
		}
	}
}//main end

}//class end