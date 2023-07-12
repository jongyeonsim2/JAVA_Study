package ch7;

//Vector 를 사용하기 위함.
import java.util.*;


/*
 * 중요한 Point
 * 
 * 1. 다형성이 적용된 곳
 *    1.1 구매 메소드 => 메소드의 매개변수
 *    1.2 구매한 물건을 저장 및 관리하는 곳 => 배열에 적용됨.
 *    1.3 구매한 물건을 저장 및 관리하는 곳 => Vector 추가 적용.
 *    1.4 환불 메소드 => 메소드의 매개변수
 * 2. 상속 관계, 부모 class, 자식 class 확인
 * 3. 오버라이드가 된 곳
 * 
 */


//부모 class
class Product2 {
	int price;
	int bonusPoint;
	
	//생성자
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

//자식 class
class Tv5 extends Product2 {
	Tv5() {
		super(100);
	}

	// Buyer class의 buy() 메소드에서 제품 구입이 완료되었을 경우, 제품명을 출력하기 위함.
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}

	// Buyer class의 buy() 메소드에서 제품 구입이 완료되었을 경우, 제품명을 출력하기 위함.
	@Override
	public String toString() {
		return "Computer";
	}
}

// 새로운 전자 제품 추가
class Audio extends Product2 {
	Audio() { super(50); }
	
	public String toString() {
		return "Audio";
	}
}

//구매자 class
class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	// 1.2 에 해당
	// 구매한 물건을 관리하는 배열
	Product2[] item = new Product2[10]; // 다형성 적용.
	
	
	// 배열에서 Vector 로 변경.
	Vector vec_item = new Vector();
	
	
	
	
	
	// 배열의 idx 를 관리
	int i = 0;
	
	/* 별표 100000000 개  */
	/*
	 * 다형성을 메소드의 매개변수에 적용
	 * 
	 * 다형성을 적용하지 않았다면, Tv, Computer 를 구입하는 buy() 메소드가 각각 있어야 함으로,
	 * 총 2개의 buy()을 구현해야 함.
	 * 
	 * 하지만, 다형성이 적용되어서 부모인 Product type의 buy() 메소드 하나만 구현하면 됨.
	 */
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액 부족. 구매 불가.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		// 신규 추가 코드
		// 구매한 전자제품을 목록(객체 배열)에 추가
		item[i++] = p;
		
		
		// 구매한 전자제품을 vecotr에 저장
		vec_item.add(p);
		
		
		System.out.println(p + " 을 구입."); //=> 실제 자식 class에서 toString() 오버라이딩 해야 함.
	}
	
	
	// 환불 메소드 신규 추가
	void refund(Product2 p) {
		if(vec_item.remove(p)) { // 정상 삭제 되면 true
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 제품이 반품 완료됨.");
		} else {
			System.out.println("환불하려는 제품이 목록에 없음.");
		}
	}
	
	
	
	
	
	// 신규 추가 메소드
	// 구매한 전자제품 목록 출력
	void summary() {
		// 총 구매 금액 출력
		// 구입한 전자제품 리스트 출력 => 문자열 => String
		
		int sum = 0;
		String itemList = "";
		
		// 등록된 제품이 없는 경우.
		if(vec_item.isEmpty()) {
			System.out.println("구입한 제품이 없음");
			return;
		}
		
		for (int i = 0; i<vec_item.size(); i++) {
			//vector에서 가져온 후 down castring 함.
			Product2 p = (Product2)vec_item.get(i);
			//총 구매 금액 계산
			sum += p.price;
			
			//구입한 전자제품 리스트
			//자식의 오버라이드된 toStirng() 호출
			//3항식 사용
			itemList += (  (i==0) ? "" + p : ", " + p  );  // Tv  (i==0)
															// , Computer  (i==1)
															// , Audio   (i==2)
		}
		
		
		for(int i=0; i<item.length; i++) {
			// 배열의 요소가 null 경우를 반드시 체크 
			// 요소가 null 이면 NullPointerException 이 발생. => 프로그램이 비정상 종료.
			if(item[i]==null) break;
			
			//총 구매 금액 계산
			sum += item[i].price;
			
			//구입한 전자제품 리스트
			//자식의 오버라이드된 toStirng() 호출
			itemList += item[i] + ",";
		}
		
		// 총 구매 금액 출력
		System.out.println("전자제품의 총 금액은 " + sum + " 입니다.");
		// 구입한 전자제품 리스트 출력
		System.out.println("구입한 제품은 " + itemList + " 입니다.");
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv5());
		b.buy(new Computer2());
		b.buy(new Audio());
		
		b.summary();
	}

}






