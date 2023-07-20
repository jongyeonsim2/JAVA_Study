package ch11;

import java.io.*;
import java.util.*;

/*
 * Properties 에 저장된 정보를 파일로 저장해서 관리하는 예제
 */

public class PropertiesEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		//key, value 를 저장
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "100");
		
		//설정정볼를 file로 저장.( txt, xml )
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



