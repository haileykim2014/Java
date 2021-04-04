package ex6.캡슐화.코로나.copy;

import java.util.Scanner;

public class Ex1 {
	public String solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()) { //문자열을 문자배열로바꾸고 x에 대입한다. char타입 배열에 담는다.
			if(x>=97&&x<=122) //소문자라면
				answer += (char)(x-32); //대문자로바꾸고 누적
			else answer += (char)(x+32); //소문자로바꾸고 누적
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex1 t = new Ex1();
		Scanner kb = new Scanner(System.in);
				String str = kb.next();
				System.out.println(t.solution(str));
		
			}		

	}
