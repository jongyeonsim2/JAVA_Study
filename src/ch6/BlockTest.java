package ch6;

/*
 * 초기화 block(인스턴스, 클래스) 사용 예제
 * 
 * 생성자를 통해서 객체를 생성시, 실제로 초기화 block 사용이 되는지 확인.
 */
public class BlockTest {

	// 클래스 변수 초기화 block
	static {
		System.out.println("static {  }");
	}
	
	// 인스턴스 변수 초기화 block
	{
		System.out.println("{  }");
	}
	
	
	public BlockTest() {
		System.out.println("생성자 호출");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockTest bt = new BlockTest();
	}

}









