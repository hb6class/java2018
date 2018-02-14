class Ex06{

public static void func01(){
	System.out.println("func01 run...");
	return ;
}//func01 end

public static byte func03(){
	return 127;
}

public static void main(String[] args){
	System.out.println("main start");
	// 자바의 기본문법
	// 자바의 기본 요소
	// 메서드
	int su=func03();
	System.out.println(su);
	System.out.println("main end");
}//main메서드 end

// 메서드 사용법
// public static [void ||자료형] 메서드이름(인자...){
// 	실행문;
// 	return [x];
// }


public static int func02(int i, int j){
	int x=i;
	int y=j;
	int z=x+y;
	return z;
}

}//class end