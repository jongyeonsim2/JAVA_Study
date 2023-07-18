package ch9;

public class ShallowCopy {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(new Point3(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		c1.p.x = 77;
		c1.p.y = 77;
		
		System.out.println("c1 = " + c1); // (77,77)
		System.out.println("c2 = " + c2); // (77,77)
		System.out.println("c3 = " + c3); // (1,1)
		
		
		
		
		
		
	}

}

class Point3 {
	int x;
	int y;
	
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}


class Circle implements Cloneable {
	
	Point3 p;	// 참조변수임 => 깊은 복사 대상임.
	double r;
	
	Circle(Point3 p, double r) {
		this.p = p;
		this.r = r;
	}
	
	// 얕은 복사 메소드
	public Circle shallowCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
		return (Circle)obj;
	}
	
	// 깊은 복사 메소드
	public Circle deepCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
		// 깊은 복사 구현
		Circle c = (Circle)obj;
		c.p = new Point3(this.p.x, this.p.y);
		
		return c;
	}
	
	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}
	
}




















