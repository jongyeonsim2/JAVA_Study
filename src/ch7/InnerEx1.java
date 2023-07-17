package ch7;

public class InnerEx1 {

	// 인스턴스 멤버 변수 처럼 사용하는 class
	class InstanceInner {
		int iv = 100; // 인스턴스 변수
		//static int cv = 100;// static class 에서 만 사용 가능.
		final static int CONST = 100; // 상수, static 을 사용하면 객체생성하지 않고 사용 가능.
	}
	
	// 클래스 변수 처럼 사용하는 class
	static class StaticInner {
		int iv = 200;
		static int cv = 200;// static class에서는 static 변수 선언 가능.
	}
	
	// 지역 변수 처럼 사용하는 class
	void myMethod( ) {
		class LocalInner {
			int iv = 300;
			final static int CONST = 120;
			// static int cv = 500; // 클래스 변수는 static class에서만 사용 가능.
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

} // outter class
