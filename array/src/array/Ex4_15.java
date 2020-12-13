package array;

import java.util.*;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer=(int)(Math.random()*100)+1; //1~100사이의 임의의 수를 저장
		System.out.println("Answer="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하시오");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은숫자로 시도하시오");
			} else if(input <answer) {
				System.out.println("더 큰수로 다시시도하시오");
						}
		}	while(input!=answer);
		System.out.println("정답입니다");
		
		
	}

}
