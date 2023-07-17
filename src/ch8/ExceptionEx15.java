package ch8;

import java.io.File;
import java.io.IOException;

/*
 * 
 * finally 가 있는 경우의 처리 순서
 * 1. Exception 이 발생한 경우
 *    try -> catch -> finally
 * 
 * 2. Exception 이 발생하지 않은 경우
 *    try -> finally
 * 
 */

public class ExceptionEx15 {

	// main() 에서는 Exception의 발생 여부를 모름.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = createFile(args[0]);
		System.out.println(f.getName() + " 파일이 생성됨." );
	}
	
	// 파일을 생성시 매개변수에 대한 확인.
	static File createFile(String fileName) {
		try {
			// 파일 생성에 필요한 파일명에 문제가 없는지 체크
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일명이 무효함.");
			}
		} catch (Exception e) {
			// 사용자가 무효한 파일명을 매개변수로 전달했으므로,
			// 파일명을 임의로 지정.
			fileName = "제목없음.txt"; //=> 파일 생성에 문제가 없음.
		} finally {
			/*
			 * finally : 예외의 발생여부에 상관없이 실행되어야 하는 경우
			 */
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
		
	}
	
	// 매개변수의 validation check 후 부적절 한 경우의 메소드
	static void createNewFile(File f) {
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}






