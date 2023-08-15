package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/***
 * ByteArrayInputStream, ByteArrayOutputStream 사용 예제
 * 
 * - 메모리가 대상
 * - 바이트 단위로 처리되는 스트림.
 * - read(), write() 메소드 를 부모가 제공.
 */

public class IOEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; // inputStream 의 대상, read()
		byte[] outSrc = null; // OnputStream 의 대상, write()
		
		// 데이터를 운반하는데 사용되는 통로를 생성
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream(); // 일단 출력 후, 배열형태로 변환.
		
		// 읽을 데이터 체크
		int data = 0;
		
		while( ( data = input.read() ) != -1 ) {
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input :  " + Arrays.toString(inSrc));
		System.out.println("Onput :  " + Arrays.toString(outSrc));
		
	}

}
