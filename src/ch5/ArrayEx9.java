package ch5;

public class ArrayEx9 {

	/*
	 * 두 개의 배열을 활용해서 임의의 데이터가 저장되도록 하나의 배열에 값을 설정.
	 * A 배열 : 값을 초기화
	 * B 배열 : 임의의 index를 가지고 A 배열의 요소 접근해서 그 값을 저장해서 사용.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
				
		for (int i=0; i < arr.length; i++) {
			int idx = (int)(Math.random() * code.length);
			arr[i] = code[idx];
  		}
	}
}
