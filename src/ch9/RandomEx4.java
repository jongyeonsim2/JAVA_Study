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

		
		
		
		
	}

}








