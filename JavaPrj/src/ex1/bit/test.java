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
			nums[i] =(char)('J'-i);
			System.out.printf("%c",nums[i]);			
		}System.out.println();
		
		int tmp;
		for(int i=0;i<10;i++) {
			tmp = nums[i];
			nums[i] = nums[9-i];
			nums[9-i] = nums[i];
			System.out.printf("%c",nums[i]);
	}

}
}
