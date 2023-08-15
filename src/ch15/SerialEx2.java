package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/***
 * 역직렬화 프로그램
 */

public class SerialEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 역직렬화 파일명
		//String fileName = "UserInfo.ser";
		String fileName = "C:\\workspace-eclipse-java-2023-06\\JAVA_Study\\src\\ch15\\UserInfo.ser";
		
		try {
			// 기반 스트림
			FileInputStream fis = new FileInputStream(fileName);
			
			// 입력용 보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			// 역직렬화용 보조스트림
			ObjectInputStream in = new ObjectInputStream(bis);
			
			
			// 역직렬화 => 순서가 중요
			UserInfo u1 = (UserInfo)in.readObject();
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			
			in.close();
			
			System.out.println("역직렬화 처리 완료!!");
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
