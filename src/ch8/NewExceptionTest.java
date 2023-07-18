package ch8;

/*
 * p.446 의 소스의 기능을 간단하게 미리 확인하기 위한 소스임.
 * 
 *  프로그램을 설치 단계를 적용한 Exception 예제.
 */

public class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간이 부족함으로 공간을 확보한 후 재설치해주세요.");
		} catch (MemoryException me) {
			System.out.println("에러 메세지 : " + me.getMessage());
			me.printStackTrace();
			System.out.println("메모리가 부족함으로 메모리를 확보한 후 재설치해주세요.");
		} finally {
			deleteFiles();
		}
		
	}
	
	// 설치 시작을 위한 준비 메소드 ( 공간이 충분한지, 메모리가 여유로운지 )
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치 공간 부족"); //Checked 예외 => try .. 또는 thorws 해야함.
		
		if(!enoughMemory())
			throw new MemoryException("메모리 부족"); //Checked 예외 => try .. 또는 thorws 해야함.
	}

	
	// 설치할 파일을 local에 복사 메소드
	static void copyFiles() {
		
	}
	
	// 설치 완료 또는 미완료시의 필요없는 file 삭제하는 메소드
	static void deleteFiles() {
		
	}
	
	// 동작 테스트를 위한 제어 메소드
	// 공간 제어
	static boolean enoughSpace() {
		return false;
	}
	
	// 메모리 제어
	static boolean enoughMemory() {
		return false;
	}
	
}

// 설치 공간이 부족한 경우를 위한 Exception class
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

// 메모리가 부족한 경우를 위한 Exception class
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}












