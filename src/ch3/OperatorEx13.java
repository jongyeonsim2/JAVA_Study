package ch3;

public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		
		/*
		 * 리터럴 끼리의 연산임.
		 * 컴파일러가 'a' 계산해서 결과값을 변수에 저장.
		 */
		char c2 = 'a' + 1; 
		
		char c3 = (char)(c1 + 1);
		
		/*
		 * c1 + 1 의 연산은 int 보다 작은 타입이면 int로 변환해서 연산함.
		 * 결과가 int를 char 에다 저장하려고 함.
		 */
		//char c4 = c1 + 1;
	}

}
