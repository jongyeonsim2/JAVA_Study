package ch9;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 재사용 확인 => 
		 */
		String str1 = "abc";
		String str2 = "abc";

		//주소 비교
		System.out.println("str1 == str2 : " + (str1 == str2)); // true => 재사용인 것이 확인됨.
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		//주소 비교
		System.out.println("str3 == str4 : " + (str3 == str4)); // false => 재사용 아닌것이 확인됨.
		
	}

}
