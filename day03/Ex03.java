class Ex03{

 public static void main(String[] args){
	//제어문
  		// 조건문
			// if문(만약 ~~이라면)
			//if(조건-t/f){실행문;}
			//if(조건-t/f){실행문;}else{실행문;}
			/*if(조건-t/f){
				실행문;
				}else if(조건){
				실행문;
				}else if(조건){
				실행문;
				}else if(조건){
				...
				}else{
				실행문;
				}
			*/
			/* switch문
			switch(값){
				case 값1:
					실행문;
					break;
				case 값2:
					실행문;
					break;
				case 값3:
					실행문;
					break;
				default:
					실행문;
					break;
			}
			*/
	int a=-10;
	System.out.print("a는 ");
	
	if(a==0){
	 System.out.print(0);
	}else if(a>=0){
	 System.out.print("양수");
	}else{
	 System.out.print("음수");
	}

	System.out.println("입니다...");
 }

}