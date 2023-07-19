package ch11;

import java.util.*;

/*
 * stack, queue 사용 예제
 * 
 * - stack : LIFO( Last In First Out )
 * - queue : FIFO( First In First Out )
 */


public class StackQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Stack, 저장 : push(), 가져오기 : pop()
		Stack st = new Stack();
		
		// Queue, 저장 : offer(), 가져오기 : poll()
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		
		System.out.println(" Stack ");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		
		System.out.println(" Queue ");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

}
