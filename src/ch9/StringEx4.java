package ch9;

import java.util.StringJoiner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");// 구분자, prefix, suffix
		
		// StringJoiner 의 문자열 더하기
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}

}
