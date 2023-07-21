package ch12;

enum Direction2 {
	EAST2(1, ">"), SOUTH2(2, "V"), WEST2(3, "<"), NORTH2(4, "^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
		
	}
	
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
	
	public static Direction2 of(int dir) {
		if (dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
		
		return DIR_ARR[dir - 1];
	}
	
	
	public String toString() {
		return name() + getSymbol();
	}
}


public class EnumEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Direction2 d : Direction2.values())
			System.out.printf("%s=%d%n" , d.name(), d.getValue());
		
		Direction2 d1 = Direction2.EAST2;
		Direction2 d2 = Direction2.valueOf("WEST2");

		System.out.println(d1);
		
		Direction2 d3 = Direction2.of(2);
		
		System.out.printf("d3=%s, %d, %s%n", d3.name(), d3.getValue(), d3.getSymbol());
	}
	
	

}
