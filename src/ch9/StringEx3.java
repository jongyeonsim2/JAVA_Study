package ch9;

/*
 * 길이가 0 인배열의 선언과 출력.
 * String class의 메소스 사용.
 */

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] cArr = new char[0];// 길이가 0인 배열
//		
//		String s = new String(cArr);// String 객체의 char[] 멤버변수를 길이가 0인 배열로 초기화
//		
//		// 길이를 출력
//		System.out.println("cArr.length = " + cArr.length) ;
//		// 데이터를 출력
//		System.out.println("***" + s + "***");
//		
//		
//		
//		char[] cArr2 = {'H','i'};
//		String s2 = new String(cArr2);
//		System.out.println("s2 : " + s2);
//		
//		
//		StringBuffer sb = new StringBuffer("Hello");
//		String s3 = new String(sb);
//		System.out.println("s3 : " + s3);
//		
//		
//		char c = s3.charAt(0);
//		char c2 = s3.charAt(1);
//		System.out.println("c : " + c);
//		System.out.println("c2 : " + c2);
//		
//		
//		int i = "aaa".compareTo("aaa");//0
//		int i2 = "aaa".compareTo("bbb");//-1
//		int i3 = "bbb".compareTo("aaa");//1
//		
//		System.out.println("i : " + i);
//		System.out.println("i2 : " + i2);
//		System.out.println("i3 : " + i3);
//		
//		//replaceAll(String regex, Stgring replacement)
//		// 첫 번째 매개변수는 정규표현식 문자열을 사용해서 확장이 가능.
//		String str2 = "\"Hello, \"My\" World\""; 
//		System.out.println("str2 : " + str2);
//		//replaceAll() => Hello, My World
//		String newStr2 = str2.replaceAll("^\"|\"$", "");
//		System.out.println("newStr2 : " + newStr2);
//		
//		String str3 = "AA**BB#@$CC 가나다-123";
//		String match = "[^0-9]";
//		System.out.println(str3.replaceAll(match, ""));
		
		
		String strArr4 = "a,b,c,d,e,f,g,h,j,o";
		String[] resultArr = strArr4.split(",", 5);
		// split() 메소드의 두 번째 매개변수는 분류할 문자열의 수. => 요소수 5인 배열.
		/*
		 * resultArr[0] => a
		 * resultArr[1] => b
		 * resultArr[2] => c
		 * resultArr[3] => d
		 * resultArr[4] => e,f,g,h,j,o
		 */
		System.out.println(resultArr[4]);
		
	}

}







