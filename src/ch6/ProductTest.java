package ch6;

/*
 * 인스턴스 변수 초기화 block 를 실제 사용가능한 예제
 * 
 * 제품 생산 serialNo 를 채번해서 객체에 부여하는 예제.
 * => 재사용성, 코드 재활용
 */
class Product {
	//클래스 변수 => Product class 로 만드어지 모든 객체간에 공유가 가능.
	static int count = 0;
	//인스턴스 변수
	int serialNo;
	
	//인스턴스 변수 초기화 block
	// 객체가 생성될 때마다 호출됨. => 생성자가 호출될 때 마다.
	{
		++count;//클래스 변수
		serialNo = count;//인스턴스 변수
	}
}

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제품 생산해서 각 제품별 제품 생산 serialNo 부여.
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("p1 의 serialNo : " + p1.serialNo);
		System.out.println("p2 의 serialNo : " + p2.serialNo);
		System.out.println("p3 의 serialNo : " + p3.serialNo);
		System.out.println("p4 의 serialNo : " + p4.serialNo);
		
		System.out.println("총 생산된 제품의 수량은 " + Product.count);
		
	}

}





