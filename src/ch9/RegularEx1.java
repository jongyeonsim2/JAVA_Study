package ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식(Regular Expression) 사용 예제
 */

public class RegularEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data = {
			"bat","baby","bonus","cA","ca","c.","c0","car"
			,"combat","count","data","disc"
		};
		
		//1. Pattern 객체 생성, 정규 표현식을 매개변수
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 영단어
		
		//2. 생성된 Pattenn 객체에서 Matcher 객체를 가져옴
		for(int i=0; i < data.length; i++) {
			//3. Matcher객체의 matches() 메소드로 결과 추출
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i] + ",");
		}

	}

}
