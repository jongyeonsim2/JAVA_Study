package ch7;

class Car2 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine2 extends Car2 {
	
	// 인스턴스 메소드 => 객체를 생성해야만 사용 가능.
	void water() {
		System.out.println("water~~!!!");
	}
}

/*
 * 객체간의 캐스팅 예제.
 * - 부모 타입으로 여러 자식을 하나의 통일된 타입으로 형변환 가능.
 *   부모 타입으로 형변환되면, 여러 자식의 타입을 포함하는 논리적인 상태. => 다형성
 * - 캐스팅을 할 경우 up, down, 반드시 쌍방( 부모와 자식 )의 객체가 각각 실존하는지가 중요함.
 *   현재의 예제는 부모와 자식의 객체가 실존하는 경우에 대한 것.
 *   대표적으로 발생하는 에러가 java.lang.ClassCastException 임.
 * - java.lang.ClassCastException 발생하는 타이밍은 실행할 때임.
 * - 10000 라인의 코드를 캐스팅을 수정 및 추가. => 코드 레벨에서는 에러가 발생 하지 않음. => 실행하니까 발생.
 */
public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모 객체 생성
		Car2 car = new Car2();
		
		// 자식은 객체를 생성하지 않은 상태
		FireEngine2 fe2 = null;
		
		car.drive();
		
		// down casting 함. => 코드레벨에서 에러가 없음.
		//fe2 = (FireEngine2)car;
		
		// 마치 FireEngine2 객체를 생성했는것처럼 인스턴스 메소드를 사용하려고 하고 있음.
		// 실제는 FireEngine2 객체를 만든적이 없음.
		// 결론은 FireEngine2 객체를 만들지 않은 상태에서 down casting 하려고 하기 때문임.
		//fe2.water();
		
		// 원인 해결을 한 코드로 다시 작성해서 테스트함.
		// 이번에는 FireEngine2 객체를 생성.
		FireEngine2 fe3 = new FireEngine2();
		car = fe3;
		fe3 = (FireEngine2)car;
		fe3.water();
	}

}









