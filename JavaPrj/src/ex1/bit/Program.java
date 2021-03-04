package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// 1. 이미지파일을 일기위한 파일입력 스트림을 fis로 생성
		FileInputStream fis = new FileInputStream("res/aaa.bmp");
		
		// 이미지 파일의 Signature를 불러온 후 FileSize를 불러온다.
		int b;
		// 2바이트
		b = fis.read();
		b = fis.read();
		
		//fileSize
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		//b1b2b3b4		
		int fileSize = 0; //[b1][b2][b3][b4];
		fileSize = b1;// [][][][b1]; 자체가 32비트
		fileSize = b2;// [][][][b2];
		fileSize = b3;// [][][][b3];
		fileSize = b4;// [][][][b4];
		
		fileSize = (b4 & 0x000000ff) << 8*3 | //[b4][][][]         원래는 오른쪽부터채워지는데,왼쪽으로옮김
				   (b3 & 0x000000ff) << 8*2 | //[b4][b3][][]
				   (b2 & 0x000000ff) << 8*1 | //[b4][b3][b2][]
				   (b1 & 0x000000ff);         //[b4][b3][b2][b1]
					
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));
	
		System.out.printf("file size : %d\n",fileSize);
		fis.close();
	}
}

