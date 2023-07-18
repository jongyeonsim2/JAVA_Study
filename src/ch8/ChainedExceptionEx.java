package ch8;

/*
 * 1. Exception class 의 상속관계도의 이해
 * 2. Unchecked Exception, Checked Exception 의 이해
 * 3. Exception class 의 상속관계도를 바탕으로 한 
 *    각 클래스의 생성자의 이해
 * 4. 연결된 예외의 이해
 * 5. Exception 클래스의 설계에 대한 이해
 * 
 * 
 * 상속관계도
 * Object <- Throwable <- Exception <- RuntimeException
 * 
 * 생성자
 * RuntimeException(Throwable cause) {
 * 	 super(cause);
 * }
 * 
 * Exception(Throwable cause) {
 * 	 super(cause);
 * }
 * 
 * Throwable(Throwable cause) {
 * 	 this.cause = cause;
 * }
 * 
 */

public class ChainedExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			install();
		} catch (InstallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			// 연결된 예외 구현
			// 두 개의 Exception을 하나의 Exception( 대표 Exception : InstallException )으로 만드는 작업.
			InstallException ie = new InstallException("설치중 예외발생");
			
			// SpaceException을 대표 Exception에 포함시킴.
			ie.initCause(e);
			throw ie;
			
//			System.out.println("에러 메세지 : " + e.getMessage());
//			e.printStackTrace();
//			System.out.println("공간이 부족함으로 공간을 확보한 후 재설치해주세요.");
//		} catch (MemoryException me) {
//			InstallException ie = new InstallException("설치중 예외발생");
//			
//			// SpaceException을 대표 Exception에 포함시킴.
//			ie.initCause(me);
//			throw ie;
			
//			System.out.println("에러 메세지 : " + me.getMessage());
//			me.printStackTrace();
//			System.out.println("메모리가 부족함으로 메모리를 확보한 후 재설치해주세요.");
		} finally {
			deleteFiles();
		}
	}
	
	
	// 설치 시작을 위한 준비 메소드 ( 공간이 충분한지, 메모리가 여유로운지 )
	// Checked Exception 을 Unchecked Exception 으로 변경하려고 함.
	// => 앞으로 Checked Exception 더 추가가 됨으로,
	//    try...catch... 가 추가 또는 메소드 선언부에 throws 가 추가됨이 예상
	// => 이런 추가가 발생하지 않도록 Unchecked Exception 바꾸려고 함.
	// 결론은 RuntimException class 의 생성자를 활용. => 매개변수가 Trowable type 임.
	static void startInstall() throws SpaceException {
	//static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치 공간 부족"); //Checked 예외 => try .. 또는 thorws 해야함.
		
		if(!enoughMemory()) {
			// Checked Exception
			//throw new MemoryException("메모리 부족"); //Checked 예외 => try .. 또는 thorws 해야함.
			// Unchecked Exception
			throw new RuntimeException(new MemoryException("메모리 부족"));
		}	
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
		return true;
	}

}


//설치 중에 발생하는 Exception 을 대표하는 Exception class
class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

//설치 공간이 부족한 경우를 위한 Exception class
class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

//메모리가 부족한 경우를 위한 Exception class
class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}






