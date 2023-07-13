package ch7;

/*
 * 스타크래프트 캐릭터 구현
 */

interface Repairable {}

// 지상 및 공중 unit의 최사위 부모 class
class Unit2 {
	int hitPoint; // 캐릭터의 에너지. 0가 되면, 캐릭터는 없어짐.
				// 기계Unit 인 경우, SCV가 수리를 하면, hitPoint 가 증가함.
	final int MAX_HP; 
	public Unit2(int hp) {
		// TODO Auto-generated constructor stub
		MAX_HP = hp;
	}
}

//지상 Unit
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

//공중 Unit
class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}

//실제 게임의 캐릭터 Unit : Dropship(비행선)
class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}
	
	
}

//실제 게임의 캐릭터 Unit : Marine(병사)
class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine";
	}
}

//실제 게임의 캐릭터 Unit : Tank
class Tank extends  GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
}

//실제 게임의 캐릭터 Unit : SCV(로봇)
class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	/*
	 * SCV 의 수리 대상은 SCV, Dropship, Tank
	 * SCV, Dropship, Tank 3 종류의 캐릭터를 대상으로 수리를 하기 위해
	 * 1. Repairable interface 작성
	 * 2. SCV, Dropship, Tank class 에서 Repairable interface 구현 => 다형성 적용됨.
	 * 3. 수리 기능의 repair() 메소드의 매개변수 type 으로 Repairable 사용
	 * 4. 수리 기능의 repair() 를 하나만 작성해도 됨. => 재사용성이 높아짐. 유지보수성이 높아짐.
	 */
	void repair(Repairable r) {
		if (r instanceof Unit2) {//Unit2 를 상속한 객체인가? 를 확인
			Unit2 u = (Unit2)r;
			
			while(u.hitPoint!=u.MAX_HP) { // 각 Unit 의 MAX_HP 가 되도록 hitPoint 를 증가.
										// hitPoint가 MAX_HP 에 도달하면 수리가 완료된 것임.
				u.hitPoint++;
			}
			
			System.out.println(u.toString() + " 의 수리가 완료됨.");
		}
	}
	
	
}

public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(dropship);
		scv.repair(tank);
		scv.repair(scv);
		
		//scv.repair(marine);
	}

}





