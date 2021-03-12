package ex3.array.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Jeju {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/corona.csv"); //파일위치지정
		Scanner scan = new Scanner(fis); //파일불러오기
		String line = scan.nextLine(); // 1행불러온것

		int total = 0;

		// 2020-10-01,59,0,28,0,0,58,8,230,2020-12-14 

		while (scan.hasNextLine()) {// 다음에읽어올게있어?
			line = scan.nextLine();
			String[] cols = line.split(",");		// [2020-10-01,59,0,28,0,0,58,..]
			total += Integer.parseInt(cols[3]);
		}		
		System.out.println(total);

		scan.close();
		fis.close();
		System.out.printf("10월 1일부터 12월14일까지 누적확진자수:%d",total);
	}

}
//10월 1일부터 12월14일까지의 누적검사진행자수
//누적 검사진행수
//첫번째열읽고
