package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//1.����ڷκ��� ���� ���� �Է� �޾Ƽ� ����x�� �����Ѵ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("x: ");
		int x = scan.nextInt();

		//2.���࿡ �װ��� ¦����� ¦�� ���̶�� ���ڿ��� ����Ѵ�.
		if(x % 2 == 0) 
		{ //���ǹ�
			System.out.println("¦��");//���ӹ���1
			System.out.println("��");//���ӹ���2
		}		
		else
		{
		System.out.println("Ȧ��");//���ӹ���1
		System.out.println("��");//���ӹ���2
	
		}//if - else (if���� �ɷ����� ���� else���ƴϴ�)
		
		
		
		if(x�� 3�� ����� ���) 
			System.out.println("3�� �����");
		if(x�� 5�� ����� ���)
			System.out.println("5�� �����");
		
		if(x�� 3���� ���� ���)
			System.out.println("3���� �۴�");		
		else(x�� 3���� ���� ���)
			System.out.println("�� �ܴ�");
		
		
		System.out.println("���α׷� ��!");
	}
}
