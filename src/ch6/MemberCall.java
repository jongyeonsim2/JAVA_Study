package ch6;

/*
 *  인스턴스 변수, 클래스 변수, 인스턴스 메소드, 클래스 메소드 간의 차이점
 *  실행시 어떤 타이밍에서 문제없이 사용이 가능한지를 확인
 */
public class MemberCall {
	//인스턴스 변수
	int iv = 10;
	//클래스 변수
	static int cv = 20;
	
	int iv2 = cv;
	
	/*
	 * 인스턴스 변수는 객체를 생성한 후 사용이 가능, 클래스 변수의 초기화값으로 사용하려고 함.
	 * 클래스 변수의 경우는 객체가 생성되지 않을 수도 있다.
	 */
	//static int cv2 = iv;//현재 iv는 객체가 생성되지 않은 상태임. 마치 객체가 생선된 것처럼 사용하려고 하고 있음.
	
	//new MemberCall() : 기본 생성자를 사용하면, 객체의 주소가 반환됨.
	//new MemberCall().iv => 객체참조주소.iv;
	//객체를 한 번만 사용할 경우. 즉, 참조변수를 사용하지 않았으니까.
	static int cv2 = new MemberCall().iv;
	
	// 클래스 메소드
	static void staticMethod1() {
		System.out.println(cv);
		
		//현재 iv는 객체가 생성되지 않은 상태임. 마치 객체가 생선된 것처럼 사용하려고 하고 있음.
		//System.out.println(iv);
		
		//클래스 메소드에서 인스턴스 변수를 사용하려면,
		//먼저 객체를 생성한 후 사용하면 됨.
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	//인스턴스 메소드 => 객체가 생성된 후 사용할 수 있기 때문에, 객체가 생성되었다고 생각하면 됨.
	void instanceMethod1() {
		System.out.println(cv); // 클래스 변수를 사용하면 됨. 객체가 생성되었다고 생각하기 때문임.
		System.out.println(iv);
	}
	
	// 클래스 메소드에서 인스턴서 및 클래스 메소드 사용
	static void staticMethod2() {
		staticMethod1();
		
		//현재 instanceMethod1()는 객체가 생성되지 않은 상태임. 마치 객체가 생선된 것처럼 사용하려고 하고 있음.
		//instanceMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	// 인스턴스 메소드를 작성한 후, 내부에서 클래스 메소드를 사용. => 객체가 생성되었다고 생각하면 됨.
	void instanceMethod2() {
		//클래스메소드
		staticMethod1();
		//인스턴스메소드
		instanceMethod1();
	}
	
}





