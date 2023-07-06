package ch2;

public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin = -32768;
		short sMax = 32767;
		
		// 최대값 + 1 => 최소값 => -32768
		System.out.println("sMax + 1 = " + (short)(sMax+1));
		
		// 최소값 - 1 => 최대값 => 32767
		System.out.println("sMin - 1 = " + (short)(sMin-1));
		
		
		//         0.12345679 => float의 정밀도는 7
		//                    => 7자리의 10진수를 오차없이 저장할 수 있음.
		float var1=0.1234567890123456789f; //0.12345679
		//          0.12345678901234568 => double의 정밀도는 15
		double var2=0.1234567890123456789; //0.12345678901234568
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
	}

}
