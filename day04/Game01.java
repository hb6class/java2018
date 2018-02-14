/*

가위바위보 게임(ver 0.0.1)
-----------------------------------------
1.가위 2.바위 3.보 >>>1
당신 : 가위
컴퓨터 : 보
결과 : 이겼다
계속하시겠습니까?(1.계속 0.종료):1
1.가위 2.바위 3.보 >>>1
당신 : 가위
컴퓨터 : 바위
결과 : 졌다
계속하시겠습니까?(1.계속 0.종료):1
1.가위 2.바위 3.보 >>>1
당신 : 가위
컴퓨터 : 바위
결과 : 졌다
계속하시겠습니까?(1.계속 0.종료):0
누적 1승 0무 2패
이용해주셔서 감사합니다
*/

class Game{

	public static void main(String[] args){
		Game game=new Game();

		while(true){
		int me=game.input(1,3,"1.가위 2.바위 3.보>>>");
		int com=game.com();
		System.out.println("당신:"+game.data(me));
		System.out.println("컴퓨터:"+game.data(com));
		int su=game.result(me, com);
		if(su==-1){
			System.out.println("졌다");
		}else if(su==1){
			System.out.println("이겼다");
		}else{
			System.out.println("비겼다");
		}
		su=game.input(0,1,"계속하시겠습니까?(1.계속 0.종료):");
			if(su==0){
				break;
			}
		}
		System.out.println("감사합니다!!!!");
	}

	public String data(int su){
		String msg="보";
		if(su==1){
			msg="가위";
		}else if(su==2){
			msg="바위";
		}
		return msg;
	}

	public int input(int start,int end,String msg){
		// 1~3
		// 0~1
		
		int su=-1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		while(true){
			if(su<start || su>end){

				System.out.print(msg);
				su=sc.nextInt();
			}else{
				break;
			}
		}
		return su;
	}

	public int com(){
		// 1~3
		// 0<=Math.random<1
		// -1 0~2 -> 0<=Math.random<3
		int su=(int)(Math.random()*3)+1;
		return su;
	}

	public int result(int me, int com){
		// 졌다(-1), 비겼다(0), 이겼다(1)
		int su=0;
		if(me==1 &&com==2){
			su=-1;
		}else if(me==1 &&com==3){
			su=1;
		}else if(me==2 && com==1){
			su=1;
		}else if(me==2 && com==3){
			su=-1;
		}else if(me==3 && com==1){
			su=-1;
		}else if(me==3 && com==2){
			su=1;
		}else{
			su=0;
		}

		return su;
	} 

}












