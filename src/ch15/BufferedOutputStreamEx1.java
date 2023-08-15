package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * 
 * BufferedOutputStream 사용하는 예제.
 * - 보조스트림임으로 직접 출력은 못함. 
 * - 그래서, OutputStream이 필요함. => File 을 대상으로 하는 예제.
 * 
 */

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// output steam 생성
			FileOutputStream fos = 
					new FileOutputStream(
							"C:\\workspace-eclipse-java-2023-06\\JAVA_Study\\src\\ch15\\123.txt"
							);

			// 보조 스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for( int i='1' ; i <= '9'; i++ ) {
				bos.write(i);
			}
			
			bos.close();
			//fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}





