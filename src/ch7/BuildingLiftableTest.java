package ch7;

/*
 * 예제의 특징.
 * 1. Interface 를 직접 구현한 Interface class 를 작성.
 * 2. 각 Unit 의 멤버변수로 Interface class 객체를 사용.
 * 
 * 장점
 * - Interface class 객체를 멤버변수를 가지고 있는 모든 Unit class 의 동작을 하나로 통일.
 * - 이 모든 Unit class에 대해서 게임 유저들의 요청이 발생. 이동 속도를 올리기를 원함.
 * - => 빠른 개발, 빠른 테스트, 빠른 운용환경의 적용.
 * - Interface 를 직접 구현한 Interface class 를 사용하면, 
 *   Interface class 만 수정하면, 모든 Unit class 자동 반영됨.
 * - Interface class 만 수정, 이 클래스만 컴파일만 하면 됨.
 */

interface Liftable {
	// 건물을 들어 올림.
	public abstract void liftOff();
	
	// 건물의 이동
	public abstract void move(int x, int y);
	
	// 건물의 이동 정지
	public abstract void stop();
	
	// 건물 착륙
	public abstract void land();
	
}

/*
 * 현재 예제에서 가장 중요한 Point 1 되는 코드임.
 * Liftable interface 직접 구현한 class 작성.
 * 이런 형태의 코드가 Spring F/W 많이 사용되는 패턴.
 */
class LiftableImpl implements Liftable {

	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		System.out.println("건물을 띄웁니다.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("건물을 이동합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("건물의 이동을 멈춥니다.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("건물을 착륙합니다.");
	}
	
}

// 각각의 building Unit : Building, Barrack, Factory

class Building { }

class Barrack extends Building implements Liftable {

	//현재 예제에서 가장 중요한 Point 2 되는 코드임.
	//interface 를 구현한 클래스를 멤버면수로 설정.
	
	LiftableImpl l = new LiftableImpl();
	
	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		l.liftOff();
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		l.move(x, y);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		l.stop();
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		l.land();
	}
	
}

class Factory extends Building implements Liftable {

	//현재 예제에서 가장 중요한 Point 2 되는 코드임.
	//interface 를 구현한 클래스를 멤버면수로 설정.
		
	LiftableImpl l = new LiftableImpl();
	
	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		l.liftOff();
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		l.move(x, y);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		l.stop();
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		l.land();
	}
	
}



public class BuildingLiftableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
