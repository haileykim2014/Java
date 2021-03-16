package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray3 {

	public static void main(String[] args) throws IOException {
		
		int count = 0;
		String[][] rows; 
		//--------------------------------------------------------------
		//���ڵ� ������ �˾� ���� �ڵ�
		{
			FileInputStream fis = new FileInputStream("res/corona.csv");
			Scanner scan = new Scanner(fis);
			
			//while�ݺ��� �ϸ鼭 count++������ �Ѵ�. ������ ���� ����������
			String line;
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				count ++;		
			}			
			
			scan.close();
			fis.close();
			count--;
			System.out.println("�� ���� ����"+count);
		}//�浹����
		//--------------------------------------------------------------
		//���ڵ带 �ε��ϴ� �ڵ�
		{
			rows = new String[count][];
			FileInputStream fis = new FileInputStream("res/corona.csv");
			Scanner scan = new Scanner(fis);

			String line;

			scan.nextLine(); // �����ʿ����.���ٹ�����

			for (int i = 0; i < count; i++) { // ���� �ҷ�����, ������ �迭���ֱ�
				line = scan.nextLine(); // ���ٺҷ�����
				rows[i] = line.split(","); // �ҷ��°� ��ǥ�� ����
			}
			
			scan.close();
			fis.close();
		}		
		//--------------------------------------------------------------
		//���ڵ� ����ϴ� �ڵ�
		for (int j = 0; j < count; j++) { // ��
			for (int i = 0; i < 10; i++) { // ��ä���
				System.out.printf("%s", rows[j][i]);
	
				if (i < 9)
						System.out.printf(",");
			}
			System.out.println();
		}
		//--------------------------------------------------------------	
		//�˻������� ������ ��� �ڵ�
		{
			int total = 0;
				
			for(int i=0;i<count;i++)
			total += Integer.parseInt(rows[i][3]);	//���ڿ��� ������ ����ȯ
			System.out.println(total);
			System.out.println();
		} 		

			
		//--------------------------------------------------------------		
		//�Ϻ� ���� ���� �˻�������� ?
		{	int max = 0;
			int current;
					
			for(int i =0; i<count;i++) {
				current = Integer.parseInt(rows[i][3]);
				if(current > max) 
					max = current;
				}
			System.out.println(max);
			System.out.println();
		}	
	}	
	
}
