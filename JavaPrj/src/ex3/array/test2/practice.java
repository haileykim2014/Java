package ex3.array.test2;

import java.util.Random;

public class practice {

	public static void main(String[] args) {
		
		//1.���� 10��¥�� nums�迭�� �����Ѵ�. ��, 1,2,3,4~10

		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		//���´�.
		//�������� ��
		Random rand = new Random();
		
		for(int i=0;i<100;i++) {
			int idx1 = rand.nextInt(10); //0~9
			int idx2 = rand.nextInt(10); //0~9
			System.out.printf("idx1: %d, idx2:%d\n",idx1,idx2);
			
		//�� �ε����� ��ġ�� �ٲ��.		
			int temp;
			temp = nums[idx1];
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;		
			}
		for(int i=0;i<10;i++) {
			System.out.print(nums[i]);
			
			if(i<9)
				System.out.print(",");
		}
	}
}
