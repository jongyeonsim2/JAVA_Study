package ch2;

public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		float f4 = 123.456789f;
		double d = 1.23456789;
		
		String str = "HelloWorld";
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f4);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10ff%n", d);
		
		System.out.printf("[%s]%n", str);
		System.out.printf("[%20s]%n", str);
		System.out.printf("[%-20s]%n", str);
		System.out.printf("[%.5s]%n", str);
	}

}
