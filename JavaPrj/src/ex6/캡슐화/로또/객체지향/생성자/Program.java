package ex6.ĸ��ȭ.�ζ�.��ü����.������;

import java.util.Random;

public class Program {
	


	public static void main(String[] args) {// ���ø����̼ǿ���
		//lotto��ü�� ����.����gen()�Լ����� �и��� : gen()�Լ��� ���ڸ������ϵ���
		Lotto lotto = new Lotto();
		lotto.setSize(6);

		//lotto.nums = new int[6];
//		Lotto.init(lotto);
		lotto.init();
		
		//int[] lotto;

		//lotto = Lotto.gen(lotto);//Lotto�� �ν��Ͻ�(��ü,��ü)�� ����� �Լ�
		lotto.gen();
		
		LottoConsole.print(lotto);
		//lotto.print();
		
		//Lotto.sort(lotto);
		lotto.sort();
		
		LottoConsole.print(lotto);
		//lotto.print();

		
	}// main�޼ҵ� ��

}
