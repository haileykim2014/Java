package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
				count++;		
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
			/*
			 * 0번째방 : {"a", "b", "c"}
			 * 1번째방 : {"d", "e", "f"}
			 * 
			 * */
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
		} 
		
		//--------------------------------------------------------------	
		//일별 가장 많은 검사진행 수는 ? 
		{	
			int max = 0;
			int current;
					
			for(int i =0; i<count;i++) {
				current = Integer.parseInt(rows[i][3]);
				if(current > max) 
					max = current;
				}
			System.out.println(max);
			System.out.println();
		
		
		//검사진행수가 가장 많았던 날짜는 ?
		
			String date ="";
			int idx = 0;

			for(int i=0;i<count;i++) {
				if(rows[i][3].equals(String.valueOf(max))) //세미콜론주의
				idx = i;
				}
			date = rows[idx][0];
			System.out.println(date);
		}
		//확진자 수가 늘어난 일자와 수를 출력하시오.
		{
			String date = "";
			int diff = 0;
			
			int old = Integer.parseInt(rows[0][1]); //이전확진자수
			int current = 0; //현재확진자 수
			int index = 0;			
			
			for(int i=1;i<count;i++) {
				current = Integer.parseInt(rows[i][1]);
				
				if(old != current) {
					
					diff = current - old;
					date = rows[i][0];
			
					old = current;
					
					//년 월 일로 출력하기
					date = date.substring(0,4)+"년"+
							date.substring(5,7)+"월"+
							date.substring(8,10)+"일";
					System.out.printf("%d : %s, %d\n",index+++1,date,diff);
					}			
			}
			
		}
		
		
		
		
}
	}
