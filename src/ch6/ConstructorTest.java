package ch6;

// Data1 에는 생성자를 명시적으로 구현하지 않음.
class Data1 {
	int value;
}

// Data2 에는 매개 변수가 있는 생성자를 명시적으로 구현.
class Data2 {
	int value;
	
//	Data2() {
//		
//	}
	
	Data2(int x) {
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Data1() 생성자는 명시적으로 구현하지 않았지만,
		// 에러가 발생하지 않음. => 컴파일러가 기본생성자를 넣어줌.
		Data1 d1 = new Data1();
		
		// Data2 클래스에 명시적으로 구현한 생성자기 있는 경우.
		// 컴파일러가 기본 생성자를 자동으로 넣어주지 않음.
		// 만약, 기본 생성자를 사용하고 싶다면, 직접 추가해야 함.
		//Data2 d2 = new Data2();
	}

}




