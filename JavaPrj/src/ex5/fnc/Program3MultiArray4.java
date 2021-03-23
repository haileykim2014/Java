package ex5.fnc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray4 {


public static void main(String[] args) throws IOException {
      
	int count = 0;
	String[][] rows = null;
	// ---------------------------------------------------------
	// 레코드 개수를 알아내는 코드
	count = getCount();	
	
	// --------------------------------------------------------
	//	rows = new String[count][];
	// 레코드를 로드하는 코드
	rows = load(rows, count); //rows:참조변수 / count:값변수
	
	// ---------------------------------------------------------
	// 레코드를 출력하는 코드
	printCovid19List(rows, count);

	// ---------------------------------------------------------
	// 검사진행자 누적수를 얻는 코드
	int total = getTotal(rows, count);// f3누르면 메소드로이동
	System.out.println(total);
	System.out.println();
	// ---------------------------------------------------------
	// 1.일별 가장 많은 검사진행수는? 몇입니꽈~
	printMax(rows, count);

	// 2.감사진행수가 가장 많았던 날짜는?
	printB(rows, count);
	// ---------------------------------------------------------
	// 확진자 수가 늘어난 일자와 수를 출력하시오.
	printA(rows, count);

	// 확진자 수가 늘어난 일자와 수를 다음 배열에 담아주시오.
	String[][] results;
	int resultCount = 0;
	
	{
		// 확진자 수가 달라질 때마다 resultCount를 증가시킴으로써 증가되는 일자 수를 구하는 코드
		int old = 0; // 현재 확진자 수

		for (int i = 0; i < count; i++) {

			// i 번째 행의 확진자 수
			int current = Integer.parseInt(rows[i][1]);

			// i 번재 확진자(current)와 이전 확진자수(old)가 다르다면
			if (old != current) {
				// 확진자 수가 달라지는 일자의 수를 증가
				resultCount++;

				old = current;
			}
		}

		System.out.println(resultCount);

		results = new String[resultCount][];

		String date = "";
		int diff = 0;

		old = 0; // 현재 확진자 수

		int index = 0;
		for (int i = 0; i < count; i++) {
			int current = Integer.parseInt(rows[i][1]);

			if (old != current) {
				diff = current - old;
				date = rows[i][0];
				// 코로나19 데이터 행을 저장하기 위한 배열
				String[] row = new String[2];
				row[0] = date; // date
				row[1] = String.valueOf(diff); // diff

				results[index++] = row;

				old = current;
			}
		}

		System.out.println("작업완료");

	}

}//main메소드 끝


static void printCovid19List(String[][] rows, int count) {
	System.out.println("// 레코드를 출력하는 코드------------------------");

	for (int j = 0; j < count; j++) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s", rows[j][i]);

			if (i < 10 - 1)
				System.out.printf(",");
		}
		System.out.println();
	} // 큰for문끝
}// printCovid19List()끝
	// --------------------------------------------------------

static int getTotal(String[][] rows, int count) {
	int total = 0;

	for (int i = 0; i < count; i++)
		total += Integer.parseInt(rows[i][3]);

	return total;
}

// ---------------------------------------------------------
// 크로스방향으로 단순히 나누기만 한 코드
// 좀 더 개선해 볼 수 있는 여지가 있는가 ?
// 함수의 4가지 특징 중에서 재사용을 생각해보면 ?
static int getMax(String[][] rows, int count) {
	int max = 0;
	int current;

	for (int i = 0; i < count; i++) {
		current = Integer.parseInt(rows[i][3]);
		if (current > max)
			max = current;
	}
	return max;
}

// ---------------------------------------------------------
static void printMax(String[][] rows, int count) {

	int max = getMax(rows, count);// 메소드의 리턴값이 max에 담긴다.

	System.out.printf("max: %d\n", max); // <-콘솔출력을 위한것, 데이터얻는것과 출력을 함께두면 전체적으로 콘솔출력용으로만써야된다.
	System.out.println();

}

// ---------------------------------------------------------
// 확진자 수가 늘어난 일자와 수를 출력하시오.
static void printA(String[][] rows, int count) {

	String date = "";
	int diff = 0;

	int old = 0; // 현재 확진자 수
	int index = 0;
	for (int i = 0; i < count; i++) {
		int current = Integer.parseInt(rows[i][1]);

		if (old != current) {

			diff = current - old;
			date = rows[i][0];

			old = current;
			System.out.printf("일자와 수%d : %s, %d\n", index++ + 1, date, diff);
		}
	}
}

// ---------------------------------------------------------
// 레코드를 로드하는 코드
static String[][] load(String[][] rows, int count) throws IOException {
	rows = new String[count][];

	FileInputStream fis = new FileInputStream("res/corona.csv");
	Scanner fscan = new Scanner(fis);

	String line;

	fscan.nextLine();

	for (int i = 0; i < count; i++) {
		line = fscan.nextLine();
		rows[i] = line.split(",");
	}

	fscan.close();
	fis.close();

	return rows;
}

// ---------------------------------------------------------
// 2.검사진행수가 가장 많았던 날짜는?
static String getDate(String[][] rows, int count) {
	
	String date = "";
	int idx = 0;
	int max = getMax(rows, count);
	
	for (int i = 0; i < count; i++)
		if (max == Integer.parseInt(rows[i][3])) {
			idx = i;
			break;
		}
	date = rows[idx][0];
	return date;
}

// ---------------------------------------------------------
// 2.검사진행수가 가장 많았던 날짜는? 출력
static void printB(String[][] rows, int count) {

	String date = getDate(rows, count);

	System.out.printf("%s", date);
	System.out.println();
}
// ---------------------------------------------------------
static int getCount() throws IOException {
	int count = 0;
	FileInputStream fis = new FileInputStream("res/corona.csv");
	Scanner fscan = new Scanner(fis);

	// while 반복을 하면서 count++ 연산을 한다. 마지막 줄을 만날 때까지
	while (fscan.hasNextLine()) {
		fscan.nextLine();
		count++;
	}

	fscan.close();
	fis.close();

	count--;//반환값필요

	return count;
}

}//class끝
