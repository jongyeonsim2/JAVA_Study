package ch15;

import java.io.*;
/***
 * 표준 입출력 대상 변경 예제 => 시스템 운영시 로그 기록에 활용 가능.
 */

public class StandardIOEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 표준 입출력 대상 변경시 지정된 PrintStream 으로 변경해야 함.
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			
			// 표준 입출력 대상 변경
			fos = new FileOutputStream("C:\\workspace-eclipse-java-2023-06\\JAVA_Study\\src\\ch15\\text.txt");
			ps = new PrintStream(fos);
			
			// 표준 입출력은 자동 생성됨으로 제공되는 메소드를 사용하기만 하면 됨.
			// System.out 의 출력을 변경. ( 콘솔에서 파일로 변경됨. )
			System.setOut(ps);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// System.out => 콘솔로 출력이 되지 않음.
		System.out.println("Hello By System.out");
		
		// System.err => 콘솔로 출력이 됨.
		System.err.println("Hello By System.err");
		
		
	}

}
