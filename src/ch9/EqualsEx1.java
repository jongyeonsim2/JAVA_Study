package ch9;

/*
 * 1. Object class 가 누구이고, 어떤 역할을 하는지?
 * 2. equals() 동작 이해
 * 3. String equals() 차이점
 */

public class EqualsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		// 참조변수의 주소값으로 서로 비교
		// 두 객체의 메모리 공간이 다름.
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같음.");
		} else {
			System.out.println("v1과 v2는 다름.");
		}
		
		
		// v1 의 주소값으로 v2 를 초기화.
		v2 = v1;
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같음.");
		} else {
			System.out.println("v1과 v2는 다름.");
		}
		
		// equals 는 참조변수의 주소값을 비교. 
		// 경우에 따라서는 주소값 비교가 의미가 없을 수 있음. => 오버라이딩이 필요. => String.equals()
		
		Person p1 = new Person(10000L);
		Person p2 = new Person(10000L);
		
		if (p1==p2) {
			System.out.println("p과 p2는 주소가 같음.");
		} else {
			System.out.println("p1과 p2는 주소가 다름.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 인스턴스 변수의 값이 같음.");
		} else {
			System.out.println("p1과 p2는 인스턴스 변수의 값이 다름.");
		}
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}


class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	// Object class의 equals() 를 재정의. 주소값 비교가 의미가 없는 경우.
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
}







