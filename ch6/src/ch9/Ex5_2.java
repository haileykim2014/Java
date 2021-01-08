package ch9;

public class Ex5_2 {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		sum += score[0];
		sum += score[1];
		sum += score[2];
		sum += score[3];
		sum += score[4];
		
		for(int i =0; i<score.length;i++) {
			sum += score[i];
		}
		average = sum/(float)score.length; //형변환
		
		System.out.println("총합:"+sum);
		System.out.println("평균:"+average);
	}

}
