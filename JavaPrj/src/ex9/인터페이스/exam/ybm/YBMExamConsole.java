package ex9.인터페이스.exam.ybm;

import java.util.Scanner;

import ex9.인터페이스.exam.Banner;
import ex9.인터페이스.exam.ExamConsole;

public class YBMExamConsole extends ExamConsole/* implements Banner*/{
	private int a ;
	
	public YBMExamConsole() {
//		class XXX implements Banner{
//
//			@Override
//			public void print() {
//				a = 3;
//				System.out.println("-----------------------------");
//				System.out.println("        YBM 성적 출력          ");
//				System.out.println("-----------------------------");		
//			}
//
//			@Override
//			public void printEnd() {
//				System.out.println("-----------------------------");
//				
//			}
//			}
		Banner banner = new Banner() {//인터페이스가 코드를구현하는작업을하면서 new
			//무명클래스의 클래스정의,
			@Override
			public void print() {
				System.out.println("-----------------------------");
				System.out.println("        YBM 성적 출력          ");
				System.out.println("-----------------------------");
				
			}

			@Override
			public void printEnd() {
				System.out.println("-----------------------------");				
			}			
		};
		setBanner(banner);//무명클래스의 객체
	}
	
	@Override
	protected void onPrint() {
		YBMExam exam = (YBMExam)getExam();
		System.out.printf("Toeic:%d\n",exam.getToeic());
		System.out.printf("aa::%d\n",exam.getAa());
	}

	@Override
	public void input() {
		super.input(); //국영수먼저 받고
		
		Scanner scan = new Scanner(System.in);
		
		int toeic;
		int aa;
		
		System.out.print("toeic:");
		toeic = Integer.parseInt(scan.nextLine());
		System.out.print("aa:");
		aa = Integer.parseInt(scan.nextLine());
		
		YBMExam exam = (YBMExam)getExam();
		exam.setToeic(toeic);
		exam.setToeic(aa);
		
	}
	//나는 Banner의 기능을 구현하려 하였으나
	//현실은 ExamConsoled의 print를 재정의 해버리고 말았다.
	//nested class	

}
