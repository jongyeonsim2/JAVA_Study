package ch7;

/*
 * Outer 의 ( instance, static, local class ) 다양한 클래스를
 * 다른 클래스에서 사용.
 */

// Outer class
class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 500;
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Outer class 의 객체를 먼저 생성.
		Outer oc = new Outer();
		
		// Outer 의 Instance Inner class
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		// Instance Inner class 의 instance 변수
		System.out.println("ii.iv : " + ii.iv);
		
		// Static Inner class 의 static 변수
		System.out.println("Outer.StaticInner.cv" + Outer.StaticInner.cv);
		
		// Static Inner class 의 instance 변수 => 객체생성 후 사용 가능.
		//Outer.StaticInner.iv
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
		
	}

}
