package ex1.bit;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		//1.A부터 J까지 출력
		char[] nums = new char[10]; // 배열생성
		for(int i=0;i<10;i++) { // 0부터9까지 총 10번반복
			nums[i] = (char)('A'+i); //배열 초기화(A~J)문자넣기
			System.out.printf("%c",nums[i]); // 배열안에 넣은 문자출력
		}System.out.println();
		
		
		//2.J부터 A까지 출력
		for(int i=0;i<10;i++) {
			nums[i] =(char)('J'-i); //J부터 A까지넣기
			System.out.printf("%c",nums[i]); //출력			
		}System.out.println();
		
		int tmp;
		for(int i=0;i<5;i++) {
			tmp = nums[i]; // 값바꾸기
			nums[i] = nums[9-i];
			nums[9-i] = nums[i];//nums[0]와 nums[9]가 맞바꾼상황
			System.out.printf("%c",nums[i]);
			//양쪽값끼리바꾸므로 5번이면 다시A~J순으로출력됨
			
	}
}
}
