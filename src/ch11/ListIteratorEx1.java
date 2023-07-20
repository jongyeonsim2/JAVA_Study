package ch11;

import java.util.*;
/*
 * Iterator interface 구현을 Collection interface 에 구현.
 * 
 * ArrayList 는 List interface 를 구현한 클래스.
 * List interface 는 Collection 을 형변환 가능.
 * 
 * Iterator 을 사용하기 위해서 Collection 에 구현된 iterator() 메소드를 사용.
 * 
 */

public class ListIteratorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 순서가 있고, 중복을 허용
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		// 순방향 탐색
		System.out.println("순방향 탐색");
		while(it.hasNext())
			System.out.println(it.next());
		// 역방향 탐색
		System.out.println("역방향 탐색");
		while(it.hasPrevious())
			System.out.println(it.previous());
	}
}
