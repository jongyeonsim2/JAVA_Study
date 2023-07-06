package ch3;

public class OperatorEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	두 문자열을 비교할 때는 비교 연산자 '=='을 사용하지 말고,
		 * equals() 메소드를 이용해야 함.
		 * 
		 * String str1 = new String("abc");// str1 에 100 번지 저장됨.
		 * String str2 = new String("abc");// str2 에 300 번지 저장됨.
		 * 
		 * str1 == str2 // 이 두 변수의 값이 "abc"로 똑같겠지?
		 * 
		 * str1, str2 는 참조형 변수임.
		 * 그래서, str1, str2에는 객체의 메모리 주소가 저장되어 있음.
		 * str1 == str2 의 정확한 의미는 객체의 메모리 주소 똑같은지를 
		 * 확인하는 의미임.
		 * 
		 * 결론은 이 두 변수의 값이 "abc"로 똑같겠지? 를 판단하려면,
		 * String class 에서 제공해주는 equals() 메소드를 사용해야 함.
		 * 
		 */
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf(
				"값 비교 결과 : %b%n", "abc"=="abc"
				);
		
		System.out.printf(
				"값 비교 결과 : %b%n", str1=="abc"
				);
		
		System.out.printf(
				"값 비교 결과 : %b%n", str2=="abc"
				);
		
		// 여기까지는 주소값 비교한 것임.
		// 여기서 부터는 객체에 저장된 문자열 값을 비교하는 것임.
		System.out.printf(
				"값 비교 결과 : %b%n", str1.equals("abc")
				);
		
		System.out.printf(
				"값 비교 결과 : %b%n", str2.equals("abc")
				);
		
		System.out.printf(
				"값 비교 결과 : %b%n", str2.equals("ABC")
				);
		
		System.out.printf(
				"값 비교 결과 : %b%n", str2.equalsIgnoreCase("ABC")
				);
		
	}

}
