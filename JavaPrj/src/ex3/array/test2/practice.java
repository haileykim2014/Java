package ex3.array.test2;

import java.util.Random;

public class practice {

	public static void main(String[] args) {
		
		//1.정수 10개짜리 nums배열을 생성한다. 단, 1,2,3,4~10

		int[] nums = {10,2,9,1,4,6,8,3,5,7};
		

			for(int i=0;i<9;i++)
				if(nums[i]>nums[i+1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			for(int i=0;i<10;i++) {
				System.out.print(nums[i]);
				
				if(i<9)
					System.out.print(",");
				}
				System.out.println();
			
			
			
			for(int i=0;i<8;i++)
				if(nums[i]>nums[i+1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			for(int i=0;i<10;i++) {
				System.out.print(nums[i]);
				
				if(i<9)
					System.out.print(",");
				}
				System.out.println();
				
				
			for(int i=0;i<7;i++)
				if(nums[i]>nums[i+1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			for(int i=0;i<10;i++) {
				System.out.print(nums[i]);
				
				if(i<9)
					System.out.print(",");
				}
				System.out.println();
				
				
			for(int i=0;i<6;i++)
				if(nums[i]>nums[i+1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			for(int i=0;i<10;i++) {
				System.out.print(nums[i]);
				
				if(i<9)
					System.out.print(",");
				}
				System.out.println();
				
			
			for(int i=0;i<5;i++)
				if(nums[i]>nums[i+1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			for(int i=0;i<10;i++) {
				System.out.print(nums[i]);
				
				if(i<9)
					System.out.print(",");
				}
				System.out.println();
			
				
	}
}
