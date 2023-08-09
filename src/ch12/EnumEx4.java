package ch12;

// Enum 을 직접 구현해서 사용해보기
// 1. Enum 을 사용할 때는 부모 클래스가 필요함.
// 2. 부모 클래스에서 상속 받아서 사용하는 멤버변수
//    - ordinal 멤버변수
//	  - name 멤버변수
//    - compareTo 구현

// Enum의 부모 추상 클래스
abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
	static int id = 0; //ordinal 초기화용

	int ordinal;
	String name = "";
	
	public int ordinal() { return ordinal; }
	
	MyEnum(String name) {
		this.name = name;
		ordinal = id++;
	}
	
	public int compareTo(T t) {
		return ordinal - t.ordinal();
	}
	
}

abstract class MyTransportation extends MyEnum {
//	BUS(100) { int fare(int distance) { return distance*BASIC_FARE; } }
//	TRAIN(200);
	
	static final MyTransportation BUS =
			new MyTransportation("BUS", 100) {  // BUS(100)
					int fare(int distance) { return distance * BASIC_FARE; }
				};
				
	static final MyTransportation TRAIN =
			new MyTransportation("TRAIN", 200) {  // TRAIN(200)
					int fare(int distance) { return distance * BASIC_FARE; }
				};
	
	// 기존의 열거형에서 기능적인 요소를 추가해서 사용하기 위함.
	// 실제 기능은 직접 구현해야 함.
	abstract int fare(int distance);
	
	final int BASIC_FARE;
	
	private MyTransportation(String name, int basicFare) {
		super(name);
		BASIC_FARE = basicFare;
	}
	
	public String name() { return name; }
	public String tostring() { return name; }
}


public class EnumEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTransportation t1 = MyTransportation.BUS;
		MyTransportation t2 = MyTransportation.TRAIN;
		
		System.out.printf("t1=%s, %d%n", t1.name(), t1.ordinal());
		System.out.printf("t2=%s, %d%n", t2.name(), t2.ordinal());
		
		System.out.println("bus fare = " + MyTransportation.BUS.BASIC_FARE);
		System.out.println("bus fare = " + MyTransportation.TRAIN.BASIC_FARE);
		
		// 200 : distance
		System.out.println("bus fare = " + MyTransportation.BUS.fare(200));
		System.out.println("bus fare = " + MyTransportation.TRAIN.fare(300));
		
		

	}

}
