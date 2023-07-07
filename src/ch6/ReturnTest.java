package ch6;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0}; // 정수형 요소가 하나인 배열생성.
		r.add(22, 22, result2);
		System.out.println(result2[0]);
	}

	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b; //return 과 동일한 효과.
	}
	
	
}
