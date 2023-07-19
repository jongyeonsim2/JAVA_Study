package ch11;

import java.util.*;

/*
 * ArrayList 사용 예제
 */

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		
		// data 저장
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);
		
		// 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);
		
		// 추가 저장
		list2.add("A");
		list2.add("B");
		
		print(list1, list2);
		
		list2.add(3, "AA"); // 데이터를 이동 후 추가
		
		print(list1, list2);
		
		list2.set(3, "CC"); // 덮어 쓰기
		
		print(list1, list2);
		
		// 포함된 데이터를 선택해서 삭제
		for(int i = list2.size()-1; i >=0 ; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		
		print(list1, list2);
		
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		
		ArrayList list3 = new ArrayList(10);
		
		System.out.println("list3.isEmpty() : " + list3.isEmpty());
		
		System.out.println("list1.size() : " + list1.size());
		System.out.println("list3.size() : " + list3.size());
	
		
		
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		
		
		
		
//		list1.trimToSize();
//		list3.trimToSize();
		
		System.out.println("list1.size() : " + list1.size());
		System.out.println("list3.size() : " + list3.size());
		
		
		list1.add(new Integer(5));
		
		System.out.println("list1.size() : " + list1.size());
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
}





