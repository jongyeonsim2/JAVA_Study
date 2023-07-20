package ch11;

import java.util.*;
/*
 * Arrays class 사용예제
 */

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,1,2,3,4};
		int[][] arr2d = {{11,12,13},{21,22,23}};
		
		System.out.println("1차원 배열 : " + Arrays.toString(arr));
		Arrays.toString(arr);
		System.out.println("2차원 배열 : " + Arrays.deepToString(arr2d));
		Arrays.deepToString(arr2d);
		
		// 배열 초기화
		int[] arr2 = new int[5];
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2)); 
		
		// 람다식을 사용한 매개변수
		Arrays.setAll(arr2, i -> (int)(Math.random()*6) + 1);
		System.out.println(Arrays.toString(arr2));
		
		// 정렬
	    char[] chArr = {'A','D','C','B','E','R'};
	    
	    // 배열 정렬 전
	    System.out.println(" ==== 정렬 전 ==== ");
	    System.out.println(Arrays.toString(chArr));
	    System.out.println("binarySearch( 'B' ) : " + Arrays.binarySearch(chArr, 'B'));
	    
	    
	    // 배열 정렬 후
	    System.out.println(" ==== 정렬 후 ==== ");
	    Arrays.sort(chArr);
	    System.out.println(Arrays.toString(chArr));
	    System.out.println("binarySearch( 'B' ) : " + Arrays.binarySearch(chArr, 'B'));
		
		
		
//		
//		char[] chArr = { 'A', 'D', 'C',  'B', 'E' };
//
//		int idx = Arrays.binarySearch(chArr, 'D');
//		//System.out.println("chArr="+Arrays.toString(chArr));
//		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
//		System.out.println("= After sorting =");
//		Arrays.sort(chArr);
//		//System.out.println("chArr="+Arrays.toString(chArr));
//		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
	}

}





