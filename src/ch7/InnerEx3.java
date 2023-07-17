package ch7;
/*
 * Outer class 에서 선언되 인스턴스 변수 및 클래스 변수를 
 * Inner class 에서 사용하는 예제.
 */
public class InnerEx3 { //Outer class

	// Outer class  의 변수
	private int outerIv = 0;
	static int outerCv = 0;
	
	// Inner class
	class InstanceInner {
		// 인스턴스 변수
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class staticInner {
		int siv = 0;
		//int siv2 = outerIv; // Outer class 의 인스턴스 변수를 사용 할 수 없음.
							// Outer class 가 객체가 생성이 되지 않았을 수 도 있기 때문임.
							// 명시적으로 Outer class 의 객체를 생성한 후 사용하라는 의미.
		static int scv = outerCv;
	}
	
	// local class 용 메소드
	void myMethod() {
		int lv = 0;
		final int LV = 0; // 책기준임. => JDK 1.8 이번 버전을 고려함. 
		int LV2 = 0; //JDK 1.8 부터는 final 생략 가능.
		
		// local class
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			int liv3 = lv;
			int liv4 = LV;
			int liv5 = LV2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
