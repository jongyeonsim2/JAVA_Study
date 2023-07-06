package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;
		int b = 2000000;
		
		int result1 = a * b; // -1454759936
		System.out.println(result1);
		
		long result2 = a * b; //-1454759936
		System.out.println(result2);
		
		long result3 = a * (long)b; //2000000000000
		System.out.println(result3);
	}

}
