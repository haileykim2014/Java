package ex6.ĸ��ȭ.�ζ�.��ü����.������;

import java.util.Random;

//����
public class Lotto {
	private int[] nums; // Lotto�� û����,�ܼ� ����,
	private int size;

	public int getNum(int i) {
		int num = nums[i];
		return num;
	}
	//�ʱ�ȭ�� �� �ѹ��� ����Ǳ� �ٶ���.
	//�ʱ�ȭ�� �Ӽ��� ���Ǳ� ������ ����Ǳ� �ٶ���.
	//�ٸ�� �������� ���� ���� ����Ǳ� �ٶ���.
	//���� �� ������ �����ϴ� ���� => Constructor(������)
	public Lotto() {
		size = 6;
		nums = new int[size];
	}

	public int getSize() {//�������°�
		return size;
	}

//	public void setSize(int i) {//���� ����
//		this.size =size;		
//	}
	

	public void gen() {
//		Lotto lotto = new Lotto(); // 4����Ʈ
//		lotto.nums = new int[6]; // �迭�� ��������
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}

	}// gen()��

	public void sort() {
		
		for (int j = 0; j < size - 1; j++) {
			for (int i = 0; i < size - 1 - j; i++) {
				int compare;
				if (nums[i] > nums[i + 1]) {
					compare = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = compare;
				}
			}
		}
	}// sort()��

}
