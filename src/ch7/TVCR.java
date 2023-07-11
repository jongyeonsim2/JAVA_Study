package ch7;

/*
 * JAVA 는 다중상속을 지원하지 않음.
 * 하지만, 다중상속이 필요해지는 경우는 어떻게 하면 되나?
 * 
 * TV class, VCR class 이 두 개의 class 를 이용해서 TVCR class 가 필요함.
 * 
 * 해결방법은 싱글 상속, has-a 관계를 복합 적용해서 해결함.
 * 
 * 
 */

class VCR {
	boolean power;
	int counter = 0;
	
	void power() {}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

/*
 * 단일상속( TV 대상 ), has-a 관계( VCR )를 복합 적용.
 */
class TVCR extends Tv {

	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	// 새로운 제품의 기능임으로 메소드를 직접 구현.
	// 직접 구현한 메소드 내부에서는 VCR의 메소드로 호출해서 사용.
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}

}
