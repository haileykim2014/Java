package array;

public class Ex5_222 {

	public static void main(String[] args) {
		int sum =0; //총점을 저장하기 위한 변수
		float average = 0; // 평균을 저장하기 위한 변수
		
		int[] score= {100,88,100,100,90};
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}average = sum/(float)score.length;
		
		System.out.println(sum);
		System.out.println(average);

	}

}
