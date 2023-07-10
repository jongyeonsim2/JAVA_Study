package ch6;

/*
 * 초기화 block를 사용하는 예제. => 복잡한 초기화(뭔가 처리가 필요)에 사용.
 */
public class StaticBlockTest {
	//클래스 변수. 배열임.
	static int[] arr = new int[10];
	//클래스 변수 초기화 block 를 이용해서 arr 의 요소를 초기화
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i] );
		}
	}

}
