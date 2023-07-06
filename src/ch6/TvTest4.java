package ch6;

public class TvTest4 {

	/*
	 * String 객체 배열, 기본형의 배열을 사용해왔음.
	 * 
	 * 사용자 정의형의 객체배열을 사용해봄. => Tv 객체 배열
	 * 
	 * Tv 객체 배열선언하면, 메모리의 효율적인 관리.
	 * => Tv 객체 배열의 요소를 하나씩 일일이 초기화가 필요. => new 해서 객체를 생성해야 함.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TV 객체의 주소를 저장할 수 있는 3개짜리 참조변수형 배열을 선언.
		Tv[] tvArr = new Tv[3];
		
		// 객체 배열의 요소를 초기화 => new 키워드를 사용해서 객체생성 해야함.
		for(int i=0; i < tvArr.length ; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i < tvArr.length; i++ ) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d] : %d%n", i, tvArr[i].channel);
		}
	}

}








