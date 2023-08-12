package ch14;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * java.util.function 패키지의 함수형 인터페이스의 활용 예제
 */
public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 요소 하나 하나가 값인 자료 구조임. => 매개변수가 하나 인 함수형 인터페이스로 보면 됨.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
			list.add(i);
		
		/**
		 * ArrayList 에서 제공해주는 메소드를 사용.
		 * API 의 원형을 확인 => 함수형 인터페이스를 확인 
		 * => java.util.function 패키지 의 함수형 인터페이스
		 */
		
		// ArrayList.forEach()
		/*
		 * forEach() 메소드의 매개변수 타입 : Consumer<? super E>
		 * Consumer : 매개변수가 하나이고, 반환값이 없음. => 이 기준으로 람다식을 만들면 됨.
		 * 
		 * 예) System.out.println() => 반환값이 없고, 매개변수가 하나를 사용할 수 있는 함수.
		 */
		list.forEach( i -> System.out.println(i + ",") ); 
		
		// ArrayList.removeIf()
		/*
		 * removeIf 메소드의 매개변수 타입 : Predicate<? super E>
		 * Predicate : 조건식 표현에 사용, 매개변수는 하나, 반환값은 boolean
		 * 
		 * 예) 1 == 2 (false) , 1 == 1 (true)
		 */
		// list 요수 중에서 2 또는 3의 배수만 제거
		// x%2==0 || x%3==0
		list.removeIf(x -> x%2==0 || x%3==0);
		System.out.println(list);
		
		// ArrayList.replaceAll()
		/*
		 * replaceAll 메소드의 매개변수 타입 : UnaryOperator<E>
		 * UnaryOperator : Function 의 자식. 
		 * 					하나의 매개변수로 결과를 반환.(매개변수와 반환 결과의 타입이 달라도 됨.)
		 * 				   UnaryOperator 는 매개변수와 반환 결과의 타입이 동일해야 함.
		 * 
		 * 예 ) 매개변수도 정수, 반환값도 정수 => UnaryOperator
		 *     i -> i * 10
		 */
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		
		
		// key, value 로 저장된 자료 구조임. => 매개변수가 두 개인 함수형 인터페이스로 보면 됨.
	}

}






