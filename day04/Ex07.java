class Ex07{

public static void main(String[] args){
	// * * * *5
	// * * * *10
	// * * * *15
	// * * * *20

	char star='¡Ú';
	
	for(int i=0; i<20; i++){
		if(i%5==0){
		System.out.println();
		}else{
		System.out.print(star);
		}
	}
	System.out.println("\n\n----------------\n\n");
	for(int j=0; j<4; j++){
		for(int i=0; i<4; i++){
			System.out.print(star);
		}
		System.out.println();
	}
	System.out.println("\n\n----------------\n\n");
	int cnt=0;
	while(cnt<20){
		if(cnt%5==0){
		System.out.println();	
		}else{
		System.out.print(star);
		}
		cnt++;
	}
	System.out.println("\n\n----------------\n\n");
	cnt=0;
	while(cnt<4){
		System.out.println("¡Ú¡Ú¡Ú¡Ú");
		cnt++;
	}
	System.out.println("\n\n----------------\n\n");
	int ch=(int)'A';
	cnt=1;
	while(cnt<=12){
		System.out.print((ch++)-64);
		if(cnt!=0 && cnt%4==0){
			System.out.println();
		}
		cnt++;
	}
	System.out.println("\n\n----------------\n\n");
	int q2=65;
	int cnt3=0;
	while(cnt3<3){
		int cnt2=0;
		while(cnt2<cnt3+1){
		System.out.print(q2-64);
		q2++;
		cnt2++;
		}
		System.out.println();
		cnt3++;
	}

}

}











