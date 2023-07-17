package ch8;

/*
 * 메서드에 예외 선언하는 예제
 */

public class ExceptionEx12 {

	/*
	 * 비정상 종료.
	 * JVM의 Exception 처리기가 담당.
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();
		
	}
	
	static void method1() throws Exception {
//		try {
		method2(); // Exception Handling 을 위임.
//		} catch (Exception e) {
//			
//		}
	}
	
	
	static void method2() throws Exception { // Exception Handling 을 위임.
		throw new Exception();
	}

}
