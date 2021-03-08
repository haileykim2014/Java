package ex2.control;

import java.util.Scanner;

public class ProgramWithMenu {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in); // 반복에 포함될 필요없음
	      int kor, eng;
	      int math;
	      int total;
	      float avg;

	      kor = 0;
	      eng = 0;
	      math = 0;
	      
	      boolean more = true; //인위적으로바꾼것
	      
	      while(more)
	      {
	    	  int menu;
	      // 여기에 성적을 입력하는 코드를 작성하시오.
		      
		      System.out.println("┌────────────────────┐");
		      System.out.println("│      　메인메뉴      │");
		      System.out.println("└────────────────────┘");
		      
		      System.out.println("1.성적입력");
		      System.out.println("2.성적출력");
		      System.out.println("3.종료");
		      System.out.print(">");
		      menu = Integer.parseInt(scan.nextLine());
		      
		      if(menu==1) {
			      System.out.println("┌────────────────────┐");
			      System.out.println("│      　성적 입력      │");
			      System.out.println("└────────────────────┘");


			      System.out.printf("국어 : ");
			      kor = Integer.parseInt(scan.nextLine());
			      System.out.printf("영어 : ");
			      eng = Integer.parseInt(scan.nextLine());
			      System.out.printf("수학 : ");
			      math = Integer.parseInt(scan.nextLine());
		      }
		      else if(menu==2) //두번을 다 비교하는게맞나 ? 1번일경우 더이상 2를할필요없다.->else if
		      {
			      total = kor + eng + math;
			      avg = total / 3.0f;
		
			      System.out.println("┌────────────────────┐");
			      System.out.println("│      　성적 출력      │");
			      System.out.println("└────────────────────┘");
		
			      System.out.printf("국어 : %d\n", kor);
			      System.out.printf("영어 : %d\n", eng);
			      System.out.printf("수학 : %d\n", math);
		
			      System.out.printf("총점 : %2d\n", total);
			      System.out.printf("평균 : %26.2f\n", avg);
		
		      }
		      else if(menu==3) {
			      more = false;
		      }
		    }
	      System.out.println("Bye~");
	}
}
