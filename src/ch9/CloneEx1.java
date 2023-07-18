package ch9;

/*
 * 1. Object class 의 clone() 사용 방법.
 *    - 깊은 복사, 얕은 복사
 *      깊은 복사 : 참조 변수가 참조하는 객체의 구성 요소까지 몽땅 복사. 
 *      			ex) 클래스에 멤버변수가 배열인 경우.
 *      얕은 복사 : 참조 변수가 참조하는 객체의 주소값만 복사.
 *      
 *    - Cloneable interface 구현
 *    - 접근제어지시자를 public
 *    - super의 clone() 를 호출
 */

public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point2(7, 10);
		Point copy = (Point)original.clone();
		
		System.out.println(original);
		System.out.println(copy);
	}

}


class Point implements Cloneable {
	int x;
	int y;
	// 인스턴스 변수가 있는 경우
	// 현재는 얕은 복사임.
	// 깊은 복사를 구현을 해야 함.
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	// clone() override 함.
	// 1. 접근제어지시자 public
	// 2. super.clone() 호출
	// 3. try...catch... 구현
	
	// 깊은 복사? 얕은 복사?
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
		return obj;
	}
}












