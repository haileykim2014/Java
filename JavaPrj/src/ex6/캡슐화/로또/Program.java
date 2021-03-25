package ex6.캡슐화.로또;

import java.util.Random;

public class Program {

	// 로또를 출력하자
	private static void print(Lotto lotto) {

		//밖에있으니까 캡슐깨지않고 함수를통해얻어야함
		for (int i = 0; i < lotto.getSize(lotto); i++) {
			System.out.printf("%d", Lotto.getNum(lotto, i));
			if (i < 5)
				System.out.printf(",");
		}
		System.out.println();
	}

	public static void main(String[] args) {// 어플리케이션역할
		//lotto객체를 생성
		Lotto lotto = new Lotto();

		//lotto.nums = new int[6];
		Lotto.init(lotto);			
		
		//int[] lotto;

		lotto = Lotto.gen(lotto);//Lotto의 인스턴스(객체,실체)를 만드는 함수

		print(lotto);
		
		Lotto.sort(lotto);

		print(lotto);
		
	}// main메소드 끝

}
