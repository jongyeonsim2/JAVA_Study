package ch6;

class Card {
	// 인스턴스 변수 
	String kind;
	int number;
	
	// 클래스 변수
	static int width = 100;
	static int height = 250;
	
}

public class CardTest {

	/*
	 * 클래스 변수, 인스턴스 변수의 차이점 확인
	 * 
	 * 클래스(객체 아님) 변수 : static, 객체 생성없이 사용 가능.
	 * 인스턴스(객체) 변수 : 객체 생성 후 사용 가능.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Card c1;
		// c1 은 참조변수임으로 static 변수를 사용하지 못함.
		//System.out.println( c1.height );
		
		// class 명으로 직접 사용.
		System.out.println( Card.height );
		
		Card c1 = new Card();
		c1.kind = "Diamond";
		c1.number = 10;
		
		System.out.println("c1.kind : " + c1.kind);
		System.out.println("c1.number : " + c1.number);
		System.out.println("Card.width : " + Card.width );
		System.out.println("Card.height : " +  Card.height );
		
		c1.height = 10;
		c1.width = 20;
		
		System.out.println("Card.width : " + Card.width );
		System.out.println("Card.height : " +  Card.height );
		
		System.out.println("c1.width : " + c1.width );
		System.out.println("c1.height : " +  c1.height );
	}

}
