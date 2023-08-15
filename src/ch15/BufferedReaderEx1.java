package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/***
 * 문자기반의 보조 스트림 사용.
 * 
 * BufferedReader 사용 예제.
 * - FileReader 을 사용 => Reader 임으로 보조 스트림을 이용해서 사용.
 */

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("C:\\workspace-eclipse-java-2023-06\\JAVA_Study\\src\\ch15\\BufferedReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			// BufferedReader 문자 기반 보조스트림으로,
			// 라인 단위로 데이터를 읽을 수 있는 메소드르 지원.
			for (int i = 1; (line = br.readLine()) != null; i++) {
				if( line.indexOf(";") !=-1 )
					System.out.println(i + " : " + line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}




