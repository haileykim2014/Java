package ex6.ĸ��ȭ.�ڷγ�.copy;

import java.util.Scanner;

public class Ex1 {
	public String solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()) { //���ڿ��� ���ڹ迭�ιٲٰ� x�� �����Ѵ�. charŸ�� �迭�� ��´�.
			if(x>=97&&x<=122) //�ҹ��ڶ��
				answer += (char)(x-32); //�빮�ڷιٲٰ� ����
			else answer += (char)(x+32); //�ҹ��ڷιٲٰ� ����
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
