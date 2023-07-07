package ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		Data d = new Data();
		// 인스턴스 변수 초기화
		d.x = 10;
		
		System.out.println("main() : x= " + d.x);
		
		//
		change(d); // 현재는 10이 원본임.

		System.out.println("메소드 호출 후 : main() : x = " + d.x);
	}

	/*
	 * 메소드의 매개변수가 Data class type 임. => 매개변수가 참조형임. => 값복사 일어남. 이때의 값은 주소값.
	 * 										=> 원본을 메소드에서 사용하게 되는 것임.
	 */
	static void change(Data d) { // 호출후 메소드로 넘어오면 복사본.
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
