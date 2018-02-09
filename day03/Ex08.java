class Ex08{

public static void main(String[] args){

	// 제어문 - 반복문
	// for문
	/*
	for(1.초기화; 2.조건식; 3.증감){
		...4.명령문;
	}
	
	1.->2.┬(true)->4. ->3. ->2.┬(true)->4.
	      └(false)->out        └(false)->out
	*/
	int a=0;

	for(a=10;a>0;a-=3){
	System.out.println("test..."+a);
	}
	System.out.println(a);


}// main end


}//class end