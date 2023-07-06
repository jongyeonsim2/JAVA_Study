package ch5;

import java.util.*;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int[] tmp = new int[arr.length * 2];
		
		for(int i =0; i < arr.length; i++)
			tmp[i] = arr[i];
		
		//arr 배열은 더이상 필요가 없음. 이제부터는 tmp 배열을 사용.
		//arr 배열을 현상태로 두면, 메모리누수가 되는 원인이 됨으로
		//C언어 처럼 메모리 해제를 직접할 수 없으니,
		//가비지 컬레터 대상으로 변경.
		arr = tmp;
		
		System.out.println(tmp);
		System.out.println(Arrays.toString(tmp));
	}
}
