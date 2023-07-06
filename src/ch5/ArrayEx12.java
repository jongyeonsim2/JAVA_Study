package ch5;

public class ArrayEx12 {

	/*
	 * String 배열. 참조형 배열. 객체 배열. 각 요소의 값은 객체의 주소값임. 
	 * => 메모리 그림과 함께 정리. => 기본형 타입의 메모리 그림과의 차이를 이해.
	 * 	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//					100    200     300
		String[] names = {"홍길동","이문수","아무개"};
		
		for(int i=0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		
		//          400
		names[0] = "HongGilDond";
		
		/*
		 * names{ 100, 200, 300 }   =>   names{ 400, 200, 300 }
		 * 
		 * "홍길동" 값을 가지고 있는 String 객체는 가비지 컬렉트 대상이 됨.
		 */
		
		
		for(String str : names)
			System.out.println(str);
	}

}
