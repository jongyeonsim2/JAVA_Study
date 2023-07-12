package ch7;
/*
 * 다형성 적용
 * 1. 상속관계
 * 2. 부모타입으로 자식을 묶도록 함. => 다형성
 * 3. 메소드의 매개변수에 적용
 *    
 * 장점
 * 1. 3개의 메소드를 하나의 메소드로 구현 가능. => 유지보수성 향상. 가독성 향상.
 * 2. 재사용성 향상
 */

//부모 class
class Product {
	int price;
	int bonusPoint;
	
	//생성자
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

//자식 class
class Tv4 extends Product {
	Tv4() {
		super(100);
	}

	// Buyer class의 buy() 메소드에서 제품 구입이 완료되었을 경우, 제품명을 출력하기 위함.
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	// Buyer class의 buy() 메소드에서 제품 구입이 완료되었을 경우, 제품명을 출력하기 위함.
	@Override
	public String toString() {
		return "Computer";
	}
}

//구매자 class
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	/* 별표 100000000 개  */
	/*
	 * 다형성을 메소드의 매개변수에 적용
	 * 
	 * 다형성을 적용하지 않았다면, Tv, Computer 를 구입하는 buy() 메소드가 각각 있어야 함으로,
	 * 총 2개의 buy()을 구현해야 함.
	 * 
	 * 하지만, 다형성이 적용되어서 부모인 Product type의 buy() 메소드 하나만 구현하면 됨.
	 */
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족. 구매 불가.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 을 구입."); //=> 실제 자식 class에서 toString() 오버라이딩 해야 함.
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구매자 객체 생성
		Buyer b = new Buyer();
		
		/* 다형성 적용한 기능의 활용  */
		b.buy(new Tv4()); // 생성한 객체는 자식인 Tv 이지만, 다형성이 적용이 되어서, Tv 구입이 가능해짐.
		b.buy(new Computer());
		
		System.out.println("잔액 : " + b.money);
		System.out.println("보너스 점수 : " + b.bonusPoint);
	}

}





