package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // �ݺ��� ���Ե� �ʿ����
		int kor, eng;
		int math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;

		boolean more = true; // ���������ιٲ۰�

		EXIT: while (more) {
			int menu;
			// ���⿡ ������ �Է��ϴ� �ڵ带 �ۼ��Ͻÿ�.

			System.out.println("��������������������������������������������");
			System.out.println("��      �����θ޴�       ��");
			System.out.println("��������������������������������������������");

			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print(">");
			menu = Integer.parseInt(scan.nextLine());

			switch (menu) {
			case 1:
				System.out.println("��������������������������������������������");
				System.out.println("��      ������ �Է�      ��");
				System.out.println("��������������������������������������������");

				do {
					System.out.printf("���� : ");
					kor = Integer.parseInt(scan.nextLine());
					
					if(kor < 0 || 100 < kor)
						System.out.println("�Է¹��� 0~100 ���� �Է� �� ���ֽ��ϴ�.");
					
				} while (kor < 0 || 100 < kor);

				System.out.printf("���� : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("���� : ");
				math = Integer.parseInt(scan.nextLine());
				break;

			case 2:
				total = kor + eng + math;
				avg = total / 3.0f;
				System.out.println("��������������������������������������������");
				System.out.println("��      ������ ���      ��");
				System.out.println("��������������������������������������������");

				for (int i = 0; i < 3; i++) {

					System.out.printf("���� : %d\n", kor);
					System.out.printf("���� : %d\n", eng);
					System.out.printf("���� : %d\n", math);

					System.out.printf("���� : %2d\n", total);
					System.out.printf("��� : %26.2f\n", avg);

					System.out.println("---------------------------------");

				}
				break;

			case 3:
//				more = false;
				break EXIT;
			}
		}
		System.out.println("Bye~");
	}
}
