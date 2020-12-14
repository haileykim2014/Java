package array;

public class ex5_8 {

	public static void main(String[] args) {
		int[][] score= {
				{100,100,100}, // score[0] 2차원배열의 첫번째행 = 3
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		int sum=0;
		
		for(int i=0;i<score.length;i++) { //4 0~3까지 , 몇행인지 알려줌
			for(int j=0;j<score[i].length;j++) { //score[0].length는 3(1,2,3) ,[i]라고해야 놓치는 행없이 출력된다.
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
				sum+=score[i][j];
			}
		}
		System.out.println("sum="+sum);
	}

}

name = hailey
email = haileykim2014@gmail.com

