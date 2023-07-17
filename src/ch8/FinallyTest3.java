package ch8;

/*
 * return, finally 혼재하는 경우의 동작 흐름을 이해하는 예제. 
 */

public class FinallyTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method1() 호출
		FinallyTest3.method1();
		System.out.println("method1() 호출 된 후 main() 으로 복귀.");
	}
	
	static void method1() {
		try {
			System.out.println("method1() 호출됨.");
			return;    // => finally 동작은 어떻게 되는지를 확인!!!!!
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1() 의 finally 수행.");
		}
	}
}
