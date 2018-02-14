class Ex22{
	public static void func01(){
		System.out.println("22클래스의 func01 run...");
	}

	public void func02(){
		System.out.println("22클래스의 func02 run...");
	}
}// 22class end

class Ex02{

	public static void main(String[] args){
		Ex22 you;
		you=new Ex22();
		you.func02();
	}

	public static int func01(){
		System.out.println("static method run...");
		return 0;
	}

	public int func02(){
		System.out.println("non-static method run...");
		return 100;
	}

}// 02class end