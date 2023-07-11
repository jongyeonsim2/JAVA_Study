package ch7;

/*
 * 실습시 주의사항.
 * 현재 파일에 있는 동일한 package  내에서 Point class 가 존재하면, 
 * Point class 명을 변경해서 사용.
 * 
 */

/*
 * Object 클래스를 제외한 모든 클래스의 생성자의 첫 줄에는 this() 또는 super() 를 
 * 호출해야 함.
 * 
 * 명시적으로 호출을 하지 않으면, 컴파일러가 자동으로 super() 를 생성자의 첫 줄에 삽입.
 */
class Point2 {
	int x;
	int y;
	
	// 기본 생성자 없음.
	// 클래스에서 생성자가 하나도 없으면, 자동으로 기본생성자가 추가됨.
	// 현재는 매개변수가 있는 생성자가 존재하므로, 기본생성자는 없는 상태임.
	//Point2() {}// 에러 해결 방법 1 : Point2 class 기본생성자 추가.
	
	// 매개변수가 있는 생성자.
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D2 extends Point2 {
	int z;
	
	// 기본생성자는 없음. 매개변수가 있는 생성자가 존재함.
	
	// 매개변수가 있는 생성자
	Point3D2(int x, int y, int z) {
		
		/*
		 * super() 는 기본생성자이기 때문에, Point2 class의  생성자인 Point2() 를 필요로 하게 됨.
		 * 하지만, Point2 class 에는 기본 생성자인 Point2() 이 없는 상태임.
		 * 그래서, Point2 class 에 기본 생성자인 Point2() 를 구현하면, 에러가 없어짐.
		 */
		//super();// 에러 해결 방법 1 : Point2 class 기본생성자 추가.
		super(x, y);// 에러 해결 방법 2 : Point2 class 에 존재하는 매개변수 생성자를 사용. 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
