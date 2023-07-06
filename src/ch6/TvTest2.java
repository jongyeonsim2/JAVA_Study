package ch6;

public class TvTest2 {

	/*
	 * 두 개의 객체를 생성했는제, 
	 * 혹시나 인스턴스 변수가 공유되는것이 아닌지? 
	 * 별도의 메모리 공간에 별도의 객체가 생성됨. 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(); // 기본 생성자 호출 => 객체가 생성됨. => 인스턴스변수가 초기화됨.
		Tv t2 = new Tv(); 
		
		System.out.println("t1.channel : " + t1.channel);
		System.out.println("t2.channel : " + t2.channel);
		
		// t1 객체의 인스턴스 변수를 초기화
		// 혹시, t2에 영향을 주는것이 아닌지?
		t1.channel = 10;
		
		System.out.println("t1 인스턴스 변수 초기화 후 ");
		System.out.println("t1.channel : " + t1.channel);
		System.out.println("t2.channel : " + t2.channel);
		
		
		
	}

}
