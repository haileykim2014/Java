package ex6.ĸ��ȭ.�ζ�.��ü����;

public class LottoConsole {
	
	public static void print(Lotto lotto) {
		//�ۿ������ϱ� ĸ�������ʰ� �Լ������ؾ�����
		for (int i = 0; i < lotto.getSize(); i++) {
			System.out.printf("%d", lotto.getNum(i));
			if (i < 5)
				System.out.printf(",");
		}
		System.out.println();
	}
}
