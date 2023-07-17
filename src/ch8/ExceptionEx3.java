package ch8;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;
		
		try {
			result = number / 0; // <= 여기 exception 발생함. try 할 대상임.
			
			System.out.println("try - exception 발생 감지");
		} catch (ArithmeticException e) {
			System.out.println("catch - exception catch.");
			System.out.println("0 으로 나누면 안됨. 프로그램 종료!");
		}
		
		
	}

}
