package ex4.struct;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("�տ���","1682");
		Student st2 = new Student("���Ȱ�","1772");
		Student st3 = new Student("�����","1813");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu :list) { //�������ڷ��� �����̸� : ����������
			System.out.println(stu.getName());
			System.out.println(stu.getNo());			
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("��� �˻����ϸ� y, ������ϸ� n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�. �л��̸��Է�");
				String name = scan.next();
				boolean flag = false;
				
				for(Student stu:list) {
					if(stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й���:"+stu.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("�ش��ϴ� �л��� ����.");
				}
				
				
			}
			else if(input.equals("n")) {
				break;
			}
			
 
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		

	}

}