package array;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int score=0;
		char grade='c', opt='0';
		System.out.println("������ �Է����ּ���");
		Scanner scanner= new Scanner(System.in);
				score=scanner.nextInt();
		
		System.out.printf("���������� %d�Դϴ�.",score);
		
		if(score>=90) {
			grade='A';
			if(score>=98) {
				opt='+';
			} else if(score<94) {
				opt='-';
			}}
		else if(score>=88) {
				grade='B';
				if(score>=88) {
					opt='+';
			}else if(score<84) {
				opt='-';
			}
	    } 
		System.out.printf("����������%c%c�Դϴ�.",grade,opt);
	}
}
