package ch11;

import java.util.*;

/*
 * Properties 사용 예제
 * 
 * - 애플리케이션의 환경설정과 관련된 속성을 저장 및 조회 후 사용하는데 주로 사용.
 * - 파일에 환경설정 정보를 저장하여, 해당 정보를 파일로부터 읽어서, 서버 및 애플리케이션 기동시 반영하는데 사용.
 */

public class PropertiesEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		
		// key, value 를 설정. String, String 타입으로 저장.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		// Key 만 조회.
		// Enumeration 은 Iterator 의 구버전임. 컬렉션 프레임워크 이전의 버전.
		Enumeration e = prop.propertyNames();
		
		System.out.println(" ======== key, value ======== ");
		while(e.hasMoreElements() ) {
			//HashMap 의 key
			String element = (String)e.nextElement();
			//HashMap 의 해당 key에 대한 value
			System.out.println("key : " + element);
			System.out.println("value : " + prop.getProperty(element));
		}
		
		System.out.println();
		
		// 설정정보 변경
		System.out.println(" ======== 설정정보 변경 및 출력 ======== ");
		prop.setProperty("size", "100");
		
		System.out.println("size : " + prop.getProperty("size"));
		System.out.println();
		
		// 설정 정보 전체 출력
		// System.out : 연결된 표준 출력으로 정보를 출력. 현재는 모니터임.
		System.out.println(" ======== 설정 정보 표준 출력으로 출력 ======== ");
		prop.list(System.out);
	}

}



