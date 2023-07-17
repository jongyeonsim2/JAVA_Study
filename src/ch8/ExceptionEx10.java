package ch8;

/*
 * RuntimeException 클래스 : unchecked 예외
 *   컴파일러가 예외처리를 확인(try...catch...)하지 않음.
 * 
 * Exception 클래스 : checked 예외
 *   컴파일러가 예외처리를 확인(try...catch...)함.
 *   
 * 개발자에게 선택권을 부여함. RuntimeException 의 자식으로
 * 사용자 정의 Exception을 만들어서 사용하게 되면,
 * 컴파일러가 확인을 하지 않으니, 개발자가 좀 더 자유롭게 코딩을 할 수 있게됨.
 */

public class ExceptionEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// throw new Exception(); // checked 예외
		throw new RuntimeException(); // unchecked 예외
	}

}
