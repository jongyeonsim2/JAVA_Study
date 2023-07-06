package ch4;

import java.util.*;

class FlowEx7 {
	public static void main(String[] args) { 
	
		//0.0 <= Math.random() < 1.0 => com 이 사용할 1,2,3 생성해야 함.
		//System.out.println(Math.random());
		
		//0.0 X 3 <= Math.random() < 1.0 X 3
		//0.0 <= Math.random() < 3.0
		//System.out.println(Math.random() * 3);
		
		//0.0 + 1 <= Math.random() < 3.0 +1
		//1.0 <= Math.random() < 4.0
		//System.out.println(Math.random() * 3 + 1);
		
		System.out.println((int)(Math.random() * 3 + 1));
		
/*
		int user, com;

		System.out.print("가위(1),바위(2), 보(3) 중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp);

		com = (int)(Math.random() * 3) + 1;

		System.out.println("당신은 "+ user +"입니다.");
		System.out.println("컴은  "+ com +"입니다.");

		switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
	//			break;		// 마지막 문장이므로 break를 사용할 필요가 없다. 
		}

		
*/
	} // main의 끝
}
