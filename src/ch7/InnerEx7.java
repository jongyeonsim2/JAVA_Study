package ch7;

//windows application 개발시 사용하는 package.
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

/*
 * 익명 클래스 작성 - interface 를 활용하는 예제
 */

public class InnerEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 윈도우 화면의 버튼 객체 생성
		Button b = new Button("Start");
		// 버튼이 눌러졌는지를 확인 (evnet 감지)  =>   눌려졌으면 어떤 기능을 수행함.   => EventHandler 를 구현.
		/*
		 * 1. event 감지 => Listener
		 * 2. 기능 동작 => EvnetHandler
		 */
		
		// event 감지를 위해서 Button 객체에 Listener 를 추가
		b.addActionListener((ActionListener) new EventHandler(b, null, null, null));
		
		/*
		 * 익명 클래스 기준으로 코드를 확인 => 7-38 코드와 같이 확인해야 함.
		 * 
		 * - 언제 버튼이 click 될지 알 수 없음.
		 *   그래서, 미리 EventHandler 객체를 생성하는 것이 아니라,
		 *   버튼이 click 이 되었을 때, 이때 한 번만 객체를 생성해서 사용함.
		 *   
		 * - 익명클래스 => 7-38 코드
		 * - 익명클래스의 이해를 돕기 위해서 => 7-37 코드
		 * - 이런 event와 관련된 익명 클래스는 android 에서 정말 많이 사용됨.
		 *   또는 java windows application 에서 많이 사용됨.
		 */
		
	}
	
	// EvnetHandler 구현
	class EvnetHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// click event 발생시, 수행한 기능을 구현
			System.out.println("ActionEvent occurred!");
		}
		
	}
}
