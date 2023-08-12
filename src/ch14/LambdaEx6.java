package ch14;

/**
 * 기본형을 사용하는 함수형 인터페이스
 */

import java.util.function.*;
import java.util.*;

class LambdaEx6 {
	public static void main(String[] args) {
		
		//Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
		// 기본형 함수형 인터페이스
		IntSupplier s = () -> (int)(Math.random() * 100) + 1;
		IntConsumer c = i -> System.out.println(i + ", ");
		IntPredicate p = i -> i % 2 == 0;
		// 매개변수, 반환값 있음.
		IntUnaryOperator f = i -> i/10*10;//return 생략하고 식으로 작성.
		
		//List<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[10];
		
		printEvenNum(p, c, arr);
		
		int[] newArr = doSomething(f, arr);
		
		System.out.println(Arrays.toString(newArr));
	}
	
	
	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		// 반환용으로 배열을 정의.
		int[] newArr = new int[arr.length];
		
		for(int i = 0; i < newArr.length; i++) {
			//newList.add(f.apply(i))  //UnaryOperator 의 추상메소드.
			newArr[i] = op.applyAsInt(arr[i]); //IntUnaryOperator 의 추상메소드.
		}
		
		return newArr;
	}
	
	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		for(int i : arr) {
			if(p.test(i))
				c.accept(i);
		}
	}
	
	static void makeRandomList(IntSupplier s, int[] arr) {
		for(int i =0; i<arr.length; i++)
			arr[i] = s.getAsInt(); // IntSupplier 함수 인터페이스의 추상 메소드
			// S.get(); // Supplier 함수 인터페이스의 경우의 추상 메소드
		
	}
}




