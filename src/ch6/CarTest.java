package ch6;

class Car {
	String color;
	String gearType;
	int door;
	
	//기본생성자
	//Car () {}
	
	// this 키워드 
	// 객체참조변수로 인스턴스 자신을 가리킴. 
	// this 를 사용할 수 있는 것은 인스턴스 멤버뿐임. => 인스턴스 변수, 인스턴스 메소드, 생성자
	Car () {
		// 생성자 안에서 생성자 호출. this 키워드를 사용.
		this("black","manual",6);
	}
	
	Car (String color) {
		this(color,"manual",6);
	}
	
	//매개변수가 있는 생성자
	Car (String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(); 
		c1.color = "white";   // 보안 문제가 있어, 사용하지 말것. => 생성자를 사용 => 캡슐화
		c1.gearType = "auto"; // 보안 문제가 있어, 사용하지 말것. => 생성자를 사용 => 캡슐화
		c1.door = 4;          // 보안 문제가 있어, 사용하지 말것. => 생성자를 사용 => 캡슐화
		
		// 인스턴스 변수를 직접 초기화 하는것 보다는
		// 매개변수 생성자를 이용하는 것이 깔끔함.
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1 객체 : " + c1.color + ", " + c1.gearType + ", " + c1.door);
		System.out.println("c2 객체 : " + c2.color + ", " + c2.gearType + ", " + c2.door);
	}

}






