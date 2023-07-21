package ch12;

// 열거형 선언
enum Direction { EAST, SOUTH, WEST, NOTRH }

public class EnumEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direction d1 = Direction.EAST;
		Direction d3 = Direction.valueOf("WEST");
		Direction d2 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		// 비교
		System.out.println("d1 == d2 : " + (d1==d2));
		System.out.println("d2 == d3 : " + (d2==d3));
		
		// equals
		System.out.println("d3.equals(d2) : " + d3.equals(d2));
		
		// 크다 작다 비교
		//System.out.println(d2 > d3); => NG
		
		/*
		 * 비교 대상이 같은 0, 왼쪽이 크면, 양수, 오른쪽이 크면 음수
		 */
		System.out.println("d2.compareTo(d3) : " + d2.compareTo(d3));
		
		// switch 문
		switch (d1) {
		case EAST:
			System.out.println("EAST");
			break;
		case SOUTH:
			System.out.println("SOUTH");
			break;
		case WEST:
			System.out.println("WEST");
			break;
		case NOTRH:
			System.out.println("NOTRH");
			break;
		default:
			System.out.println("No Direction");
			break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) 
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
	}

}






