package array;

import java.util.*;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer=(int)(Math.random()*100)+1; //1~100������ ������ ���� ����
		System.out.println("Answer="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100������ ������ �Է��Ͻÿ�");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("�� �������ڷ� �õ��Ͻÿ�");
			} else if(input <answer) {
				System.out.println("�� ū���� �ٽýõ��Ͻÿ�");
						}
		}	while(input!=answer);
		System.out.println("�����Դϴ�");
		
		
	}

}
