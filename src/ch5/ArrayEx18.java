package ch5;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4행 3열의 2차원 배열 생성.
		int[][] score = {
							{100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
						};
		// 반복 조건을 이해 => 그림 5-5 가 기준임.
		for(int i=0;i < score.length; i++) { // 각 행의 배열의 시작 주소를 관리하는 배열.
			for(int j=0; j < score[i].length; j++) {
				System.out.println(score[i][j]);
			} // Inner For : 각 행의 요소를 반복
		} // Outer For : 전체 행을 반복
		
		int tot = 0;
		
		//2차원 배열에서 각 요소는 1차원 배열임.
		for (int[] tmp : score) {
			// 1차원 배열에서 요소값을 추출
			for(int i : tmp) {
				tot += i;
			}
		}
		
		System.out.println("total : " + tot);
	}

}





