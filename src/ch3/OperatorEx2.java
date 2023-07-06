package ch3;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		
		j=i++;//수식의 일부로 사용. 후위형. 후증가.
		System.out.println("후위형  i = " + i + " j = " + j);
		
		i=5;
		j=0;
		
		j=++i;//수식의 일부로 사용. 전위형. 선증가.
		System.out.println("전위형  i = " + i + " j = " + j);
	}

}
