package ch12;

import java.util.ArrayList;

//Box class : 지네릭 클래스
class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

//Fruit class
class Fruit2 implements Eatable {
	public String toString() {
		return "Fruit2";
	}
}

//Fruit class
class Fruit2Child extends Fruit2 implements Eatable {
	public String toString() {
		return "Fruit2Child";
	}
}

//Apple
class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple2";
	}
}

//Grape
class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape2";
	}
}

//Toy
class Toy2 {
	public String toString() {
		return "Toy2";
	}
}

//
interface Eatable {}

// 타입변수 선언시, 상속관계 및 인터페이스 구현에 대한 제한을 설정
/*
 * 타입 변수 T 의 제한
 * - 타입 변수 T 는 Fruit2 자신과 Fruit2 자손까지 사용 가능.
 * - Fruit2 class 는 Eatable 인터페이스를 구현 해야 함.
 * 
 * FruitBox2 는 Box2 를 상속받아서 구현 함.
 */
class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {
	
}



public class FruitBoxEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fruit2 class 에 Eatable interface 를 구현한 상태임.
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
		
		fruitBox.add(new Fruit2());
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		fruitBox.add(new Fruit2());
		fruitBox.add(new Fruit2Child());
		
		appleBox.add(new Apple2());
		// appleBox.add(new Grape()); => NG

		// 객체의 참조변수 타입을 부모타입으로 객체 생성하는 것은 가능 => OK
		// 
		Box2<Fruit2> box = new Box2<Fruit2>();
		Box2<Fruit2> box2 = new FruitBox2<Fruit2>();
		//Box2<Fruit2> box2 = new FruitBox2<Fruit2>();
		
		
		
		//Box2<Fruit2> box3 = new FruitBox2<Toy2>(); => NG
		//Box2<Fruit2> box4 = new FruitBox2<Apple2>(); => NG
		
	}

}
