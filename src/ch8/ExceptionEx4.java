package ch8;

/*
 * try catch 가 exception 이 발생하지 않은 경우의 동작을 확인하는 예제
 */

public class ExceptionEx4 {

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
		} catch (Exception e) {
			System.out.println(5);
		}
		
		System.out.println(6);
		
		
		

//			System.out.println(3);
//			
//			result = number / 0; // <= 여기 exception 발생함. try 할 대상임.
//			
//			System.out.println(4);

	}

}
