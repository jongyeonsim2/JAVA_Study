package ch11;

import java.util.*;

/*
 * HashSet 사용 예제.
 * - Set interface 를 구현한 클래스.
 * - 순서 유지 하지 않음.
 *   순서를 유지하려고 하는 경우, LinkedHashSet 을 사용.
 * - 중복 허용을 하지 않음.
 * 
 */

public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3"};
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++ ) {
			set.add(objArr[i]);
		}
		
		// "2" 는 중복임으로 하나만 저장됨.
		// "1" 과 Integer(1) 는 서로 다른 타입임으로 모두 저장된.
		System.out.println(set);
		
		
		
		Integer[] intArr = {new Integer(1), new Integer(3), new Integer(2), new Integer(4)};
		
		Set intSet = new HashSet();
		
		for(int i = 0; i < intArr.length; i++ ) {
			intSet.add(intArr[i]);
		}
		
		System.out.println(set);
		
	}

}
