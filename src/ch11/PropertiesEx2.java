package ch11;

import java.io.*;
import java.util.*;

/*
 * file 에서 정보를 읽어서 properties 객체를 생성해서 사용하는 예제.
 */

public class PropertiesEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 파일이 있는지 확인
		if(args.length != 1) {
			System.out.println("파일을 확인해주세요.");
			System.exit(0);
		}
		
		// 파일의 설정 정보를 기반으로 Properties 를 설정.
		Properties prop = new Properties();
		
		String inputFile = args[0];
		
		try {
			// 정상적으로 파일에서 읽은 데이터로 Properties 를 초기화 함.
			prop.load(new FileInputStream(inputFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		// Properties 에서 key 에 해당하는 vlaue 를 참조.
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		
		// 최대값, 최소값, 합계, 평균 계산
		int max = 0;
		int min = 0;
		int sum = 0;
		
		// 출력
		for (int i=0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			
			if (i==0) max = min = intValue;
			
			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}
			
			sum += intValue;
		}
		
		System.out.println("이름 : " + name );
		System.out.println("최대값 : " + max );
		System.out.println("최소값 : " + min );
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + (sum*100.0/data.length)/100);
	}
	
}
