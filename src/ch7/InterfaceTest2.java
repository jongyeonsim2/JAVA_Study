package ch7;

/*
 * 약한 결합에 대한 예제 => 대부분은 Interface 에 대한 내용임.
 * 
 * 의존 주입(Dependency Injection) 을 통한 약한 결합이 되도록 함.
 */

/*
 * 1. interface 를 통한 약한 결합이 됨.
 * 2. 병행 개발이 가능. => 개발 생산성이 높다.
 * 3. 유지보수성이 높음.
 * 4. 테스트 하기가 쉬움.
 * 5. 시스템 확장성이 높아짐.
 */
class A2 {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class B2 implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C2 implements I {
	public void play() {
		System.out.println("play in C class");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실제 사용 주체는 A2 class 의 객체
		A2 a = new A2();
		
		a.autoPlay(new B2());
		a.autoPlay(new C2());
	}

}
