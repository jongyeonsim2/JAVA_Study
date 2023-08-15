package ch15;

import java.util.Arrays;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/***
 * ByteArrayInputStream, ByteArrayOutputStream 사용 예제
 * 
 * - 메모리가 대상
 * - 바이트 단위로 처리되는 스트림.
 * - read(), write() 메소드 를 부모가 제공.
 * - read() 함수를 사용해서 읽는 단위를 2바이트 이상으로 처리되도록 함.
 * - write() 함수를 사용해서 읽는 단위를 2바이트 이상으로 처리되도록 함.
 */

public class IOEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; // inputStream 의 대상, read()
		byte[] outSrc = null; // OnputStream 의 대상, write()
		
		byte[] temp = new byte[10]; // 읽기, 쓰기 단위 10 바이트 단위임.
									// 1 바이트 의 10배임으로, 성능이 대폭적으로 향상됨.
		
		// 데이터를 운반하는데 사용되는 통로를 생성
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream(); // 일단 출력 후, 배열형태로 변환.
		
		// read(), write() 시 성능 향상을 위해서 처리 단위를 변경해서 작업.
		input.read(temp, 0, temp.length);
		output.write(temp, 5, 5);
		
		outSrc = output.toByteArray();
		
		System.out.println("Input : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Onput : " + Arrays.toString(outSrc));
		
	}

}





