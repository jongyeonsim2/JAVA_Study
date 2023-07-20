package ch11;

import java.util.*;

public class QueueEx1 {

	// Queue 는 인터페이스임. 인터페이스를 구현한 클래스 중에서 하나를 선택해서 사용하면 됨.
	static Queue q = new LinkedList();
	
	// 입력 명령어를 이력으로 관리할 사이즈
	static final int MAX_SIZE = 5;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프로그램 종료 명령어를 입력받을 때까지 계속 실행.
		while(true) {
			// 입력 대기 모드 출력
			System.out.println(">>");
			
			try {
				// 사용자로부터 입력받은 명령어를 처리함.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				
				
				// 1. 그냥 엔터를 입력하는 겨우
				if("".equals(input)) continue;
				
				// 2. 프로그램 종료
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					// 3. 대소문자 구분없이 명령에 대한 설명을 출력
					System.out.println("help - 도움말 출력  ");
					System.out.println("Q 또는 q - 프로그램 종료");
					System.out.println("history - 입력했던 명령어 출력");
				} else if(input.equalsIgnoreCase("history")) {
					// 4. 입력된 명령어의 이력을 출력
					save(input);
					
					// Iterator 를 사용하기 위해, Queue 를 List 로 변환
					LinkedList list = (LinkedList)q;
					
					// Iterator 객체를 취득
					ListIterator lit = list.listIterator();
					
					// while 을 이용한 요소 출력
					while(lit.hasNext())
						System.out.println(lit.next());
				} else {
					// 5. 입력된 명령어를 queue에 저장 => history 로 관리
					save(input);
					System.out.println(input);
				}

			} catch (Exception e) {
				System.out.println(" 에러 발생!! ");
			}
			
		}
		
		
		
		
		
		
		
		
	}

	
	// 입력 명령어의 이력을 관리. => Queue
	public static void save(String input) {
		// 입력된 명령어를 queue에 저장
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		// 최대 관리 수량을 넘어면, 가장 과거의 명령어를 삭제
		if(q.size() > MAX_SIZE)
			q.remove();
	}
}







