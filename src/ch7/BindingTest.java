package ch7;

/*
 * 현재 예제의 중요한 조건
 * 1. 상속관계
 * 2. 부모와 자식
 *    2.1 멤버변수 이름이 동일한 경우.
 *        - 참조변수가 부모인 경우 => 부모의 멤버 변수
 *        - 참조변수가 자식인 경우 => 자식의 멤버 변수
 *    2.2 오버라이드된 메소드가 있는 경우.
 *        - 참조변수가 부모인 경우 => 자식의 오버라이드 메소드
 *        - 참조변수가 자식인 경우 => 자식의 오버라이드 메소드
 */

//부모 class
class Parent2 {
	// 2.1 의 case => 인스턴스 변수
	int x = 100;
	
	// 2.2 의 case
	void method() {
		System.out.println("Parent Method.");
	}
}

//자식 class
class Child2 extends Parent2 {
	// 2.1 의 case => 인스턴스 변수
	int x = 200;
	
	// 2.2 의 case => 메소드 오버라이드
	void method() {
		System.out.println("Child Method.");
	}
}

/*
 * 위의 조건을 이용해서 객체를 생성.
 * 자식객체를 생성하는데, 부모 타입과 자식 타입 각각 생성. => 
 *    동일한 객체이지만, 참조 변수의 타입이 부모, 자식의 경우.
 */
public class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 타입의 자식 객체.
		Parent2 p = new Child2();
		
		// 자식 타입의 자식 객체.
		Child2 c = new Child2();
		
		// 참조변수를 이용해서 위의 2.1, 2.2 조건을 실행.
		// 참조변수가 부모 타입
		System.out.println("p.x(부모) : " + p.x);
		p.method();
		
		
		// 참조변수가 자식 타입
		System.out.println("c.x(자식) : " + c.x);
		c.method();
	}

}





