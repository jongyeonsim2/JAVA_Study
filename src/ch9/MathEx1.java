package ch9;

import static java.lang.Math.*;

public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 90.7552;
		
		// round() 특징 : 소수점 첫째자리에서 반오림.
		System.out.println("round(val) : " + round(val));
		
		// 소수점 세째자리에서 반올림.
		// 1. 100 을 곱함
		val *= 100;
		System.out.println("val *= 100 : " + val ); //9075.52
		
		// 2. round() 함수 사용
		System.out.println("round(val) : " + round(val)); //9076
		
		// 3. 100.0 으로 나누기
		System.out.println("round(val)/100.0 : " + round(val)/100.0);
		
		// 올림
		System.out.printf("ceil(1.1) : %3.1f%n" , ceil(1.1));
		
		// 버림
		System.out.printf("floor(1.5) : %3.1f%n" , floor(1.5));

		// 
		System.out.printf("rint(1.5) : %3.1f%n" , rint(1.5));
		System.out.printf("rint(1.3) : %3.1f%n" , rint(1.3));
		
		System.out.printf("round(-1.5) : %d%n" , round(-1.5));
		System.out.printf("ceil(-1.5) : %f%n" , ceil(-1.5));
		System.out.printf("floor(-1.5) : %f%n" , floor(-1.5));
	}

}
