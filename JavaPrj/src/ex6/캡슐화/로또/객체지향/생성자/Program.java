package ex6.캡슐화.로또.객체지향.생성자;

import java.util.Random;

public class Program {
	


	public static void main(String[] args) {// 어플리케이션역할
		//lotto객체를 생성.기존gen()함수에서 분리함 : gen()함수는 숫자만생성하도록
		Lotto lotto = new Lotto();
		lotto.setSize(6);

		//lotto.nums = new int[6];
//		Lotto.init(lotto);
		lotto.init();
		
		//int[] lotto;

		//lotto = Lotto.gen(lotto);//Lotto의 인스턴스(객체,실체)를 만드는 함수
		lotto.gen();
		
		LottoConsole.print(lotto);
		//lotto.print();
		
		//Lotto.sort(lotto);
		lotto.sort();
		
		LottoConsole.print(lotto);
		//lotto.print();

		
	}// main메소드 끝

}
