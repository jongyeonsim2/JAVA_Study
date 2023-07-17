package ch8;

/*
 * 1. try..with..resoruces 문의 활용 : close() 메소드 자동 호출 용도
 * 2. close() 메소드 자동 호출을 위해서 AutoCloseable interface 를 구현
 * 3. Exception이 두 개가 발생하는 경우
 *    try catch 에서 해당하는 Exception에 대해서 catch 하고 처리.
 *    - 발생한 Exception에서 두 개가 발생한 경우 하나느 Exception이 발생되고,
 *      나머지 하나는 억제됨.
 */

public class TryWithResourceEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 하나의 Exception 발생.
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false); // WorkException 발생하지 않음. 
									// CloseException 발생. => 오버라이드가 된 close() 호출되기 때문임.
		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// 2. 두 개의 Exception 발생.
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true); // WorkException 발생하지 않음. 
									// CloseException 발생. => 오버라이드가 된 close() 호출되기 때문임.
		} catch(WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
	}

}

// AutoCloseable interface 를 구현한 클래스 : close() 메소드 자동 호출하도록 하기 위함.
/*
 * CloseableResource class 는 Exception 을 두 개 발생할 건지 
 * 아니면, 하나만 발생할 건지를 담당하는 클래스
 * 
 * 1. 한 개 (default) => close() => CloseException
 * 2. 두 개 => close() => CloseException
 *            exceptionWork() => WorkException
 * 
 */
class CloseableResource implements AutoCloseable {

	// WorkException 을 발생하는 메소드 : Exception 발생 제어 기능 
	public void exceptionWork(boolean exception) throws WorkException  {
		System.out.println("exceptionWork : 매개변수 :" + exception);
		
		// Exception 발생 제어 기능
		if(exception)
			throw new WorkException("WorkException 발생");
	}
	
	// CloseException 을 발생하는 메소드
	@Override
	public void close() throws CloseException {
		// TODO Auto-generated method stub
		System.out.println("close() 호출됨.");
		
		throw new CloseException("CloseException 발생");
	}
	
}

// 발생시킬 Exception 을 정의 1 : WorkException
class WorkException extends Exception {
	WorkException(String msg) { super(msg); };
}

//발생시킬 Exception 을 정의 2 : CloseException
class CloseException extends Exception {
	CloseException(String msg) { super(msg); };
}






