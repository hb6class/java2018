class Ex06{

public static void main(String[] args){

	System.out.println("-----------------");
	System.out.println("xxx프로그램");
	System.out.println("-----------------");
	System.out.print("(1.입력 2.삭제 0.종료)>>>");
	int input=0;
	System.out.println(input);
	switch(input){
		case 0:System.out.println("종료합니다");
		//	break;
		case 1:System.out.println("입력합니다");
		//	break;
		case 2:System.out.println("삭제합니다");
			break;
		default:System.out.println("잘못입력하셨습니다");
		//	break;
	}//switch end
}//main end

}//class end