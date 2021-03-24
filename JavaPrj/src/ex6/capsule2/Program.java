package ex6.capsule2;

import java.util.Random;

public class Program {

	// 로또를 출력하자
	private static void print(Lotto lotto) {
		for (int i = 0; i < lotto.nums.length; i++) {
			System.out.printf("%d", lotto.nums[i]);
			if (i < 5)
				System.out.printf(",");
		}
		System.out.println();
	}
	
	private static Lotto gen() {
		Lotto lotto = new Lotto(); //어떤타입인지 인지
		lotto.nums = new int[6];
		
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			lotto.nums[i] = rand.nextInt(45) + 1;
		}
		//자판기
		return lotto;
	}

	public static void main(String[] args) {//어플리케이션역할
		
		Lotto lotto;

		lotto = gen();
		
		print(lotto); 

	}//main메소드 끝

}
