package ch15;

import java.io.*;

/***
 * StringReader, StringWriter 사용 예제
 */

public class StringReaderWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			
			while( (data = input.read()) != -1 ) {
				output.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Input : " + inputData);
		
		// StringBuffer 의 데이터를 문자열로 반환.
		System.out.println("Output : " + output.toString());
		
		// StringBuffer 를 반환후 사용.
		System.out.println("Output(from buffer) : " + output.getBuffer().toString());

	}

}









