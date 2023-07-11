package ch7;

class Parent {
	int x=10;
}

class Child extends Parent {
	int x=20;
	
	void method() {
		// Child class 의 x. this 키워드 사용하지 않음.
		System.out.println("x=" + x);
		// Child class 의 x. this 키워드 사용.
		System.out.println("this.x=" + this.x);
		
		
		// Parent class 의 x. super 키워드 사용.
		System.out.println("super.x=" + super.x);
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}
