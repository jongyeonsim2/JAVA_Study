package ch7;

/*
 * - is-a 관계
 *   상속, extends 키워드 사용
 * - has-a 관계
 *   인스턴스 변수 형태로 가지게끔.
 */

// 면
class Shape {
	// 인스턴스 변수를 선언과 동시에 초기화
	String color = "green";
	void draw() {
		System.out.println("color : " + color);
	}
}

// 점
class Point {
	//2차원 좌표
	int x;
	int y;
	
	//매개변수가 있는 생성자
	Point(int x, int y) {
		// this() : 생성자, this : 자기 자신을 나타내는 참조변수.(객체주소)
		this.x = x;
		this.y = y;
	}
	
	//생성자
	Point() {
		this(0,0);
	}
	
	//좌표 출력 메소드
	String getXY() {
		return "[ x : " + x + ", y : " + y + "]";
	}
}

// 원
/*
 * 관계 결정.
 *    - 원은 면이다. => is-a 관계 => 상속 관계 => extends
 *    - 원은 점을 가지고 있다.(중심점) => has-a 관계 => 포함 관계
 */

class Circle extends Shape {
	// 중심점
	Point center;
	// 반지름
	int r;
	
	// 생성자의 역할 : 인스턴스 변수의 초기화
	// 초기화 => 초기화 block(클래스, 인스턴스) => 제품 SerialNo 생성하는 예제
	Circle() {
		this(new Point(0,0), 50);
	}
	
	// 매개변수 있는 생성자.
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	// 그리기 메소드
	void draw() {
		System.out.println("circle center : " + center.x + ", " + center.y);
		System.out.println("circle color : " + color);
		System.out.println("circle r : " + r);
	}
}

// 삼각형
/*
 * 관계 결정
 *   - 삼각형은 면이다.(논리 성립) => is-a 관계 => 상속관계 => extends 사용
 *   - 삼각형은 점을 가지고 있다.(논리 성립) => has-a 관계 => 포함관계 => 인스턴스변수
 */
class Triangle extends Shape {
	Point[] p = new Point[3];
	
	//생성자
	Triangle(Point[] p) {
		this.p = p;
	}
	
	//그리기
	void draw() {
		//println() 대표적인 오버로딩의 예
		//유지보수성, 가독성
		System.out.println("Triangle p1 : " + p[0].x + ", " + p[0].y);
		System.out.println("Triangle p2 : " + p[1].x + ", " + p[1].y);
		System.out.println("Triangle p3 : " + p[2].x + ", " + p[2].y);
	}
}

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(new Point(50, 50), 50);
		c.draw();
		
		
		Point[] p = { 
				new Point(10, 10),
				new Point(20, 20),
				new Point(30, 30)
		};
		
		Triangle t = new Triangle(p);
		t.draw();
	}

}
