package ch5;

public class ArrayEx10 {

	/*
	 * 버블 정렬 : 연속된 두 개의 인덱스의 값을 비교해서, 큰 값을 뒤로 이동.
	 *           => 오름 차순으로 정렬.
	 * 
	 * 3   4   1   5   2   =>  1 2 3 4 5
	 * 3   4   1   5   2   비교 범위 : idx 0 ~ idx 4
	 * 3   1   4   2   5   비교 범위 : idx 0 ~ idx 3
	 * 1   3   2   4   5   비교 범위 : idx 0 ~ idx 2
	 * 1   2   3   4   5   비교 범위 : idx 0 ~ idx 1
	 * 1   2   3   4   5   비교 범위 : idx 0 ~ idx 0
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		
		/*
		 *  정렬 시작
		 *  outer for : 정렬이 완료될 때까지 반복을 제어.
		 *              비교 범위를 제어.
		 *  inner for : 앞 뒤의 요소값을 비교하여 큰 값을 뒤로 이동.
		 */
		for (int i=0; i < arr.length-1; i++) {
			// 정렬이 발생한 경우인가. false 이면, 정렬이 끝났음.
			boolean changed = false;
			
			// arr.length-1-i
			// 10 - 1 - 0 => 9
			// j < arr.length-1-i => 8
			// 0 1 2 3 4 5 6 7 8 9
			for (int j=0; j < arr.length-1-i; i++) {
				// 요소의 앞 뒤의 값을 비교
				if(arr[j] > arr[j+1]) {
					// 큰 값인 원본 데이터를 백업.
					int tmp = arr[j];
					// 뒤쪽 요소의 값을 앞 요소의 값으로 이동
					arr[j] = arr[j+1];
					// 뒤쪽 요소의 값을 큰 값인 앞쪽 요소의 값으로 초기화.
					arr[j+1] = tmp;
					
					// 정렬이 발생했음. flag 를 기록.
					changed = true;
				}// If
			}// Inner For
			
			// changed 가 false 이면, 정렬이 끝난 상태임으로
			// Outer For 를 종료함.
			if (!changed) break;
			
			// 정렬 단계별로 출력함.
			// 정열 과정을 모니터링을 함.
			for(int k=0; k < arr.length; k++)
				System.out.print(arr[k]);
			
			// 각 정렬 과정을 구분하기 위해서 개행처리.
			System.out.println();
			
		} // Outer For
		
		
		
		
		
	}

}
