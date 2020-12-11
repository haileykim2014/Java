package array;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int score=0;
		char grade='c', opt='0';
		System.out.println("점수를 입력해주세요");
		Scanner scanner= new Scanner(System.in);
				score=scanner.nextInt();
		
		System.out.printf("너의점수는 %d입니다.",score);
		
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
		System.out.printf("너의학점은%c%c입니다.",grade,opt);
	}
}
