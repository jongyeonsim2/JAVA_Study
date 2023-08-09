package ch12;

// 열거형에 추상 메소드의 사용. => 상수를 좀더 유용하게 사용하는 방법.
// - 추상 메소드를 선언하고, 상수에서 추상메소드를 반드시 구현해야 함.
// - 멤버 변수 선언, 생성자를 반드시 구현해야 함.
enum Transportation {
	// 열거형 선언
	BUS(100) { int fare(int distance) { return distance*BASIC_FARE; } },
	TRAIN(200) { int fare(int distance) { return distance*BASIC_FARE; } },
	SHIP(300) { int fare(int distance) { return distance*BASIC_FARE; } },
	AIRPLANE(400) { int fare(int distance) { return distance*BASIC_FARE; } };
	
	// 멤버변수 => BASIC_FARE
	final int BASIC_FARE;
	
	// 생성자 구현 => BUS(100)
	Transportation(int basicFare) {
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() {
		return BASIC_FARE;
	}
	
	// 추상 메소드 : 상수에 함수를 구현.
	abstract int fare(int distance);
	
}

public class EnumEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 200 : distance, distance * BASIC_FARE = 20000
		System.out.println("bus fare = " + Transportation.BUS.fare(200));
		
		// 멤버변수로 BASIC_FARE 확인
		System.out.println("bus basic_fare = " + Transportation.BUS.BASIC_FARE);
		
		// 게터를 이용한 BASIC_FARE 확인
		System.out.println("bus basic_fare = " + Transportation.BUS.getBasicFare());

	}

}
