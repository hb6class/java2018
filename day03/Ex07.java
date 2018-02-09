/*
성적관리프로그램

kor=95
eng=69
math=87;
.........
결과 출력
합계 : xxx
평균 : xx.xx
학점 : A학점
.........
학점의 기준
A학점 : 평균 90이상
B학점 : 평균 80이상
C학점 : 평균 70이상
D학점 : 평균 60이상
F학점 : 평균 60미만
*/

class Ex07{


public static void main(String[] args){

	System.out.println("-------------------");
	System.out.println("성적관리프로그램");
	System.out.println("-------------------");

	int kor=100;
	int eng=100;
	int math=100;
	int sum=kor+eng+math;
	double avg=sum*100/3/100.0;

	System.out.println("합계 : "+sum);
	System.out.println("평균 : "+avg);
	switch((int)avg/10){
	case 10:
	case 9:
	System.out.println("학점 : A학점");
	break;
	case 8:
	System.out.println("학점 : B학점");
	break;
	case 7:
	System.out.println("학점 : C학점");
	break;
	case 6:
	System.out.println("학점 : D학점");
	break;
	default:
	System.out.println("학점 : F학점");
	break;
	}
	/*
	if(avg>=90){
	System.out.println("학점 : A학점");
	}else if(avg>=80){
	System.out.println("학점 : B학점");
	}else if(avg>=70){
	System.out.println("학점 : C학점");
	}else if(avg>=60){
	System.out.println("학점 : D학점");
	}else{
	System.out.println("학점 : F학점");
	}
	*/
}

}










