package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//1.사용자로부터 정수 값을 입력 받아서 변수x에 저장한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("x: ");
		int x = scan.nextInt();

		//2.만약에 그값이 짝수라면 짝수 값이라는 문자열을 출력한다.
		if(x % 2 == 0) 
		{ //조건문
			System.out.println("짝수");//종속문장1
			System.out.println("값");//종속문장2
		}		
		else
		{
		System.out.println("홀수");//종속문장1
		System.out.println("값");//종속문장2
	
		}//if - else (if에서 걸렸으면 절대 else가아니다)
		
		
		
		if(x가 3의 배수인 경우) 
			System.out.println("3의 배수다");
		if(x가 5의 배수인 경우)
			System.out.println("5의 배수다");
		
		if(x가 3보다 작은 경우)
			System.out.println("3보다 작다");		
		else(x가 3보다 작은 경우)
			System.out.println("그 외다");
		
		
		System.out.println("프로그램 끝!");
	}
}
