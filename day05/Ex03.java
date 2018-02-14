// 주석 : 프로그래머가 소스코드를...
// 한줄 주석
/*
	다행 주석
*/

class Ex03{

public static void main(String[] args){
	/* 
	제어문
	   ├─조건문(만약 ~~ 이라면) 
	   │   if문(if,if else, if else if else), switch문
	   └─반복문	
		for문, while문, do~while문
		for(초기화;조건;증감){}
		초기화; while(조건){증감;}
		초기화; do{증감;}while(조건);
	*/
	switch(1){
		case 1: System.out.println("1 run"); break;
		case 2: System.out.println("2 run");
	}


	for(int a=0; a<5; a++){
		break;
		System.out.println("for문"+(a+1)+"번");
	}
	System.out.println("-------------------------");
	int b=0;
	boolean result=true;
	while(true){
		System.out.println("while문"+(b+1)+"번");
		if(b==4){break;}
		b++;
	}
	System.out.println("b="+b);
}

}





