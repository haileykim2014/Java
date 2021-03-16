package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray3 {

	public static void main(String[] args) throws IOException {
		
		int count = 0;
		String[][] rows; 
		//--------------------------------------------------------------
		//레코드 개수를 알아 내는 코드
		{
			FileInputStream fis = new FileInputStream("res/corona.csv");
			Scanner scan = new Scanner(fis);
			
			//while반복을 하면서 count++연산을 한다. 마지막 줄을 만날때까지
			String line;
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				count ++;		
			}			
			
			scan.close();
			fis.close();
			count--;
			System.out.println("총 행의 갯수"+count);
		}//충돌방지
		//--------------------------------------------------------------
		//레코드를 로드하는 코드
		{
			rows = new String[count][];
			FileInputStream fis = new FileInputStream("res/corona.csv");
			Scanner scan = new Scanner(fis);

			String line;

			scan.nextLine(); // 담을필요없다.한줄버리기

			for (int i = 0; i < count; i++) { // 한줄 불러오고, 나눠서 배열에넣기
				line = scan.nextLine(); // 한줄불러오기
				rows[i] = line.split(","); // 불러온것 쉼표로 구분
			}
			
			scan.close();
			fis.close();
		}		
		//--------------------------------------------------------------
		//레코드 출력하는 코드
		for (int j = 0; j < count; j++) { // 행
			for (int i = 0; i < 10; i++) { // 열채우기
				System.out.printf("%s", rows[j][i]);
	
				if (i < 9)
						System.out.printf(",");
			}
			System.out.println();
		}
		//--------------------------------------------------------------	
		//검사진행자 누적수 얻는 코드
		{
			int total = 0;
				
			for(int i=0;i<count;i++)
			total += Integer.parseInt(rows[i][3]);	//문자열을 정수로 형변환
			System.out.println(total);
			System.out.println();
		} 		

			
		//--------------------------------------------------------------		
		//일별 가장 많은 검사진행수는 ?
		{	int max = 0;
			int current;
					
			for(int i =0; i<count;i++) {
				current = Integer.parseInt(rows[i][3]);
				if(current > max) 
					max = current;
				}
			System.out.println(max);
			System.out.println();
		}	
	}	
	
}
