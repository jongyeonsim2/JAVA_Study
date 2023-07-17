package ch7;

/*
 * Outer class (멤버(인스턴스) 메서드, 클래스(static) 메서드)에서 
 * Inner class(instance class, static class, local class) 사용에 대한 예제
 */

public class InnerEx2 { //Outer class

	// Inner Class : instance class => 멤버 변수처럼 접근
	class InstanceInner {}
	
	// Inner Class : static class => 클래스 변수처럼 접근
	static class StaitcInner {}
	
	/*
	 * iv, cv, cv2 => Outer class level 의 참조변수
	 */
	// Outer class 의 InstanceInner type의 인스턴스 변수.
	InstanceInner iv = new InstanceInner();
	
	// Outer class 의 StaitcInner type의 인스턴스 변수.
	StaitcInner cv = new StaitcInner();
	
	// Outer class 의 StaitcInner type의 static 변수.
	static StaitcInner cv2 = new StaitcInner();
	
	/*
	 * Outer class 의 method level 의 참조변수
	 */
	
	// Outer class의 static 메소드
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner(); // 메소드 내부에서 InstanceInner class 객체를
													// 만들 수 없음.
		InnerEx2 outer = new InnerEx2();			// Outer class  의 객체를 먼저 만든 후,
		InstanceInner obj2 = outer.new InstanceInner(); // InstanceInner class의 객체를 생성.
													// 따라서, InstanceInner class 는 
													// Outer class  의 객체를 먼저 생성해야 함.
		
		StaitcInner obj3 = new StaitcInner();		// static inner class 는 객체 생성해서 사용 가능.
		
	}
	
	// Outer class의 instance 메소드
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaitcInner obj2 = new StaitcInner();
	}
	
	// 지역 클래스를 위한 메소드
	void myMethod() {
		// local class : instance class
		class LocalInner {}
		
		LocalInner lv = new LocalInner();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

} //Outer class
