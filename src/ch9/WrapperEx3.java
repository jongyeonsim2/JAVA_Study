package ch9;

/*
 * 래퍼클래스의 활용 : 오토박싱, 언박싱
 */

public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		//Integer intg = i; //int -> Integer, 오토박싱
		Integer intg = (Integer)i;
		
		Object obj = i; // 자동 형변환, 자식에서 부모로 upcasting 인경우. 캐스팅 생략 가능.
		
		Long lng = 100L;
		Long lng2 = new Long(100L);
		
		int i2 = intg + 10; // 언박싱
		
		
	}

}





