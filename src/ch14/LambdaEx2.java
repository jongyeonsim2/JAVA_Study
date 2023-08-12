package ch14;

/*
 * 함수형 인터페이스 형변환 사용 예제
 */

@FunctionalInterface
interface MyFunction2 { // 함수형 인터페이스
	void myMethod();    // 추상 메소드
}

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. 추상 메소드가 매개변수 없고, 반환형 없는 형태
		//    사용된 람다식의 형태와 동일 => 함수형 인터페이스 형변환이 생략 가능
		//MyFunction2 f1 = () -> {};
		MyFunction2 f1 = (MyFunction2)(() -> {});
		
		// 4. Object 의 UpCasting
		//    a. 함수형 인터페이스로 형변화
		//    b. Object 로 UpCasting
		//Object f2 = () -> {}; // NG
		// 자동 UpCasting이 되어서, 명시적인 Object UpCasting 이 생략됨.
		//Object f2 = (MyFunction2)(() -> {});  //OK
		Object f2 = (Object)(MyFunction2)(() -> {});  //OK
		String str = ((Object)(MyFunction2)(() -> {})).toString();//OK
		((MyFunction2)(() -> {})).toString();  //OK
		//(() -> {}).toString();//NG
	}

}
