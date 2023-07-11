package ch7;

/*
 * final
 * 변수에 final 을 사용하면 => 상수.
 * 상수는 선언과 동시에 초기화.
 * 
 * 생성자를 통해서 상수를 초기화하는 예제. => 객체별로 상수의 초기화값은 모두 다르게 할 수 있음.
 */

class Card2 {
	// 상수 선언. 초기화는 하지 않음.
	final int NUMBER;
	final String KIND;
	
	static int width = 100;
	static int height = 250;
	
	// 매개변수가 있는 생성자
	// 초기화 하지 않은 상수를 생성자에서 초기화함.
	// 생성자는 객체생성시 한 번만 호출됨으로 생성자를 통해서의 상수 초기화는 단 한 번만 가능.
	Card2(String kind, int number) {
		KIND = kind;
		NUMBER = number;
	}
	
	// 기본생성자
	Card2() {
		this("DIAMOND", 1);
	}
	
	// 카드 정보 출력
	// Object class 의 toString() 메소드를 재정의 => 오버라이딩
	public String toString() {	
		return "카드 무늬 : " + KIND + ", 카드 번호 : " + NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c = new Card2("HEART", 13);
		
		// 상수를 출력
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
