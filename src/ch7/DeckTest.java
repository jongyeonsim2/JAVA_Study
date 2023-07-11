package ch7;
/*
 * 카드 게임(포커) 프로그래을 구현.
 * 
 * - entity class의 특징
 *   데이터적 성격이 강함. 따라서, 파일 및 데이터베이스에 저장되는 데이터를 보유.
 *   프로그램 상에서 관리되고 있는 데이터의 종류를 파악할 수 있음.
 *   프로그램의 기능을 분석하는데 도움이 됨.
 *   
 * - controller class
 *   프로그램 전체의 기능을 담당. 따라서, 기능적 성격이 강함.
 *   컨트롤 클래스의 흐름만 파악하면 프로그램의 전체 흐름을 파악할 수 있음.
 * 
 * - 카드 한 장 한 장 에 대한 class => entity class
 * - 게임에 필요한 카드 모두를 관리 및 제어하는 class => controller class
 * - 게임을 실행 및 테스트 하는 class
 */

/*
 * 관계 결정.
 *   - Deck 은 Card 이다. (논리 성립이 되지 않음.) => 상속하면 안됨.
 *   - Deck 은 Card를 가지고 있다. (논리 성립) => 포함관계가 성립됨. => 인스턴스 변수로
 */

class Card {
	// 카드의 무늬 종류
	final static int KIND_MAX = 4;
	// 무늬별 카드 수
	final static int NUM_MAX = 13;
	
	// 무늬별 번호
	final static int SPADE = 4;
	final static int DIAMOND = 3;
	final static int HEART = 2;
	final static int CLOVER = 1;
	
	// 인스턴스 변수
	int kind;
	int number;
	
	// 기본생성자
	// 기본생성자로 객체 생성시, 무조건 SPADE 의 1 카드로 하겠는다는 의미. 
	// Card 객체의 기본 초기화.
	Card() {
		this(SPADE, 1);
	}
	
	// 매개변수가 있는 생성자
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// 카드 정보 출력
	public String toString() {
		
		return "카드 무늬 : " + this.kind + ", 카드 번호 : " + this.number;
	}
}


class Deck {
	//final, 단어 뜻 자체그 끝 이라는 의미.
	// 현재 초기화 된것을 마지막으로 하겠다는 의미. => 수정못함. => 상수.
	//
	final int CARD_NUM = 52; // 재사용성이 낮음 코드임. 객체생성이 되어야만 사용 가능.
	//final static int CARD_NUM = 52; // 활용도가 높음 코드. => 재사용성이 높아짐.
	// 리팩토링 책을 공부해야 함.
	//포함 관계를 표현. 구현. => 인스턴스 변수 
	Card[] cardArr = new Card[CARD_NUM];
	
	//기본 생성자
	// 게임을 위한 카드 무늬별 카드 장수만큼의 객체 생성.
	Deck () {
		int i=0;
		
		for(int k=Card.KIND_MAX; k > 0; k--) // 무늬 제어(4가지:1,2,3,4)
			for(int n=0; n < Card.NUM_MAX; n++) // 무늬별 카드 제어(13장)
				cardArr[i++]=new Card(k, n+1);  // 무늬별 카드 객체 생성.
	}
	
	/*
	 * pick 메소드는 오버로딩으로 구현.
	 * - 가독성, 유지보수성
	 */
	// 카드 뽑기 메소드 : 골라서 뽑는 경우
	Card pick(int idx) {
		return cardArr[idx];
	}
	
	// 카드 뽑기 메소드 : 그냥 순서대로 뽑는 경우
	Card pick() {
		int idx = (int)(Math.random() * CARD_NUM);
		return cardArr[idx];
	}
	
	// 카드 섞기 메소드
	void shuffle() {
		for(int i=0;i<cardArr.length; i++) {
			// 카드 배열에 52장의 카드가 저장된 상태.
			// 카드 배열의 인덱스가 필요.
			int r = (int)(Math.random() * CARD_NUM);
			
			// 카드 섞기
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deck() 생성자 호출 => 카드 52장 준비가 완료됨. => 게임 시작 준비가 완료.
		Deck d = new Deck();
		
		// 카드 게임 시작.
		Card c = d.pick(0);
		
		// 잘 봐두어야 하는 코드. => 현재 코드의 내부적인 의미를 파악해야 함.
		System.out.println("c : " + c);
		System.out.println("c.toString() : " + c.toString());

		
		// 섞기 테스트
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		
	}

}
