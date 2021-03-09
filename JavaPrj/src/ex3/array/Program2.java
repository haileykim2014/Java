package ex3.array;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {

		//반복문을 사용하는 것에 초점을 두고 연습
		
		//1. 문자 10개를 저장하기 위한 문자배열 chs를 만드시오.
		char[] chs = new char[10];
		
		//2. chs 배열에 문자 'A'
		for(int i=0;i<10;i++)
			chs[i]='A';		
//		chs[0] = A;
//		chs[1] = A;
//		chs[2] = A;
//		chs[3] = A;
//		chs[4] = A;				
		
		//3. chs 배열에 담겨진 값들을 모두 출력하시오. 단, 모양은 다음처럼 출력하시오.
		for(int i=0;i<10;i++)
		System.out.printf("%c ",chs[i]);
		
	}
}
