package ex3.array;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {

		//�ݺ����� ����ϴ� �Ϳ� ������ �ΰ� ����
		
		//1. ���� 10���� �����ϱ� ���� ���ڹ迭 chs�� ����ÿ�.
		char[] chs = new char[10];

		for (int i = 0; i < 10; i++)
			chs[i] = 'A';

		// 3. chs �迭�� ����� �� ��� ���
		for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);
		System.out.println();

		for (int i = 0; i < 10; i++) //�ǵ���������
			chs[i] = (char) ('J' - i);// �ε�����������

		// A�� Z�� �ڸ��� �ٲ���
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
