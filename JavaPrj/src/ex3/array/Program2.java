package ex3.array;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {

		//�ݺ����� ����ϴ� �Ϳ� ������ �ΰ� ����
		
		//1. ���� 10���� �����ϱ� ���� ���ڹ迭 chs�� ����ÿ�.
		char[] chs = new char[10];
		
		//2. chs �迭�� ���� 'A'
		for(int i=0;i<10;i++)
			chs[i]='A';		
//		chs[0] = A;
//		chs[1] = A;
//		chs[2] = A;
//		chs[3] = A;
//		chs[4] = A;				
		
		//3. chs �迭�� ����� ������ ��� ����Ͻÿ�. ��, ����� ����ó�� ����Ͻÿ�.
		for(int i=0;i<10;i++)
		System.out.printf("%c ",chs[i]);
		
	}
}
