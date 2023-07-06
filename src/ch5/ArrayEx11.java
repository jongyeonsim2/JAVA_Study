package ch5;

public class ArrayEx11 {

	/*
	 * 계수기 구현하기. 카운트기 구현하기.
	 * 
	 * 33542 => 배열에 저장된 요소값 => idx 로 활용 => 결과 배열의 idx 로 활용.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int[] result = new int[10]; // 요소가 모두 0 으로 초기화된 상태임.
		
		// arr 배열에 요소 초기화
		for (int i =0; i < arr.length; i++) {
			// 요소 값으로 사용하기위해서 난수로 생성.(  0 ~ 9  )
			// result 배열의 idx로 사용.
			// 0 2 4 5 3 9 4 7 8 1
			arr[i] = (int)(Math.random() * 10);
		}
		
		// 계수기 동작을 구현
		for (int i = 0; i < arr.length; i++) {
			result[arr[i]]++;
		}
		
		// result 배열의 요소 값을 출력하면, 카운트된 결과가 됨.
		for (int i =0; i < arr.length; i++) {
			System.out.println(i + "의 갯수 : " + result[i]);
		}
	}

}
