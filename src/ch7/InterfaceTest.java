package ch7;

/*
 * OOP의 강한 결합(Tight Coupling), 약한 결합(Loose Coupling) 의
 * 문제점과 해결방법
 * 
 * 강한 결합 : 유지보수성이 낮음. 교재에서 interface 이전에는 모두 강한 결합.
 *           의존성이 높다. ( 객체의 생명주기를 개발자가 관리. 코드가 개발자에게 의존. )
 * 약한 결합 : 유지보수성이 높아짐. interface 를 학습한 후에는 약한 결합이 되도록 SW개발.
 *           의존성이 낮다. Spring F/W( DI 주입, Dependency Injection, 객체의 생명주기를 외부에 관리. )
 *           
 */

/*
 * 지금의 예제는 강한 결합의 예제임.
 */

class A {
	// methodA() 는 B class 에 의존하고 있는 상태임.
	// 유저로부터 요청이 발생. => B class 대신에 C class 로 변경하고 싶다고 함.
	// methodA(B b) => methodA(C b) 로 변경해야 함.
	// methodA() 는 C class 에 다시 의존하고 있는 상태임.
	
	/*
	 * 강한 결합이라고 함. => 유지보수성이 낮음. => 강한 결합의 문제점.
	 * 해결방법은 강한 관계의 결합을 없애야 함. => 약한 결합이 되도록 수정. 
	 */
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("class B");
	}
}

class C {
	public void methodB() {
		System.out.println("class C");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA(new B());
	}

}
