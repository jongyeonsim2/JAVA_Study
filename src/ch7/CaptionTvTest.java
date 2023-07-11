package ch7;

// 부모 클래스
class Tv {
	//인스턴스 변수
	boolean power;
	int channel;
	
	//인스턴스 메소드
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

// 자식 클래스
// 상속 장점 : 코드를 재사용, 유지보수 향상, 가독성 향상, 개발 생산성 높음. => OOP 사용하는 이유.
class CaptionTv extends Tv {
	//인스턴스 변수
	boolean cation;
	
	//기본 생성자
	//CaptionTv() {}
	
	//인스턴스 메소드
	void displayCaption( String text ) {
		if (cation) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본생성자
		//객체 생성은 생성자를 이용해서 한다. 원칙처럼 생각할 것.
		CaptionTv ctv = new CaptionTv();
		
		// 상속의 장점 : 개발생산성
		// 부모의 인스턴스 변수 및 메소드 를 사용.
		ctv.channel = 10; 
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		// 내꺼 사용
		// 기본 생성자를 이용한 경우, 인스턴스 변수는 기본타입이면 초기화 값으로 초기화됨.
		// boolean 의 기본값은 false 임.
		ctv.displayCaption("Hello World!");
		
		ctv.cation = true;
		ctv.displayCaption("Hello World!");
	}

}
