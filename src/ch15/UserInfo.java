package ch15;

/***
 * 직렬화 및 역직렬화에 사용할 클래스
 */

public class UserInfo implements java.io.Serializable {

	String name;
	transient String password;
	int age;
	
	public UserInfo() {
		this("UnKonwn", "1111", 30);
	}

	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String toString() {
		return "(" + name + ", " + password + ", " + age + ")";
	}
	
}
