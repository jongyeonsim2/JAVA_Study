package ch15;

import java.io.*;

/***
 * 재귀적 파일 삭제 - 서브 디렉토리의 파일까지 삭제 - 재귀함수.
 */

public class FileEx8 {
	
	//삭제된 파일의 수
	static int deleteFiles = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("삭제할 파일의 확장자를 지정해주세요.");
			System.exit(0);
		}
		
		// 현재 프로그램이 실행되고 있는 경로
		String currDir = System.getProperty("user.dir");
		
		// 디렉토리도 File 객체로 만들어야 함.
		File dir = new File(currDir);
		
		// 확장자 명 
		String ext = "." + args[0];
		
		delete(dir, ext);
		
		System.out.println(deleteFiles + "개의 파일이 삭제가 되었습니다.");
	}
	
	// 파일 삭제용 재귀함수
	// 해당 디렉토리의 해당 파일 확장자의 파일을 삭제
	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			// 디렉토리인지 파일인지 반드시 체크
			// 디렉토리 : delete()
			// 파일 : 확장자 체크 후, 파일삭제
			if(files[i].isDirectory()) {
				
			} else {
				String filename = files[i].getAbsolutePath();
				
				// 확장자 체크
				if(filename.endsWith(ext)) {// 확장자로 끝나는지 체크
					
					if(files[i].delete()) {
						System.out.println("파일 삭제 성공");
						deleteFiles++;
					} else {
						System.out.println("파일 삭제 실패");
					}
				}
					
			}
			
		}
	}

}






