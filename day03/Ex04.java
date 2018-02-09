class Ex04{

public static void main(String[] args){

 System.out.println("------------------");
 System.out.println("xxxx프로그램");
 System.out.println("------------------");
 System.out.println("메뉴를 선택하세요");
 System.out.print("(1.보기 2.입력 3.삭제 0.종료)>>>");
 int input=2;
 System.out.println(input);
 if(input<0 || input>3){
	System.out.println("잘못입력하셨습니다");
 }else if(input<=1){
	System.out.println("보기 선택");
 }else if(input<=2){
	System.out.println("입력 선택");
 }else if(input<=3){
	System.out.println("삭제 선택");
 }
}

}