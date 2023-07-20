package ch11;

import java.util.*;

/* 
 * HashMap 사용 예제
 *  - 로그인 정보 관리
 */

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		
		// 데이터 저장 ( key : id, value : pwd  )
		map.put("id", "1234");
		map.put("id2", "4567");
		map.put("id3", "9870");
		
		// map 에 key, value 로 null 값 저장 가능.
		System.out.println(" ====== HashMap의 key로 null 저장 ====== ");
		map.put(null, null);
		
		 
		// key 가 null 에 대한 value 를 출력 => null 이 출력됨. 
		// 단, HashMap 에서만 가능함. HashTable 에서는 안됨.
		System.out.println(" ====== HashMap의 key가 null 인 value 출력 ====== ");
		System.out.println(map.get(null));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id 및 password 를 입력하세요.");
			System.out.println("id : ");
			String id = s.nextLine().trim();
			
			System.out.println("password : ");
			String pw = s.nextLine().trim();
			
			System.out.println();
			
			// map 에서 사용자id 를 검색.
			if(!map.containsKey(id)) {
				System.out.println("해당하는 id 는 존재하지 않습니다.");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 틀립니다.");
				} else {
					System.out.println("등록된 사용자입니다.");
					break;
				}
			}
		}
		
	}

}












