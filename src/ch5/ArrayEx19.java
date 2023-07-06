package ch5;

public class ArrayEx19 {

	/**
	 * 성적 관리 프로그램
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 채점이 완료된 성적을 관리하는 2차원 배열.
		// 5행 3열
		// 각 1차원 배열은 한 학생의 국, 영, 수 에 대한 점수
		int[][] score = {
				{100, 100, 100}  //A학생
				, { 20, 20, 20}  //B학생
				, { 30, 30, 30}  //C학생
				, { 40, 40, 40}  //D학생
				, { 50, 50, 50}  //E학생
		};
		
		int kotTot = 0;
		int engTot = 0;
		int mathTot = 0;
		
		// 출력 되는 결과를 reporter 형식으로 작성.
		System.out.println("번호    국어    영어    수학    총점   평균");
		System.out.println("=====================================");
		
		for(int i=0; i < score.length ; i++) {
			int tot = 0;   //학생의 총점
			float avg = 0.0f;   //학생의 평균
			
			// 한 반의 과목별 총점 계산
			kotTot += score[i][0];
			engTot += score[i][1];
			mathTot += score[i][2];
			
			//타이틀의 번호에 해당하는 값을 출력.
			System.out.printf("%3d", i+1);
			
			// 학생별 성적 출력.
			// 국어, 영어, 수학 점수를 가지고 있는 1차원 배열
			for(int j=0;j<score[i].length;j++) {
				// 학생의 총점 계산
				tot += score[i][j];
				// 학생의 교과목별 성적을 출력
				System.out.printf("%3d", score[i][j]);
			}
			
			// 위의 Inner For 가 끝나면,
			// 번호    국어    영어    수학 가 출력이 됨.
			
			// score[i].length 는 3과목의 의미.
			avg = tot/(float)score[i].length;
			
			// 학생의 총점과 평균을 출력.
			System.out.printf("%3d %3.1f%n", tot, avg);
			
		}
		
		System.out.println("=====================================");
		// 한 반의 과목별 총점을 출력
		System.out.printf("과목별 총점 %5d %5d %5d%n", kotTot, engTot, mathTot);
		
	}

}
