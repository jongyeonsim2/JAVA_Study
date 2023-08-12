package ch14;

import java.util.function.*;
import java.util.*;

/**
 * java.util.function 의 함수형 인터페이스를 활용한 
 * 사용자 정의 함수 구현 및 사용 예제
 * 
 * Supplier 	: 매개변수 없고, 반환값 있음.
 * Consumer		: 매개변수만 있음.
 * Predicate	: 조건식에 사용. 매개변수 하나, 반환값은 boolean.
 * Function		: 매개변수 하나, 반환값 있음.
 * 
 * 1. 함수형 인터페이스로 람다식을 만담.
 * 2. 함수형 인터페이스를 매개변수로 정의한 함수 구현.
 *    매개변수의 함수형 인터페이스의 추상 메소드로 실행. => 람다식이 실행이 됨.
 * 3. main() 함수에서 구현된 함수 호출, 람다식을 매개변수로 사용.
 *    
 * 
 */

public class LambdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 함수형 인터페이스로 람다식 작성
		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;//return 생략하고 식으로 작성.
		Consumer<Integer> c = i -> System.out.println(i + ", ");
		Predicate<Integer> p = i -> i % 2 == 0;
		// 매개변수, 반환값 있음.
		Function<Integer, Integer> f = i -> i/10*10;//return 생략하고 식으로 작성.
		
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s, list);
		
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
		
	}
	
	// 2. 함수형 인터페이스를 매개변수로 정의한 함수 구현.

	/*
	 * list 에 요소를 추가하는 함수
	 * 첫 번째 매개변수 : Function 함수형 인터페이스
	 * 두 번째 매개변수 : list
	 * 
	 */
	static <T> List <T> doSomething(Function<T, T> f, List<T> list) {
		// 반환을 위한 list를 만들어서 사용.
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
	
	/*
	 * list의 요소를 출력하는 함수 
	 * 첫 번째 매개변수 : Predicate
	 * 두 번째 매개변수 : Consumer
	 * 세 번째 매개변수 : list
	 * 
	 */
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		
		for(T i : list) {
			if(p.test(i))    // 짝수인지 여부 확인. test() 는 Predicate 의 추상메소드.
							// test() 를 구현한 코드는 람다식으로 위에서 구현되어 있음.
				c.accept(i); // 출력. accept()는 Consumer 의 추상메소드임.
							// accept() 를 구현한 코드는 위에서 람다식으로 구현함.
		}
		
	}
	
	
	/*
	 * list에 새로운 요소를 random 값으로 추가
	 * 첫 번째 매개변수 : Supplier
	 * 두 번째 매개변수 : list
	 */
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for (int i = 0; i < 10; i++ ){
			list.add(s.get());
		}
	}
	

}
