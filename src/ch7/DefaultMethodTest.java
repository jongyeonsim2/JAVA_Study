package ch7;


class Child4 extends Parent4 implements MyInterface, MyInterface2 {
	// MyInterface, MyInterface 2 중복된 메소드임. => 오버라이딩으로 구현.
	public void method1() {
		System.out.println("Child2 - method1()");
	}
}

class Parent4 {
	public void method2() {
		System.out.println("Parent4 - method2()");
	}
}

interface MyInterface {
	// MyInterface2 와 중복됨.
	default void method1() {
		System.out.println("MyInterface - method1()");
	}
	
	default void method2() {
		System.out.println("MyInterface - method2()");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface - staticMethod()");
	}
}

interface MyInterface2 {
	// MyInterface 와 중복됨.
	default void method1() {
		System.out.println("MyInterface2 - method1()");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2 - staticMethod()");
	}
}


public class DefaultMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 c = new Child4();
		c.method1();// Child4 의 메소드임. 
					// interface 에서 중복이 되어서 내가 oerrride 해서 직접 구현.
		c.method2();// Parent4 의 메소드임.
		            // interface 와 Parent4 에서 중복된 메소드임. => 부모 클래스의 메소드가 우선됨.
		
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}

}






