package ch5;

public class ArrayEx6 {
	/*
	 * 최대값, 최소값 구하기
	 * 
	 * 최대값, 최소값 비교 대상의 기준임.
	 * 임의의 값으로 설정한 후 배열의 전체 요소의 값과 모두 비교를 하면,
	 * 최대값과 최소값을 알 수 있게 됨.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {60, 70, 80, 90, 100};
		
		int max = score[0]; // 자기 자신보다 큰 값으로 계속 저장.
		int min = score[0]; // 자기 자신보다 가장 작은 값으로 계속 저장.
		
		// 각 요소와 비교
		for(int i=1; i < score.length; i++) {
			if(score[i] > max) { // 현재의 자기 자신보다 큰 값을 탐색
				max = score[i];
			} else if (score[i] < min) {// 현재의 자기 자신보다 작은 값을 탐색
				min = score[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
