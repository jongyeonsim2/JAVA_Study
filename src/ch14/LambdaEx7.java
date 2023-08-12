package ch14;

import java.util.function.*;

/*
 * Function 합성, Predicate 결합 의 사용 예제
 */

public class LambdaEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Function 합성 - andThen()
		
		// 16 진수 문자열 s 를 정수 10 진수로 변환
		// 매개변수 : 16 진수 문자열
		// 반환값 : 정수 10 진수
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		
		// 정수의 매개변수를 이진수 문자열로 변환.
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g);
		
		// 매개변수 : 16 진수 문자열
		// 결과값 : 이진수 문자열
		// "FF" -> 255 ( f )
		// 255 -> 11111111 ( g ) 
		System.out.println("h.apply() : " + h.apply("FF"));
//		System.out.println(Integer.parseInt("FF", 16));
		
		
		
		// 2. Function 합성 - compose()
		// 매개변수 : 정수
		// 결과값 : 10진 정수
		Function<Integer, Integer> h2 = f.compose(g);
		System.out.println("h2.apply() : " + h2.apply(2));
		
		
		
		// 3. Predicate 결합 - and(), or(), negate()
		Predicate<Integer> p = i -> i < 100; //100보다 작으면, true, 그외는 false
		Predicate<Integer> q = i -> i < 200; //200보다 작으면, true, 그외는 false
		
		
		
	}

}









