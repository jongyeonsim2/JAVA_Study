package ch7;

/*
 * 1. interface 작성
 * 2. interface 상속을 통해서 새로운 interface 를 작성.
 * 3. 새로운 class 를 작성시, interface 이용해서 implement 하고,
 *    부모 class 를 이용해서 동시에 상속을 해서 새로운 class 를 작성해보기.
 * 4. 재사용, 가독성, 다형성( 부모 class, interface ), 추상화 개념을 작성에 매핑
 * 5. 시스템 개발시 다양한 class, inteface  등을 설계할 수 있도록 연습
 */

/* 추상화 레벨 => 재사용 높음 => 가독성, 유지보수성 높아짐 */
interface Moveable { 
	// 추상 메소드
	void move(int x, int y);
	}

interface Attackable { 
	// 추상 메소드
	void attack(Unit u);
}

interface Fitghtable extends Moveable, Attackable {}

/* 구체화 => 재사용성이 높음 => 가독성, 유지보수성 높아짐
 * 객체가 될 수 있으면, 그나마 구체화가 된 것이라고 볼 수 있음.
 *  */
class Unit {
	int currentHP;
	int x;
	int y;
}

/*
 * 실질적인 구체화된 레벨
 */
class Fighter extends Unit implements Fitghtable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

}



public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fighter f = new Fighter();
		
		if (f instanceof Unit) { // Fighter 는 Unit 이다.
			System.out.println("f는 Unit의 자식임.");
		}
		
		if (f instanceof Fitghtable) { // Fighter 는 Fitghtable 이다. => 다형성 => 
										// Fighter 는 Fitghtable type 이다.
			System.out.println("f는 Fitghtable을 구현. => Fitghtable type임.");
		}
		
		if (f instanceof Moveable) { 
			System.out.println("f는 Moveable을 구현. => Moveable type임.");
		}
		
		if (f instanceof Attackable) { 
			System.out.println("f는 Attackable을 구현. => Attackable type임.");
		}
		
		if (f instanceof Object) { 
			System.out.println("f는 Object의 자식임.");
		}
	}

}





