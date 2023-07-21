package ch12;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 와일드 카드 사용 예제
 * - 타입변수의 와일드 카드 => 메소드 중복 문제 해결위해서
 *   => 상한 제한( ? extends Fruit ) => Fruit, Fruit 자식( Apple, Grape )까지 사용 가능.
 */

// Fruit, Apple, Grape 는 기존의 class 사용.

class FruitBox<T extends Fruit> extends Box3<T> {
	
}

class Box3<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	ArrayList<T> getList() {return list;}
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

//Juice class
class Juice {
	String name;
	
	Juice(String name) {
		this.name = name + "Juice";
	}
	public String toString() {
		return name;
	}
}

//Juicer class
class Juicer {
	/*
	 * 매개변수 타입으로 FruitBox<Fruit>, FruitBox<Apple> 각각 사용하게 되면,
	 * makeJuice() 도 매개변수에 맞추어서 각각 만들어서 사용해야 함.
	 * 
	 * makeJuice(FruitBox<Fruit> box), makeJuice(FruitBox<Apple> box)  
	 * 
	 * => 하지만, 컴파일시, 타입변수가 없어지고, 아래와 같이 됨.
	 *    makeJuice(FruitBox box), makeJuice(FruitBox box)  => 메소드 중복이 발생.
	 * 
	 * 따라서, 매개변수의 타입이 다르더라도, 하나의 타입으로 받을 수 있도록 해야함. 
	 * => 그래서, 와일드카드를 사용하게됨.
	 * 
	 * 그래서, ? 의 의미는 
	 * 와일드 카드인 ? 에 Fruit와 Fruit 자식이 올수 있게 됨.
	 * 
	 * 
	 * makeJuice를 사용하는 쪽에서는 다음과 같이 사용할 수 있게됨.
	 * 
	 * FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
	 * FruitBox<Apple> appleBox = new FruitBox<Apple>();
	 * 
	 * Juicer.makeJuice(fruitBox);
	 * Juicer.makeJuice(appleBox);
	 * 
	 */
	static Juice makeJuice( FruitBox<? extends Fruit>  box) {
		String tmp = "";
		
	    for (Fruit f : box.getList())
	    	tmp += f + " ";
	    
	    return new Juice(tmp);
	}
}


public class FruitBoxEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두 가지 타입의 Box 객체를 생성.
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		// box에 과일을 담는다.
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		// 현재는 makeeJuice() 의 매개변수에 와일드 카드가 적용이 된 상태임.
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}









