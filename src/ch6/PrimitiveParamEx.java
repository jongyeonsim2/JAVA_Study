package ch6;

class Data { int x;}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성
		Data d = new Data();
		// 인스턴스 변수 초기화
		d.x = 10;
		
		System.out.println("main() : x= " + d.x);
		
		//
		change(d.x); // 현재는 10이 원본임.

		System.out.println("메소드 호출 후 : main() : x = " + d.x);
	}

	/*
	 * 메소드의 매개변수가 int type. => 기본형 => 값(리터럴)복사.
	 */
	static void change(int x) { // 호출후 메소드로 넘어오면 복사본.
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
}
