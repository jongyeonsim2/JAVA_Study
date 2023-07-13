package ch7;

/*
 *  웹 애플리케이션 개발
 *  1. DB 연동
 *     Oracle, Mysql 등
 *     
 *  2. DB 와의 연결 구조
 *     JAVA 애플리케이션 - JDBC(Java DataBase Connectivity) - DB(Oracle, Mysql 등)
 *     
 *     JDBC 는 각 데이터베이스의 개발사에서 제공.
 *     JDBC 가 변경될 가능성이 높음.
 *     
 *  3. 책의 예제에 매핑
 *     InstanceManager, A3, B3
 *     
 *     A3( JAVA 애플리케이션 ) - InstanceManager( JDBC ) - B3( DB )
 *  
 *     InstanceManager 는 변경이 되더라도, 애플리케이션 단은 변경이 발생하지 않도록 하고 싶다.
 *     => 약한 결합이 되도록 하면 됨.
 *     => interface 
 *  
 *     InstanceManager 는 다양한 데이터베이스 벤더에서 제공해주는 JDBC 를 관리하는 성격도 있음.
 *  
 *  
 *  
 */

interface InterF {
	public abstract void jdbc();
}

// DB 벤더에서 제공해주는 jdbc Driver 를 관리하는 클래스
class InstanceManager {
	public static InterF getInstance() {
		return new Oracle();
	}
}

class WebApp {
	void getJDBC() {
		InterF i = InstanceManager.getInstance();
		i.jdbc();
	}
}

class Oracle implements InterF {

	@Override
	public void jdbc() {
		// TODO Auto-generated method stub
		System.out.println("Oracle jdbc 임.");
	}
	
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebApp wa = new WebApp();
		wa.getJDBC();
	}

}
