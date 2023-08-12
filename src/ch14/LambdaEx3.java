package ch14;

@FunctionalInterface
interface MyFunction3 {
	void myMethod();
}

/*
 * 중첩 클래스 작성
 */
class Outer {
	int val = 10; //outer.this.val, 첫 번째 변수
	
	class Inner {
		int val = 20; //this.val, 두 번째 변수
		
		void method(int i) {//세 번째 변수
			int val = 30;//네 번째 변수
			
			MyFunction3 f = () -> {
				/*
				 * 4 가지 경우의 변수를 참조 => 가능.
				 */
//				System.out.println("val : " + val);
//				System.out.println("i : " + i);
//				System.out.println("this.val : " + this.val);
//				System.out.println("Outer.this.val : " + Outer.this.val);
				
				// 4 가지 경우의 변수를 참조 후 값 변경
				// 람다식 내에서 참조하는 변수중에서 지역변수는 final를 사용하지 않아도
				// 상수로 취급되어서 값의 변경을 할 수 없음.
//				System.out.println("val : " + ++val); //ng
//				System.out.println("i : " + ++i); //ng
				System.out.println("this.val : " + ++this.val); //ok
				System.out.println("Outer.this.val : " + ++Outer.this.val); //ok
			};
			
			f.myMethod();
		}
	}
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inner class 의 method() 를 사용하기 위해서
		/*
		 * 1. outer class 객체 생성
		 * 2. inner class 객체 생성
		 * 3. inner.method() 호출
		 * 4. f.myMethod() 호출
		 */
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}

}
