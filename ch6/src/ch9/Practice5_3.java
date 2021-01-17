package ch9;

import java.util.*;

public class Practice4_14 {
	public static void main(String[] args) {
		//1~10사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		//화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요");
			input = s.nextInt();
			
			if(input<answer) {
				System.out.println("더 큰수로 다시 시도");
			}else if(input>answer) {
				System.out.println("더 작은 값으로 다시 시도");
			}else {
				System.out.println("정답입니다");
				System.out.print("시도횟수는"+count+"번입니다.");
				
			}
			
		}while(true);
		
	}
		
}



	



