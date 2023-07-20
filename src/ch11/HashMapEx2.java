package ch11;

import java.util.*;
/*
 * HashMap 에서 key set 및 vlaue set, Iterator 사용하는 예제
 */

public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		
		map.put("학생1", new Integer(90));
		map.put("학생2", new Integer(100));
		map.put("학생3", new Integer(100));
		map.put("학생4", new Integer(80));
		map.put("학생5", new Integer(90));
		
		// key, value 를 멤버로 가지고 있는 Entry 의 객체들의 Set 을 구함.
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
	    while(it.hasNext()) {
	    	// 각 Entry 를 탐색 후, Map.Entry 로 downcasting.
	    	Map.Entry e = (Map.Entry)it.next();
	    	
	    	System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
	    }
		
	    // 학생명 리스트만 조회.
		set = map.keySet();
		System.out.println("학생 명단 : " + set);
		
		// 점수만 조회.
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			
			// Integer 는 래퍼 클래스임.
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최하 점수 : " + Collections.min(values));
	}

}





