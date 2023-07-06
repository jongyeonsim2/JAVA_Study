package ch2;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class 는 객체가 되면, 데이터와 메소드로 구성.
		String name = "Ja" + "va";
		String result;
		
		String name2= new String("Ja");
		String name3= new String("va");
		
		result = name2.concat(name3);
		System.out.println(result);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.printf("name2 의 값은 %s%n", name2);
		
		
		String str = name + 8.0;
		
//		System.out.println(name);
//		System.out.println(str);
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		int d = 10;
		
		long big = 100_000_000_000L;
		long big2 = 100000000000L;
		
		int octNum = 010; //8진수
		int hexNum = 0x10; //16진수, 10진수 16
		int binNum = 0b10; //2진수, 10진수 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("d=[%5d]%n", d);
		
		System.out.printf("hexNum=%#x%n", hexNum);
		System.out.printf("octNum=%o %d%n", octNum, octNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
	}

}
