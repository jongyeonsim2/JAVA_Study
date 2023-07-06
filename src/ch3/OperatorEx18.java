package ch3;

public class OperatorEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592; //3.142
		double shortPI = Math.round(pi);
		
		System.out.println(shortPI);
		
		double shortPI2 = Math.round(pi*1000)/1000.0;
		System.out.println(shortPI2);
	}

}
