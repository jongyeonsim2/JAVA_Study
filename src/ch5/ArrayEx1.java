package ch5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
		
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
		
		int tmp = score[k+2] + score[4];
		
		System.out.println(tmp);
		
		//System.out.println(score[10]);
				
		int arrLenth = score.length;
		
		System.out.println(arrLenth);
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
