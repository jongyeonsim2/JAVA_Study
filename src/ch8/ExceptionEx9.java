package ch8;

/*
 * 사용자 정의 Exception 생성 및 발생 하는 예제.
 */

public class ExceptionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Exception 객체 생성
			//Exception e = new Exception("고의로 만든 Exception.");
			
			// Exception 발생.
			//throw e;
			
			throw new Exception("고의로 만든 Exception.");
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
