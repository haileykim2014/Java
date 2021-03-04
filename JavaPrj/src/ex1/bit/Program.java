package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// 1. �̹��������� �ϱ����� �����Է� ��Ʈ���� fis�� ����
		FileInputStream fis = new FileInputStream("res/aaa.bmp");
		
		// �̹��� ������ Signature�� �ҷ��� �� FileSize�� �ҷ��´�.
		int b;
		// 2����Ʈ
		b = fis.read();
		b = fis.read();
		
		//fileSize
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		//b1b2b3b4		
		int fileSize = 0; //[b1][b2][b3][b4];
		fileSize = b1;// [][][][b1]; ��ü�� 32��Ʈ
		fileSize = b2;// [][][][b2];
		fileSize = b3;// [][][][b3];
		fileSize = b4;// [][][][b4];
		
		fileSize = (b4 & 0x000000ff) << 8*3 | //[b4][][][]         ������ �����ʺ���ä�����µ�,�������οű�
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

