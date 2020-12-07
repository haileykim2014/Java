package array;

public class Ex5_1 {

	public static void main(String[] args) {
		int sum=0;
		float avg=0;
		
		int[] score= {100,90,88,100,100};
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		avg=sum/(float)score.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
