import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는%d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			}else if(score <94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score>=88) {
				opt ='+';
			}else if(score<84) {
				opt = '-';
			}
		}else if(score >= 70) {
			grade = 'C';
			if(score>=78) {
				opt = '+';
			}else if(score <74) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		
		System.out.println("당신의 학점은"+grade+opt+"입니다");
	}

}
