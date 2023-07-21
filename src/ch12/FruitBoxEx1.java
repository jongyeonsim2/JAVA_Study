package ch12;

import java.util.ArrayList;

import javax.swing.plaf.FontUIResource;

/*
 * 지네릭 클래스의 객체 생성시 고려사항
 * 1. 참조변수의 타입변수와 생성자의 타입변수는 동일해야 한다.
 * 2. 상속관계
 *    2.1 row type 에 대한 상속 : 다형성이 적용( 생성하는 객체를 부모타입으로 한다. )
 *    2.2 타입 변수 에서의 상속 : 
 *      참조변수의 타입변수와 생성자의 타입변수는 동일해야 한다. => OK
 *      다르면 => NG
 *      
 *      ArrayList<T>
 *      
 *      ArrayList<Apple> : Fruit 저장 못함.
 *      
 *    2.3 메소드의 매개변수
 *      row type 에 대한 상속 와 동일
 *      
 */

// Box class : 지네릭 클래스
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

// Fruit class
class Fruit {
	public String toString() {
		return "Fruit";
	}
}

// Apple
class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

// Grape
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

// Toy
class Toy {
	public String toString() {
		return "Toy";
	}
}


public class FruitBoxEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Box : row type
		 * Box<Apple> : <Apple> 는 참조변수의 타입변수
		 */
		
		//1. 참조변수의 타입변수와 생성자의 타입변수는 동일해야 한다. => OK
		Box<Fruit> fruitBox = new Box<Fruit>(); //Fruit 담는 Box 생성
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		
		// 참조변수의 타입변수와 생성자의 타입변수는 동일하지 않음. => NG
		//Box<Grape> fruitBox2 = new Box<Fruit>();
		
		//2.3 메소드의 매개변수
		//객체 생성시 타입변수를 Fruit 로 했기 때문에
		//메소드의 매개변수가 Fruit 타입으로 대입되었기 때문에, 자식( Apple, Grape )을 받을 수 있음.
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		// Box<Apple> appleBox = new Box<Apple>();
		appleBox.add(new Apple());
		//appleBox.add(new Fruit()); => NG
		//appleBox.add(new Grape()); => NG
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple()); => NG
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
		
	}

}






