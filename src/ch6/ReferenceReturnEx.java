package ch6;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);// copy 메소드의 tmp 객체임.
		
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		
		tmp.x = d.x; // d 객체의 인스턴스 변수의 값을 복사.
		
		return tmp; // 반환을 tmp 참조변수의 값을 반환.
		            // 참조변수의 값은 tmp 객체의 메모리 주소값. => 
		            // 현재 copy 라는 메소드에서 생성한 객체를
		            // 호출한 main() 메소드로 원본 자체를 반환한 것과 동일.
	}

}
