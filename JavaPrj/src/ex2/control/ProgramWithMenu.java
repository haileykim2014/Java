package ex2.control;

import java.util.Scanner;

public class ProgramWithMenu {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in); // �ݺ��� ���Ե� �ʿ����
	      int kor, eng;
	      int math;
	      int total;
	      float avg;

	      kor = 0;
	      eng = 0;
	      math = 0;
	      
	      boolean more = true; //���������ιٲ۰�
	      
	      while(more)
	      {
	    	  int menu;
	      // ���⿡ ������ �Է��ϴ� �ڵ带 �ۼ��Ͻÿ�.
		      
		      System.out.println("��������������������������������������������");
		      System.out.println("��      �����θ޴�      ��");
		      System.out.println("��������������������������������������������");
		      
		      System.out.println("1.�����Է�");
		      System.out.println("2.�������");
		      System.out.println("3.����");
		      System.out.print(">");
		      menu = Integer.parseInt(scan.nextLine());
		      
		      if(menu==1) {
			      System.out.println("��������������������������������������������");
			      System.out.println("��      ������ �Է�      ��");
			      System.out.println("��������������������������������������������");


			      System.out.printf("���� : ");
			      kor = Integer.parseInt(scan.nextLine());
			      System.out.printf("���� : ");
			      eng = Integer.parseInt(scan.nextLine());
			      System.out.printf("���� : ");
			      math = Integer.parseInt(scan.nextLine());
		      }
		      else if(menu==2) //�ι��� �� ���ϴ°Ը³� ? 1���ϰ�� ���̻� 2�����ʿ����.->else if
		      {
			      total = kor + eng + math;
			      avg = total / 3.0f;
		
			      System.out.println("��������������������������������������������");
			      System.out.println("��      ������ ���      ��");
			      System.out.println("��������������������������������������������");
		
			      System.out.printf("���� : %d\n", kor);
			      System.out.printf("���� : %d\n", eng);
			      System.out.printf("���� : %d\n", math);
		
			      System.out.printf("���� : %2d\n", total);
			      System.out.printf("��� : %26.2f\n", avg);
		
		      }
		      else if(menu==3) {
			      more = false;
		      }
		    }
	      System.out.println("Bye~");
	}
}
