package ch7;

/*
 * 익명 클래스 사용 예제 => (인턴턴스 멤버, static 멤버, 지역 형태) 의 익명 클래스
 * - 익명 클래스 작성 방법 : 조상 클래스, 인터페이스 를 이용.
 *                       => 자기 자신이 이름이 없으므로, 부모 또는 
 *                          인터페이스의 이름을 빌려서 사용.
 */

public class InnerEx6 {
	// 인스턴스
	// 익명 클래스의 객체를 생성하기 위함.
	// Object() 생성자로 끝난게 아님. => 이름을 사용하고 싶은데,
	// 							   사용할 수 없으니, 부모 이름을 대신 사용.
	Object iv = new Object(){ };
	Object iv2 = new Object(){ void method() {} };
	
	// Object 생성자를 이용한 객체 생성.
	Object obj = new Object(); // Object 클래스의 객체 생성
								// Object 클래스의 기본 생성자를 호출
	
	// static
	static Object iv3 = new Object(){ };
	
	// 지역
	void myMethod() {
		Object iv3 = new Object(){ };
	}
	
}
