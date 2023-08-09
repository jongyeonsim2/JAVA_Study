package ch12;

/**
 * 열거형(enum) : 상수를 편하게 사용하기 위해서 사용.
 * 
 * 열거형 정의법
 * 1. enum Kind { CLOVER, HEART, DIAMOND, SPADE }
 *    enum Kind { CLOVER( 5 ), HEART( 8 ), DIAMOND( 10 ), SPADE( 11 )  }
 * 2. 멤버를 사용하는 방법
 * 3. 추상 메소드를 사용하는 방법
 */

enum Direction {
	// 열거형을 멤버를 사용해서 정의
	// - 멤버변수 정의가 필요.
	// - 멤버변수의 초기화를 위해 생성자가 필요.
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, ">");
	
	// EAST(1, ">")
	// EAST : name
	// 1 : value
	// ">" : symbol
	
	// 멤버변수
	private final int value;
	private final String symbol;
	
	// 생성자
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	// 게터, 세터
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
	
	public String toString() {
		return name() + " - " + getValue() + " - " + getSymbol();
	}
}

public class EnumEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.WEST;
		
		System.out.printf("d1 = %s, %d %n", d1.name(), d1.getValue());
		System.out.printf("d2 = %s, %d %n", d2.name(), d2.getValue());
		
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
	}

}
