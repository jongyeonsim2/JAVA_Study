package ch7;

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water~~!!!");
	}
}

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모
		Car car = null;
		
		// 자식
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		// 상속 관계 활용
		// 자식이 부모의 속성 및 기능을 사용
		fe.water();
		
		// 부모와 자식간의 객체를 타입 형변환
		// up-casting : 형변환 생략 가능, down-casting : 형변환 필수
		
		// 자식 -> 부모
		car = fe; // 형변환 생략 가능.
		car = (Car)fe;
		
		// 부모 -> 자식
		// fe2 = car; // down-casting 의 경우 형변환이 필수
		fe2 = (FireEngine)car;
		fe2.water();
	}

}










