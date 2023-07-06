package ch6;

public class TvTest3 {

	/*
	 * 참조변수를 잘 이해하고 있는지?
	 * 참조변수 => 참조한다고 하니까, 참조하려면 뭐가 필요한가? 메모리 주소
	 * 
	 * 메모리 주소로 인해서, 엉뚱한 객체를 참조하게 되는것을 이해하는지?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv(); // 기본 생성자 호출 => 객체가 생성됨. => 인스턴스변수가 초기화됨.
		Tv t2 = new Tv(); 
		
		// 현재의 각 객체의 인스턴스 변수 값을 확인. 
		System.out.println("t1.channel : " + t1.channel);
		System.out.println("t2.channel : " + t2.channel);
		
		// 참조변수에 엉뚱한 객체를 참조하게끔 변경.
		// t2 참조변수는 t1 참조변수가 가리키는 객체를 참조하게 됨.
		t2 = t1;
		
		// 인스턴스 변수의 값을 초기화해서
		// 위에서 생성한 두개의 객체가 동일한 값으로 확인이 되는지 확인.
		// => 각각의 참조변수가 동일한 객체를 참조하고 있다는 것을 확인하게 됨.
		t1.channel = 7;
		
		System.out.println("t1.channel : " + t1.channel);
		System.out.println("t2.channel : " + t2.channel);
		
		// 마지막으로 알 수 있는것은 
		// 원래의 t2의 객체는 가비지 컬레터 대상이 됨.
		
	}

}
