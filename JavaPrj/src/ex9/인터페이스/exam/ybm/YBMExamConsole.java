package ex9.�������̽�.exam.ybm;

import java.util.Scanner;

import ex9.�������̽�.exam.Banner;
import ex9.�������̽�.exam.ExamConsole;

public class YBMExamConsole extends ExamConsole implements Banner{
	@Override
	protected void onPrint() {
		YBMExam exam = (YBMExam)getExam();
		System.out.printf("Toeic:%d\n",exam.getToeic());
		System.out.printf("aa::%d\n",exam.getAa());
	}

	@Override
	public void input() {
		super.input(); //���������� �ް�
		
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

	@Override
	public void printStart() {
				
		System.out.println("-----------------------------");
		System.out.println("        YBM ���� ���          ");
		System.out.println("-----------------------------");		
	}

	@Override
	public void printEnd() {
		System.out.println("-----------------------------");
		
	}
}
