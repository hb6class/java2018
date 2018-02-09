class Ex08{

  public static void main(String[] args){
	// do while문

	// do{
	// 실행문;
	// ...
	// }while(조건);
	int a=5;
	int b=5;

	while(a<5){
		System.out.println("while문 run");
		a++;
	}

	System.out.println("-----------------");

	do{
		System.out.println("do while문 run");
		b++;
	}while(b<5);

  }


}