package ch11;

import java.util.*;

/*
 * 괄호가 열고 닫히는게 맞는지 확인.
 * 수식 데이터에서 여는 괄호만 stack에 저장
 * 수식 데이터에서 닫히는 괄호를 만나면, pop() 을 함. 
 * 
 * ===== 정상 케이스, stack 이 empty 되는 경우 =====
 * 
 * (2+3)*1   push('(')    pop()   => stack 이 empty 가 되면, 괄호의 쌍이 맞는것으로 확인됨. 
 * ((2+3)*1)  push('(') push('(')  pop()    pop()   => stack 이 empty 가 되면, 괄호의 쌍이 맞는것으로 확인됨. 
 * 
 * (2+5-((3-6)+9))
 * 
 * push('(')    push('(')    push('(')    pop()    pop()    pop()   => stack empty 가 됨.
 * 
 * 
 * 
 * ===== 비정상 케이스, stack 이 empty 가 되지 않는 경우 =====
 * 
 * (2+3)*1(   push('(')   pop()   push('(')    => stack 이 empty 가 되지 않음.
 * 
 *  
 */

public class ExpValidCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack st = new Stack();
		String expData = args[0];
		
		for(int i = 0; i < expData.length(); i++) {
			char ch = expData.charAt(i);
			
			// 열리는 괄호면 => stack 에 push()
			if (ch=='(') {
				st.push(ch);
			} else if (ch==')') {  // 닫히는 괄호이면 => stack 에서 pop() 함.
				st.pop();
			}
			
		}
		
		if(st.isEmpty()) {
			System.out.println("괄호가 일치");
		} else {
			System.out.println("괄호가 맞지 않습니다.");
		}
		
		

	}

}
