package ch9;

import static java.util.Objects.*;

import java.util.Objects;

/*
 * java.util.Objects class 활용
 */

public class ObjectsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D_2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D_3 = new String[][] {{"aaa","bbb"},{"AAA1","BBB1"}};
		
		// equals()
		System.out.println(Objects.equals(str2D, str2D_2));
		
		// deepEquals()
		System.out.println(Objects.deepEquals(str2D, str2D_2));
		System.out.println(Objects.deepEquals(str2D, str2D_3));
		
		// isNull()
		System.out.println(isNull(null));
		System.out.println(isNull(str2D));
		
	}

}




