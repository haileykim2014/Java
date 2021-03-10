package ex3.array.test;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		
		//
		//배열초기화
//		int[] nums1 = new int[] {1,2,3,4,5,6,7,8,9,10};
//		int[] nums2 = new int[] {1,2,3,4,5,6,7,8,9,10};
	

		int[] nums = {1,2,3,4,5,6,7,8,9,10};		

		Random rand = new Random();
		
		for(int i = 0; i<100;i++) {
			int idx1 = rand.nextInt(10); //인덱스 두개를 임의로 뽑는다.
			int idx2 = rand.nextInt(10); //인덱스 두개를 임의로 뽑는다.
			System.out.printf("idx1 :%d, idx2:%d\n",idx1,idx2); //랜덤값을 확인한다.
			
			//두 인덱스 위치의 값을 바꿔라
			//{1,2,6,4,5,3,7,8,9,10}				
			int temp;
			temp = nums[idx1]; //랜덤값끼리 섞어준다
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;
		}
				
		//nums 배열을 출력하시오.
		for(int i = 0; i<10;i++) {
			System.out.print(nums[i]);
			
			if(i<9)
				System.out.print(",");
		}
		
		
		
		
		
	}			
			
}

