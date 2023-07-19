package ch9;

import java.util.*;
/*
 * DB의 Table 에 테스트용 데이터를 Insert 하기 위한 임의의 SQL Insert 문 작성.
 */

public class RandomEx4 {

	final static int RECORD_NUM = 10; // 작성할 Insert SQL 문자 수
	
	final static String TABLE_NAME = "TSET_TABLE"; //INSERT 될 TABLE 명 
	
	// TABLE ( col1(칼럼), col2(칼럼), col3(칼럼)  )
	// insert into table ( col1, col2, col3 ) values ( '홍길동', 1, 3 ); row
	
	// column1(항목1), table 의 colums 에 저장될 데이터
	final static String[] CODE1 = {"010","011","017","018","019"}; //length : 5
	
	// column1(항목1), table 의 colums 에 저장될 데이터
	final static String[] CODE2 = {"남자","여자"}; //length : 2
	
	// column1(항목1), table 의 colums 에 저장될 데이터
	final static String[] CODE3 = {"10대","20대","30대","40대","50대"}; //length : 5
	
	// 난수 : 0.0 <= X < 1.0
	// 3개의 배열에서 필요한 정수 인덱스 값을 생성.
	
	// length : 5 경우 idx 범위 : 0 ~ 4
	// length : 2 경우 idx 범위 : 0 ~ 1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * insert into table_name
		 * values ( 
		 * '', //CODE1 : idx 범위 : 0 ~ 4,   난수 발생할 case1
		 * '', //CODE2 : idx 범위 : 0 ~ 1,   난수 발생할 case2
		 * '', //CODE3 : idx 범위 : 0 ~ 4
		 * 100 ~ 200,   난수 발생할 case3
		 * )
		 * 
		 */
		
		//SQL 문장 작성
		for(int i=0; i < RECORD_NUM; i++) {
			System.out.println(
					" INSERT INTOP " + TABLE_NAME 
					+ " VALUES ( "
					+ " '" + getRandArr(CODE1) + "'" // column 1
					+ " '" + getRandArr(CODE2) + "'" // column 2
					+ " '" + getRandArr(CODE3) + "'" // column 3
					+ " , " + getRand(100, 200)    // column 4
					+ "); "
			);
		}
	}
	
	// 3개의 칼럼에 해당하는 배열은 매개변수로 사용
	// 난수를 이용한 index 값으로 매개변수 배열의 요소값을 추출
	public static String getRandArr(String[] arr) {
		return arr[getRand(arr.length-1)];
	}
	
	// case1, case2
	public static int getRand(int n) {
		return getRand(0, n);
	}
	
	// 임의의 IDX 값 추출
	// case3
	public static int getRand(int from, int to) {
		
		//case1 : 0 ~ 4 => 난수의 범위 :0 ~ 5 => (int)Math.random()*(Math.abs(to-from) + 1)
		//case2 : 0 ~ 1 => 난수의 범위 :0 ~ 2 => (int)Math.random()*(Math.abs(to-from) + 1)
		//case3 : 100 ~ 200 => 난수의 범위 :0 ~ 2
		
		return (int)Math.random()*(Math.abs(to-from) + 1) + Math.min(from, to);
	}

}








