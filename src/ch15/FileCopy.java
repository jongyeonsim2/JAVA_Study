package ch15;

import java.io.*;

/***
 * FileInputStream, FileOutputStream 사용 예제
 * 
 * 그림 15-2 참조.
 * 
 * 실행시 입력한 매개변수
 * C:\workspace-eclipse-java-2023-06\JAVA_Study\src\ch15\FileCopy.java 
 * C:\workspace-eclipse-java-2023-06\JAVA_Study\src\ch15\FileCopy.bak
 * 
 */

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 // 파일이 대상임으로 생성자의 매개변수에 파일의 전체 경로를 사용
			 // C:\workspace-eclipse-java-2023-06\JAVA_Study\src\ch15\FileCopy.java 
			 FileInputStream fis = new FileInputStream(args[0]);
			 
			 // C:\workspace-eclipse-java-2023-06\JAVA_Study\src\ch15\FileCopy.bak
			 FileOutputStream fos = new FileOutputStream(args[1]);
			 
			 int data = 0;
			 
			 // FileCopy.java 를 바이트 단위로 읽어서, FileCopy.bak 에 바이트 단위로 write 함. 
			 while( (data = fis.read()) != -1 ) {
				 fos.write(data);
			 }
			 
			 fis.close();
			 fos.close();
			 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
