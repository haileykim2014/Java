package ex6.ĸ��ȭ.�ζ�;

import java.util.Random;

public class Program {

	// �ζǸ� �������
	private static void print(Lotto lotto) {

		//�ۿ������ϱ� ĸ�������ʰ� �Լ������ؾ�����
		for (int i = 0; i < lotto.getSize(lotto); i++) {
			System.out.printf("%d", Lotto.getNum(lotto, i));
			if (i < 5)
				System.out.printf(",");
		}
		System.out.println();
	}

	public static void main(String[] args) {// ���ø����̼ǿ���
		//lotto��ü�� ����
		Lotto lotto = new Lotto();

		//lotto.nums = new int[6];
		Lotto.init(lotto);			
		
		//int[] lotto;

		lotto = Lotto.gen(lotto);//Lotto�� �ν��Ͻ�(��ü,��ü)�� ����� �Լ�

		print(lotto);
		
		Lotto.sort(lotto);

		print(lotto);
		
	}// main�޼ҵ� ��

}
