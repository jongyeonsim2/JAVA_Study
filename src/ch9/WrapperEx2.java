package ch9;

/*
 * 문자열을 숫자로 변환 ( 기본형, 래퍼 클래스 )
 */

public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본형
		int i2 = Integer.parseInt("100");
		
		// wrapper class
		Integer i3 = Integer.valueOf("100");
		
		// 2, 8, 16  진수
		int i4 = Integer.parseInt("100", 2);
		System.out.println("int : 100(2) : " + i4); //4
		
		Integer i5 = Integer.valueOf("100", 2);
		System.out.println("Integer : 100(2) : " + i5);
		
		
		int i6 = Integer.parseInt("FF", 16);
		System.out.println("int : FF(16) : " + i6); //4
		
		Integer i7 = Integer.valueOf("FF", 16);
		System.out.println("Integer : FF(16) : " + i7);
	}

}






