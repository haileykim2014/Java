package ch11;

import java.util.*;

import sec07.exam01.*;

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue인터페이스의 구현체
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=Stack=");
		while(!st.empty()) { //비어있는지확인
			System.out.println(st.pop()); //스택에서 요소하나를 꺼내기
		}
		System.out.println("Queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());//큐에서 요소하는 꺼내기
		}
	}

}
