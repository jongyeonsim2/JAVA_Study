package ch7;

/*
 * Outer 및 Inner class 의 instance 변수를 this 참조변수를 이용해서 사용해보는 예제. 
 */

class Outer2 {
	//Outer class 의 instance 변수
	int value = 10;
	
	// Inner class
	class Inner {
		// instance 변수
		int value = 20;
		
		// instance 메소드
		void method1() {
			// 지역 변수
			int value = 30;
			
			System.out.println("value : " + value); // 지역 변수
			System.out.println("this.value : " + this.value); // 
			System.out.println("Outer2.this.value : " + Outer2.this.value);
		}
	}
}

public class InnerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		
		inner.method1();
	}

}
