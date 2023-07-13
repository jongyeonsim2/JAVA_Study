package ch7;

/*
 * 1. interface 활용 관점 - 다형성, 유지보수성
 * 2. 새로운 class 만들게 되면, class 개수가 늘어남. => 묶어서 관리 하는 manager class
 */

// 구분 분석, HTML, XML 등의 파일 내용을 분석하는 interface
interface Parseable {
	// 추상 메소드
	public abstract void parse(String fineName);
}

/*
 * XMLParser, HTMLParser, CSVParser 별도의 type 였으나,
 * Parseable interface 를 이용해서 통일된 하나의 type을 사용가능해짐.
 * 
 * => ParserManager class 에서 XMLParser, HTMLParser, CSVParser 를 하나로 묶어서
 *    관리할 수 있게 됨. => 함수의 반환 타입 : interface를 적용한 다형성.
 */
class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(fileName + " - XML 구문분석 완료");
	}
	
}

class HTMLParser implements Parseable  {

	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(fileName + " - HTML 구문분석 완료");
	}
	
}


// Parser class 들을 관리하는 Manager 기능의 class 가 필요해짐.
// 다른 팀원들이 Parser class 를 쉽게 사용할 수 있는 interface (API) 의 필요성이 높아짐.
// 재사용성이 높아짐. 가독성이 높아짐. => 개발 생산성이 높아짐.
class ParserManager {
	
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}


public class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("test.xml");
		
		parser = ParserManager.getParser("HTML");
		parser.parse("test.html");
	}

}
