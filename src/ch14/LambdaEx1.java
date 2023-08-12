package ch14;


@FunctionalInterface
interface MyFunction { //함수형 인터페이스
	void run();			// 추상 메소드
}

public class LambdaEx1 {
	
	/*
	 * 3. 함수의 매개변수로 함수형 인터페이스를 사용.
	 */
	static void execute(MyFunction f) {
		f.run();
	}

	/*
	 * 2. 구현된 함수형 인터페이스를 반환하는 함수.
	 */
	static MyFunction getMyFunction() {
		MyFunction f3 = () -> System.out.println("f3.run()");
		return f3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  1. 함수형 인터페이스 자체를 구현.
		 */
		
		// 람다식을 MyFunction 이라는 함수형 인터페이스 타입으로
		// f1 이라는 참조변수 명으로 사용하기 위해 선언함.
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {
			//MyFunction 함수형 인터페이스의 추상메소드를 구현함.
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		// 1 번의 활용
		f1.run();
		f2.run();
		
		// 2 번의 활용
		MyFunction f3 = getMyFunction();
		f3.run();
		
		// 3 번의 활용
		execute(f1);
		
		execute(() -> System.out.println("run()"));
	}

}
