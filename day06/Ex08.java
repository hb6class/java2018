class Ex08{

public static void main(String[] args){

	//Ex08.func01();
	Ex08 me;
	me=new Ex08();
	System.out.println(me);
	me=new Ex08();
	System.out.println(me);
	//me.func02();
	//me.func03();
}//main end

// static -> static : (클래스명).메서드명();

// static -> non-static : 객체 생성 후 참조변수를 통해 접근
//			ex)참조변수=객체생성; 참조변수.메서드명();

// non-static -> static : (클래스명).메서드명();

	public static void func01(){
		System.out.println("func01");
		Ex08 me;
		me=new Ex08();
		me.func02();
	}
	public void func02(){
		System.out.println("func02");
		func03();
	}
	public void func03(){
		//func01();
		System.out.println("func03");
	}



}//class end









