package ch11;

import java.util.*;

/*
 * Stack 구현 : LIFO( Last In First Out )
 * 
 * 저장 메소드 : push()
 * 가져오기 메소드 : pop()
 * 탐색 : search()
 * 비우기 : empty()
 * 
 */















public class MyStack extends Vector {

	public Object push(Object item) {
		addElement(item); //vector method
		return item;
	}
	
	public Object pop() {
		Object obj = peek();
		
		// vector 가져온 데이터는 vector 에서 삭제를 함. => LIFO 동작
		removeElementAt(size() - 1);//  LIFO 동작 
		
		return obj;
	}
	
	// LIFO 동작이 되게끔 해야 함.
	public Object peek() {
		int len = size();// 데이터 갯수
		
		// 더 이상 가져올 데이터가 없는 경우, Exception 발생
		if (len ==0 )
			throw new EmptyStackException();
		
		return elementAt(len - 1); // 마지막 요소를 추출 => LIFO 동작
		
	}
	
	public boolean empty() {
		return size() == 0;  // vector 에 데이터가 없다면, true.
							// 마치 stack 이 비어있는 것처럼 동작.
	}
	
	
	public int search(Object obj) {
		
		// stack 라고 생각하면,
		// LIFO 로 동작을 하게 되므로,
		// vector 의 끝에서부터 탐색을 시작해야 함.
		int i = lastIndexOf(obj);// 참고로, indexOf() 는 vector에서 앞에서 탐색
		
		// 데이터를 찾은 경우
		if (i >= 0) {
			// stack : 마지막이 첫 번쨰
			// vector : 첫 번째가 첫번째
			
			return size() - i;// LIFO 처럼 동작
		}
		
		return -1; //해당하는 데이터를 탐색하지 못한 경우.
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
