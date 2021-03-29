package ex6.캡슐화.로또.객체지향;

public class LottoConsole {
	
	public static void print(Lotto lotto) {
		//밖에있으니까 캡슐깨지않고 함수를통해얻어야함
		for (int i = 0; i < lotto.getSize(); i++) {
			System.out.printf("%d", lotto.getNum(i));
			if (i < 5)
				System.out.printf(",");
		}
		System.out.println();
	}
}
