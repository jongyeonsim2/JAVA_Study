package ch8;

/*
 * 현재의 예제는 다음을 확인해보라는 예제
 * 1. 비정상 종료 
 *    사용자가 종료하고 싶어서 종료한게 아님. => 그래서, 문제임.
 * 2. Exception 발생 후의 내용을 확인. => java.lang.ArithmeticException 확인
 * 3. Exception 이 발생하는 위치 확인. => 19 번 라인 코드에서 발생함을 확인.
 * 4. 그래서, try 로 묶어야 하는 코드가 어디인지 확인. => 19 번 라인의 코드가 대상임.
 */

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;
		
		result = number / 0;
	}

}
