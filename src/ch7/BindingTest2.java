package ch7;

/*
 * 예제의 조건
 * 1. 상속, 부모 자식 관계
 * 2. 참조변수, 부모타입, 자식타입
 * 3. 자식 class 에 동일한 이름의 멤버변수, 멤버메소드가 없는 경우.
 */

//부모 class
class Parent3 {
	// 2.1 의 case => 인스턴스 변수
	int x = 100;
	
	// 2.2 의 case
	void method() {
		System.out.println("Parent Method.");
	}
}

//자식 class
//부모 class와 동일한 이름의 멤버변수와 멤버메소드가 없는 경우.
class Child3 extends Parent3 {
	
}


public class BindingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 타입의 자식 객체.
		Parent3 p = new Child3();
		
		// 자식 타입의 자식 객체.
		Child3 c = new Child3();
		
		// 참조변수를 이용해서 위의 2.1, 2.2 조건을 실행.
		// 참조변수가 부모 타입
		System.out.println("p.x(부모) : " + p.x);
		p.method();
		
		
		// 참조변수가 자식 타입
		System.out.println("c.x(자식) : " + c.x);
		c.method();
	}

}
