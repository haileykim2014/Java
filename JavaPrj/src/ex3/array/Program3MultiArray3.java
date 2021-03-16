package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
				count++;		
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
			/*
			 * 0��°�� : {"a", "b", "c"}
			 * 1��°�� : {"d", "e", "f"}
			 * 
			 * */
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
		} 
		
		//--------------------------------------------------------------	
		//�Ϻ� ���� ���� �˻����� ���� ? 
		{	
			int max = 0;
			int current;
					
			for(int i =0; i<count;i++) {
				current = Integer.parseInt(rows[i][3]);
				if(current > max) 
					max = current;
				}
			System.out.println(max);
			System.out.println();
		
		
		//�˻�������� ���� ���Ҵ� ��¥�� ?
		
			String date ="";
			int idx = 0;

			for(int i=0;i<count;i++) {
				if(rows[i][3].equals(String.valueOf(max))) //�����ݷ�����
				idx = i;
				}
			date = rows[idx][0];
			System.out.println(date);
		}
		//Ȯ���� ���� �þ ���ڿ� ���� ����Ͻÿ�.
		{
			String date = "";
			int diff = 0;
			
			int old = Integer.parseInt(rows[0][1]); //����Ȯ���ڼ�
			int current = 0; //����Ȯ���� ��
			int index = 0;			
			
			for(int i=1;i<count;i++) {
				current = Integer.parseInt(rows[i][1]);
				
				if(old != current) {
					
					diff = current - old;
					date = rows[i][0];
			
					old = current;
					
					//�� �� �Ϸ� ����ϱ�
					date = date.substring(0,4)+"��"+
							date.substring(5,7)+"��"+
							date.substring(8,10)+"��";
					System.out.printf("%d : %s, %d\n",index+++1,date,diff);
					}			
			}
			
		}
		
		
		
		
}
	}
