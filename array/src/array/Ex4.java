package array;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int score=0; // 점수저장하기위한 변수
		char grade='D'; //학점을 저장하기위한 변수. 공백으로 초기화한다
		
		System.out.println("점수를 입력하셈");
		Scanner scanner = new Scanner(System.in);
		score=scanner.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		if(score>=90) { //score가 90보다 같거나 크면 A학점
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
//	}else {
//		grade='D';
	} System.out.println("네 학점은"+grade+"이야");
}
}
