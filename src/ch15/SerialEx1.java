package ch15;

import java.io.*;
import java.util.ArrayList;

/***
 * 직렬화용 클래스
 * 
 * - 직렬화 스트림은 보조 스트림임. => 기반 스트림이 필요. => 객체를 file 로 출력.
 * - 직렬화가 될 데이터가 큰 경우는 출력용 보조스트림을 추가해서 성능을 개선.
 * 
 * - ( 일반 객체, collection 객체 ) -> 직렬화함.
 * - 
 * 
 */

public class SerialEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 직렬화 파일면
			//String fileName = "UserInfo.ser";
			String fileName = "C:\\workspace-eclipse-java-2023-06\\JAVA_Study\\src\\ch15\\UserInfo.ser";
			
			// 기반 출력 스트림
			FileOutputStream fos = new FileOutputStream(fileName);
			// 출력 보조스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 직렬화 보조 스트림
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			// 객체 생성
			UserInfo u1 = new UserInfo("Kim", "1234", 32);
			UserInfo u2 = new UserInfo("Park", "1234", 28);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			
			list.add(u1);
			list.add(u2);
			
			// 직렬화 => 순서를 기억해야 함.
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			
			out.close();
			
			System.out.println("직렬화 처리 완료.");
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
