package ex3.array;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {

		//반복문을 사용하는 것에 초점을 두고 연습
		
		//1. 문자 10개를 저장하기 위한 문자배열 chs를 만드시오.
		char[] chs = new char[10];

		for (int i = 0; i < 10; i++)
			chs[i] = 'A';

		// 3. chs 배열에 담겨진 값 모두 출력
		for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);
		System.out.println();

		for (int i = 0; i < 10; i++) //건들이지말것
			chs[i] = (char) ('J' - i);// 인덱스내림차순

		// A와 Z의 자리를 바꾸자
		//[J I H G F E D C B A ]
		//chs[0] <-> chs[9]
		//1. chs
		
		for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);

		System.out.println();

		char temp;
		
		temp = chs[0];
		chs[0] = chs[9];
		chs[9] = temp;
		
			for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);
			System.out.println();

		temp = chs[1];
		chs[1] = chs[8];
		chs[8] = temp;
		

		char[] tmp = new char[10];
		for (int i = 0; i < 5; i++) {			
			temp = chs[i];
			chs[i] = chs[9-i];
			chs[9-i] = temp;
			}			
		for (int i = 0; i < 10; i++)
		System.out.printf("%c ", chs[i]);
				
	}
}
