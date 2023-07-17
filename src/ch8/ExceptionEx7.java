package ch8;

/*
 * try catch 가 동작하는 메커니즘을 이해하는 예제.
 */

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 100;
		int result = 0;
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			
			result = number / 0; // <= 여기 exception 발생함. try 할 대상임.
			
			System.out.println(4);
		} catch (ArithmeticException ae) {// Exception 로 catch 가 됨으로,
			 								// 실제 객체가 누구인지 확인.
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			
			System.out.println("ArithmeticException");
			
			System.out.println(" Exception 상세 정보 ");
			System.out.print("printStackTrace() : 호출 스택의 정보 : " );
			ae.printStackTrace();
			
			System.out.println();
			System.out.print("getMessage() : Exception 인스턴스의 메세지 : " );
			ae.getMessage();
			
			
			System.out.println(5);
		}  catch (Exception e) {// Exception 도 catch 가 되는지 확인.
								// ArithmeticException 은 위에서 처리되었으므로, 다시 처리하지 않음.
								// ArithmeticException 외의 Exception 이 대상임.
			System.out.println("Exception");
		}
		
		System.out.println(6);
		
	}

}
