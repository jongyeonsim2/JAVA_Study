package ch7;

/*
 * Singleton(싱글톤) 패턴
 * - 객체를 바로 사용할 수 있는 상태로 함. => 자기자신의 객체를 static 멤버 변수로 선언
 * - 자기자신의 객체는 멤버변수임으로 캡슐화 => 멤버변수를 외부에서 직접접근하지 못하도록 함. => private
 * - 객체 생성은 외부가 아니라 내부에서만 함. => 생성자. => private
 * - 생성된 자기자신의 객체를 외부에서 접근할 수 있도록 함. => getter() => getInstance(), public, static
 * - 개체를 한 번만 사용 목적.
 * - 자기자신(class)만 있으면 됨. => 상속이 불필요 => final
 * - 
 */
final class Singleton {//상속을 하지 못하도록 제어
	private static Singleton s = new Singleton(); //객체를 바로 사용할 수 있는 상태
	
	//만일의 상황을 고려한 객체 생성을 위한 생성자, 현재는 기본생성자.
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {// 자기자신의 객체가 클래스 멤버 변수임으로, 메소드로 클래스 메소드로 만듬.
		//만일을 대비한 안전장치 
		//경우에 따라서 만들어진 객체가 없어지거나, 객체를 만들 수 없는 비이상적인 경우
		if(s==null) {
			//객체가 없는 경우는 생성자를 통해서 객체를 생성해야 함.
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기존의 객체 생성 방법. 외부에서 접근해서 객체생성하는 방법. <= singleton pattern 이 아님.
		//Singleton s = new Singleton();
		
		//Singleton s = getInstance();// 인스턴스 멤버메소드를 사용 방법.
		
		
		/*
		 * singleton pattern 에서 제공하는 객체 접근 방법
		 * - 클래스 멤버 메소드
		 * - 객체 생성하지 않고 접근해서 객체를 사용.
		 */
		Singleton s = Singleton.getInstance();// 
	}

}





