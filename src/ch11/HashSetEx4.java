package ch11;

import java.util.*;

/*
 * HashSet 객체로 저장시 중복해서 저장이 됨.
 * => 중복 저장을 해결하는 방법 : hashCode(), equals() 메소드를 구현해야함.
 * 
 * 1. hashcode
 *    - 객체를 식별하는 정수 값.
 *    - 객체의 데이터를 어떤 알고리즘을 이용하여 계산된 정수값.
 *    - 객체의 hashCode() 메소드를 호출해서 사용할 수 있도록 오버라이딩을 해야 함.
 *    - hashcode 가 중복이 되는 경우도 있음.
 *    
 * 2. hashcode 사용 목적
 *    - 객체 비교시 발생하는 비용을 낮추기 위함.
 *    - 객체를 비교시 equals() 를 사용하는데, 
 *      hashcode 에 비해 많은 시간이 소요됨. hashcode 가 정수값임으로 성능이 높음.
 *    - 그래서, 컬렉션 프레임워크중에서 HashMap 에서 객체를 탐색시 hashcode 를
 *      사용함.
 *      
 * 3. 객체 비교 기준
 *    - hashcode 가 다르면 두 객체는 다른 객체임.
 *    - 만약, hashcode가 같으면, 두 객체는 같거나 다를 수 있음.
 *      그래서, 이런 경우에 equals() 로 다시 확인.
 * 
 * 4. 구현해야 하는 부분
 *    - hashCode() 를 재정의
 *    - equals() 를 재정의
 *    
 * 5. HashSet 에서 데이터 저장시, 중복체크시, hashCode(), equals() 를 사용하게 됨.
 */

public class HashSetEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 30));
		set.add(new Person("David", 30));
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name); // 아래의 코드와 동일
		//return (name+age).hashCode(); // 위의 코드와 동일
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person other = (Person) obj;
			return name.equals(other.name) && age==other.age;
		}
		return false;
	}
}




