package ch7;

/*
 * instanceof 연산자 사용예제
 */
public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = null;
		Car car = null;
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) { // true
			System.out.println("FireEngine 임.");
		}
		
		if(fe instanceof Car) { // true. FireEngine 은 Car 로부터 상속됨.
			System.out.println("Car 임.");
			car = fe;
		}
		
		if(fe instanceof Object) { // true. Car 은 Object 로부터 상속됨.
			System.out.println("Object 임.");
			obj = car;
			obj = fe;
		}

		// 클래스명 출력
		System.out.println(fe.getClass().getName());
	}

}






