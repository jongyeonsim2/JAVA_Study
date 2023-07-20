package ch11;

import java.util.*;
/*
 * 이진트리 사용 예제
 */

public class TreeSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new TreeSet();
		
		// 데이터가 저장시 정렬되어서 저장됨. => 별도로 정렬할 필요가 없음.
		for (int i = 0; set.size() < 6 ; i++ ) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		
		// 
		System.out.println(set);
		
		
		// 탐색 예제
		TreeSet set2 = new TreeSet();
		
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};		
		
		for(int i=0; i<score.length; i++) {
			set2.add(new Integer(score[i]));
		}
		
		// 지정된 객체보다 작은 값을 탐색 
		System.out.println(set2.headSet(new Integer(50)));
		
		// 지정된 객체보다 큰 값을 탐색
		System.out.println(set2.tailSet(new Integer(50)));
	}

}




