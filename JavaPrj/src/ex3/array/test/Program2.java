package ex3.array.test;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		
		//
		//�迭�ʱ�ȭ
//		int[] nums1 = new int[] {1,2,3,4,5,6,7,8,9,10};
//		int[] nums2 = new int[] {1,2,3,4,5,6,7,8,9,10};
	

		int[] nums = {1,2,3,4,5,6,7,8,9,10};		

		Random rand = new Random();
		
		for(int i = 0; i<100;i++) {
			int idx1 = rand.nextInt(10); //�ε��� �ΰ��� ���Ƿ� �̴´�.
			int idx2 = rand.nextInt(10); //�ε��� �ΰ��� ���Ƿ� �̴´�.
			System.out.printf("idx1 :%d, idx2:%d\n",idx1,idx2); //�������� Ȯ���Ѵ�.
			
			//�� �ε��� ��ġ�� ���� �ٲ��
			//{1,2,6,4,5,3,7,8,9,10}				
			int temp;
			temp = nums[idx1]; //���������� �����ش�
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;
		}
				
		//nums �迭�� ����Ͻÿ�.
		for(int i = 0; i<10;i++) {
			System.out.print(nums[i]);
			
			if(i<9)
				System.out.print(",");
		}
		
		
		
		
		
	}			
			
}

