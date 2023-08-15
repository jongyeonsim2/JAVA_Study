package ch15;

import java.io.*;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\workspace-eclipse-java-2023-06\\JAVA_Study\\src\\ch15\\FileEx1.java");
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("fileName : " + fileName);
		System.out.println("pos : " + pos);
		
		//FileEx1.java
		System.out.println("경로를 제외한 파일명 - " + f.getName());
		
		//FileEx1
		System.out.println("확장자를 제외한 파일명 - " + fileName.substring(0, pos));
		
		//java
		System.out.println("파일의 확장자 - " + fileName.substring(pos+1));
		
		//c:\jdk1.8\work\ch15\FileEx1.java
		System.out.println("경로를 포함한 파일명 - " + f.getPath());
		
		//c:\jdk1.8\work\ch15\FileEx1.java
		System.out.println("파일의 절대 경로 - " + f.getAbsolutePath());
		
		//c:\jdk1.8\work\ch15
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		
		//C:\workspace-eclipse-java-2023-06-For_Class_Prepare\JAVA_Study
		System.out.println("현재 프로그램이 실행중이 디렉토리 - " + 
							System.getProperty("user.dir"));
		
		
	}

}
