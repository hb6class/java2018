class Ex08{

	public static void main(String[] args){

		int a=5;
		/*
		while(true){
			System.out.print(a);
			if(a==0){break;}
			System.out.print("+");
			a--;
		}
		*/
		int sum=func(a);
		System.out.println("="+sum);
	}

	public static int func(int a){
		System.out.print(a);
		if(a==0){return 0;}
		System.out.print("+");
		return a+func(--a);
	}

}





