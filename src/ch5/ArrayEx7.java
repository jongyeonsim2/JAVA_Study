package ch5;

public class ArrayEx7 {

	/*
	 * 섞기
	 * 
	 * 1. 배열 요소 초기화
	 * 2. 섞기
	 * 		규칙적으로 섞는것이 아니기 때문에, 랜덤하게 되어야 함.
	 * 		현재의 배열의 각 인덱스에 저장된 값을 임의의 인덱스에 저장이 되도록 해야 함.
	 * 		- random() 을 활용.
	 *      - 0.0 <= random() < 1.0 => 나의 배열의 인덱스용 정수값이 되도록 해야 함.
	 *        0.0 <= random() < 10.0 => 인덱스가 0 ~ 9 를 랜덤하게 생성되도록 함.
	 *      - 원본 배열의 섞기를 진행.
	 *        
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for (int i=0; i < arr.length ; i++) {
			arr[i] = i;
		}
		
		// 많이 섞으면, 더 잘 섞이게 됨. => 100 번으로 섞기
		for (int i=0; i < 100; i++) {
			// 현재 배열에서 이동시킬 대상의 index 값으로 사용.
			int n = (int)(Math.random() * 10); // 인덱스가 0 ~ 9 를 랜덤하게 생성됨.
			
			// 원본 데이터 백업
			int tmp = arr[0];
			// 이동할 대상을 백업 받은 자리에 덮어 씀.
			arr[0] = arr[n];
			// 원본 데이터를 이동했던 자리에 덮어 씀.
			arr[n] = tmp;
		}
		
		for (int i =0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
