package ex3.array.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

	//1.���ڿ� 10�� ¥�� names �迭�� �����Ѵ�.
		String[] names = new String[10];
		
	//2.���Ͽ��� name���� �о�ͼ� names �迭�� �����Ѵ�.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		int i =0;
		while(fscan.hasNextLine()) { //���ε��� �ݺ�
			String name = fscan.nextLine(); //������ �о��ٴ� ���� �˷���
			names[i++] = name;
			System.out.printf("%s, ",names[i-1]);
			
			if(fscan.hasNextLine()==false) // �����̸� �ߴ�
				System.out.printf("%s",names[i-1]); //��������
		}
				
	//3.names �迭�� �̸��� ����ó�� �ֿܼ� ����Ѵ�.
	//ȫ�浿,��浿,��ȣ��,���缮
				
		fscan.close();
		fis.close();

		System.out.println("����Ϸ�");	
	}
}
