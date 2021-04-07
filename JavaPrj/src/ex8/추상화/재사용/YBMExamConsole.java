package ex8.추상화.재사용;

import java.util.Scanner;

public class YBMExamConsole extends ExamConsole{
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
		
		YBMExam exam = (YBMExam)getExam();//부모형은 자식형으로바로안
		exam.setToeic(toeic);
		exam.setToeic(aa);
		
	}
}
