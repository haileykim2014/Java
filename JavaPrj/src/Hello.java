import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {
		int kor, eng, math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		//���⿡ ������ �Է��ϴ� �ڵ带 �ۼ��Ͻÿ�
	
		FileInputStream fis = new FileInputStream("C:\\Users\\yh\\git\\repository3\\JavaPrj\\data.txt");
		Scanner scan1 = new Scanner(fis);				
		kor = scan1.nextInt();
		eng = scan1.nextInt();
		math = scan1.nextInt();
				
		total = kor + eng + math;
		avg = total / 3.0f;
				
		//System.out.printf("total is %d\n", total);
		
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��                 ���� ���                 ��");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.printf("���� : %d\n",kor);
		System.out.printf("���� : %d\n",eng);
		System.out.printf("���� : %d\n",math);
		
		System.out.printf("���� : %d\n",total);
		System.out.printf("��� : %5.2f\n",avg); 
		System.out.println("������������������������������������������������������������������������������������");

		//�⺻������ �ƴ�����
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("���� ������ �Է��ϼ���:");
//		
//		//String�� �⺻������ �ƴ�����//		String line = scan.next(); //��������� ���
//		System.out.printf("line=%s\n",line);
		
//		line = scan.next(); //���������� ��������� ���
//		System.out.printf("line=%s\n",line); 
//		
//		kor = scan.nextInt(); //�ܾ ����������
//		System.out.printf("line=%d\n",kor);

		
		}
}