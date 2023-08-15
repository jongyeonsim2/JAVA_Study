package ch15;

import java.io.*;

/***
 * 문자기반 스트림 사용 예제.
 * FileReader, FileWriter 사용 예제.
 */

public class FileConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//C:\workspace-eclipse-java-2023-06-For_Class_Prepare\JAVA_Study\src\ch15\FileConversion.java 
			
			FileReader fr = new FileReader(args[0]);
			//C:\workspace-eclipse-java-2023-06-For_Class_Prepare\JAVA_Study\src\ch15\Conversion.txt
			FileWriter fw = new FileWriter(args[1]);
			
			int data = 0;
			
			while( (data = fr.read()) !=-1 ) {
				if ( 
						data != '\t' &&
						data != '\n' &&
						data != ' ' &&
						data != '\r'
					) {
					// 파일의 내용을 읽어서, 한 줄 의 데이터를 작성.
					fw.write(data);
				}
					
			}
			
			fr.close();
			fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}






