package ch7;

/*
 * 실습시 주의사항.
 * 현재 파일에 있는 동일한 package  내에서 Point class 가 존재하면, 
 * Point class 명을 변경해서 사용.
 * 
 */

/*
 * Object 클래스를 제왼한 모든 클래스의 생성자의 첫 줄에는 this() 또는 super() 를 
 * 호출해야 함.
 * 
 * 명시적으로 호출을 하지 않으면, 컴파일러가 자동으로 super() 를 생성자의 첫 줄에 삽입.
 */
class Point2 {
	int x;
	int y;
	
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
	
	Point3D2(int x, int y, int z) {
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
