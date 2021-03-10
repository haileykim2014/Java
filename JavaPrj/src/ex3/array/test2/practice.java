package ex3.array.test2;

import java.util.Random;

public class practice {

	public static void main(String[] args) {
		
		//1.정수 10개짜리 nums배열을 생성한다. 단, 1,2,3,4~10

		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		//섞는다.
		//랜덤값을 얻어서
		Random rand = new Random();
		
		for(int i=0;i<100;i++) {
			int idx1 = rand.nextInt(10); //0~9
			int idx2 = rand.nextInt(10); //0~9
			System.out.printf("idx1: %d, idx2:%d\n",idx1,idx2);
			
		//두 인덱스의 위치를 바꿔라.		
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
