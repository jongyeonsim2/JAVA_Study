package ch12;

import java.util.Collections;
import java.util.Comparator;

/*
 * 와일드 카드 적용 하는 예제 : 하한 제한 : 자기 자신과 부모
 */

//Fruit3
class Fruit3 {
	String name;
	int weight;
	
	Fruit3(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name + "(" + weight + ")";
	}
}

//Apple3
class Apple3 extends Fruit3 {
	Apple3(String name, int weight) {
		super(name, weight);
	}
}

//Grape3
class Grape3 extends Fruit3 {
	Grape3(String name, int weight) {
		super(name, weight);
	}
}

//Comporator 을 구현한 class 3 가지
//ApplComp : Apple 에 대한 정렬
class AppleComp implements Comparator<Apple3> {
	public int compare(Apple3 t1, Apple3 t2) {
		/*
		 * 과일의 무게에 대한 기준은 3가지.
		 * 1. 음수인 경우 ( A, B 경우 ) 
		 * 2. 양수인 경우 ( A, B 경우 ) 
		 * 3. 0인 경우
		 */
		
		// A 경우, return t1.weight - t2.weight;  =>   내림차순
		
		// B 경우, return t2.weight - t1.weight;  =>   오름차순
		return t2.weight - t1.weight;
	}
}

//GrapeComp : Grape 에 대한 정렬 => 내림차순
class GrapeComp implements Comparator<Grape3> {
	public int compare(Grape3 t1, Grape3 t2) {
		return t2.weight - t1.weight;
	}
}

//FruitComp : Fruit 에 대한 정렬 => 오름차순
class FruitComp implements Comparator<Fruit3> {
	public int compare(Fruit3 t1, Fruit3 t2) {
		return t1.weight - t2.weight;
	}
}

//FruitBox3
class FruitBox3<T extends Fruit3> extends Box3<T> {}

//Box3 은 기존의 class 를 사용.



public class FruitBoxEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();
		FruitBox3<Grape3> grapeBox = new FruitBox3<Grape3>();
		
		appleBox.add(new Apple3("Apple", 400));
		appleBox.add(new Apple3("Apple", 300));
		appleBox.add(new Apple3("Apple", 200));
		
		grapeBox.add(new Grape3("Grape", 300));
		grapeBox.add(new Grape3("Grape", 100));
		grapeBox.add(new Grape3("Grape", 200));
		
		
		/*
		 * 
		 * static <T> void sort(List<T> list, Comporator<T> c)
		 * 
		 * 메소드가 중복이 될 수 있는 상황이 발생함.
		 * 
		 * void sort(List<Apple> list, Comporator<Apple> c )
		 * void sort(List<Grape> list, Comporator<Grape> c )
		 * void sort(List<Fruit> list, Comporator<Fruit> c )
		 * 
		 * ==> 컴파일 시, 
		 * void sort(List list, Comporator c ) X 3개가 발생. => 메소드 중복 발생. 
		 *     => 결국, 메소드 하나만 사용하게 되는 상황이 발생하게 될 수 있음.
		 *     => 그래서, default 로 와일드 카드를 사용.
		 * 
		 * 
		 */
		
		
		/*
		 * Collections.sort 원형
		 * 
		 * static <T> void sort(List<T> list, Comporator<? super T> c) => 매개변수의 다형성
		 * 
		 * sort() 메소드의 2 번째 매개변수의 와일드 카드 제한 기준 : 하한 제한
		 * Comporator<? super T> => T와 T의 그 조상만 가능.
		 * 
		 * sort() 메소드의 2 번째 매개변수로 사용할 3가지 정렬 조건.
		 * Comparator<Apple3>
		 * Comparator<Grape3>
		 * Comparator<Fruit3>
		 * 
		 * ===> 정리를 하면,
		 * 와일드카드의 하한 제한을 구현하여, 매개변수의 다형성이 되도록 함.
		 * 따라서, Fruit3 를 상속받은 자식인 Apple3, Grape3 및 자기 자신인 Fruit3 을
		 * 하나의 타입으로 받을 수 있게끔 구현함.
		 * 
		 * ===> 추가적으로 하고 싶은 이야기는
		 * AppleComp, GrapeComp, FruitComp 를 3개의 클래스로 사용할 필요가 없고,
		 * FruitComp 클래스만 사용해도 충분함을 의미함.
		 * 
		 * AppleComp, GrapeComp 클래스는 중복된 기능을 가진 클래스임.
		 * FruitComp 클래스의 정렬 조건만 수정하면 내림차순, 오름차순 정렬이 모두 가능함.
		 * 
		 * 
		 */
		
		/*
		 * 하나의 메소드로 사용하기 위해서 
		 */
		System.out.println(" ==== AppleComp, GrapeComp ==== ");
		Collections.sort(appleBox.getList(), new AppleComp()); // 내림차순
		Collections.sort(grapeBox.getList(), new GrapeComp()); // 내림차순
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		
		System.out.println(" ==== FruitComp ==== ");
		Collections.sort(appleBox.getList(), new FruitComp()); // 오름차순
		Collections.sort(grapeBox.getList(), new FruitComp()); // 오름차순
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		
		
	}

}







