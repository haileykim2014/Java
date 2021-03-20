package ex4.struct;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("손오공","1682");
		Student st2 = new Student("저팔계","1772");
		Student st3 = new Student("사오정","1813");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu :list) { //변수의자료형 변수이름 : 참조형변수
			System.out.println(stu.getName());
			System.out.println(stu.getNo());			
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("계속 검색원하면 y, 종료원하면 n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다. 학생이름입력");
				String name = scan.next();
				boolean flag = false;
				
				for(Student stu:list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은:"+stu.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생이 없음.");
				}
				
				
			}
			else if(input.equals("n")) {
				break;
			}
			
 
		}
		System.out.println("프로그램이 종료되었습니다.");
		

	}

}