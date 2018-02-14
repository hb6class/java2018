class Ex03{

public static void main(String[] args){
	System.out.println("ex03 run");
}

public static void func01(){
	System.out.println("Ex03 func01 run....");
}

}// ex03 class end


class Ex33{

public static void main(String[] args){
	System.out.println("ex33 run");
	Ex03.func01();
}

}// ex33 class end