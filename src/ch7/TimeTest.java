package ch7;

class Time {
	// 멤버변수의 접근제어자를 private 선어.
	// 1. 데이터 보호 => 캡슐화
	// 2. 복잡도 낮춤 => 캡슐화
	private int hour;
	private int minute;
	private int second;
	
	private int hour2, minute2, second2;
	
	// 생성자
	// 재사용을 위해서 어떻게 구현하면 좋을까? ( 유지보수성 ) => 메소드를 활용하자!!!! => setter, getter
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	
	// 멤버변수의 직접 접근은 불가능.
	// 초기화를 위한 메소드를 구현. => setter 메소드 => public 접근 제어자 사용
	// 값의 안정성을 위해서 유효성 검사
	public void setHour(int hour) {
		if ( hour < 0 || hour > 23 ) return;
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if ( minute < 0 || minute > 59 ) return;
		this.minute = minute;
	}

	public void setSecond(int second) {
		if ( second < 0 || second > 59 ) return;
		this.second = second;
	}
	
	// 초기화 후 값의 참조를 위한 메소드를 구현. => getter 메소드 => public 접근 제어사 사용
	public int getHour() {
		return hour;
	}


	public int getMinute() {
		return minute;
	}


	public int getSecond() {
		return second;
	}

	//toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(10, 10, 10);
		//t1.hour = 10000; // 개발자의 실수
		System.out.println(t1);
		
		// 유효성 검사시 100 검사된 후 초기화 값으로 사용할 수 없음.
		// 최초 초기화 값 0 이 출력됨.
		Time t2 = new Time(100, 10, 10);
		System.out.println(t2);
	}

}
