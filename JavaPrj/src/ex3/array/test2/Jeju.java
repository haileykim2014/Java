package ex3.array.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Jeju {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/corona.csv"); //������ġ����
		Scanner scan = new Scanner(fis); //���Ϻҷ�����
		String line = scan.nextLine(); // 1��ҷ��°�

		int total = 0;

		// 2020-10-01,59,0,28,0,0,58,8,230,2020-12-14 

		while (scan.hasNextLine()) {// �������о�ð��־�?
			line = scan.nextLine();
			String[] cols = line.split(",");		// [2020-10-01,59,0,28,0,0,58,..]
			total += Integer.parseInt(cols[3]);
		}		
		System.out.println(total);

		scan.close();
		fis.close();
		System.out.printf("10�� 1�Ϻ��� 12��14�ϱ��� ����Ȯ���ڼ�:%d",total);
	}

}
//10�� 1�Ϻ��� 12��14�ϱ����� �����˻������ڼ�
//���� �˻������
//ù��°���а�
