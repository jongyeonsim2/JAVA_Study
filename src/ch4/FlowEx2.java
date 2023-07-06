package ch4;

import java.util.*;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("숫자를 입력하세요. > ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력한 숫자는 0 임.");
		} 
		
		if(input!=0) {
			System.out.println("입력한 숫자는 0 이 아님.");
			System.out.println("입력한 숫자는 " + input + " 임.");
		}
	
	}

}
