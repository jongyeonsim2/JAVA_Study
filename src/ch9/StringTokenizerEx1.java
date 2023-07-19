package ch9;

import java.util.*;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "100,200,300,400,500";
		
		// 구분자를 token 으로 사용하지 않는 생성자.
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 구분자를 token 으로 사용하는 생성자.
		String data2 = "x=100*(200+300)/2";
		
		// 
		StringTokenizer st2 = new StringTokenizer(data2, 
								"+-*ㅡ=()", 
								true); // true : 구분자를 token으로 사용.
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
		// 구분자를 2중으로 처리해야 하는 경우
		String data3 = "1,학생1,100,100,100|2,학생2,97,80,99|3,학생3,90,80,100";
		
		// 구분자를 "|" 에 대한 StringTokenizer => 학생 3명에 대한 데이터로 구분
		StringTokenizer st3 = new StringTokenizer(data3, "|");
		
		while(st3.hasMoreTokens()) {
			String token = st3.nextToken(); // 학생 1명에 대한 정보
			
			// 구분자를 "," 로 StringTokenizer => 학생 1명에 대한 데이터로 구분
			StringTokenizer st4 = new StringTokenizer(token, ",");
			
			while(st4.hasMoreTokens()) {
				System.out.println(st4.nextToken());
			}
			
			System.out.println("-----");
		}
			
		
		
	}

}





