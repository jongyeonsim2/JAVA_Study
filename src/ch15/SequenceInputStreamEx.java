package ch15;

import java.io.*;
import java.util.*;

/***
 * SequenceInputStream, Enumeration 을 이용하는 예제.
 */

public class SequenceInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] arr1 = {0,1,2};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {6,7,8};
		
		byte[] outSrc = null;
		
		Vector v = new Vector();
		
		// ByteArrayInputStream 객체를 만드는 이유는 read() 를 사용하기 위함임.
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		//v.elements() 의 반환형은 Enumeration 임.
		// SequenceInputStream 의 매개변수로 사용하면 됨.
		SequenceInputStream input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			
			// 각각의 ByteArrayInputStream.read() 를 했어야 하나,
			// 현재는 SequenceInputStream 을 이용해서 단 한번만 read() 함.
			while( (data = input.read()) != -1 ) {
				output.write(data);
			}
			
			outSrc = output.toByteArray();
			
			System.out.println("Input : " + Arrays.toString(arr1));
			System.out.println("Input : " + Arrays.toString(arr2));
			System.out.println("Input : " + Arrays.toString(arr3));
			
			System.out.println("Input : " + Arrays.toString(outSrc));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}






