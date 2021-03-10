package ex3.array.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

	//1.문자열 10개 짜리 names 배열을 생성한다.
		String[] names = new String[10];
		
	//2.파일에서 name들을 읽어와서 names 배열애 대입한다.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		int i =0;
		while(fscan.hasNextLine()) { //참인동안 반복
			String name = fscan.nextLine(); //끝까지 읽었다는 것을 알려줌
			names[i++] = name;
			System.out.printf("%s, ",names[i-1]);
			
			if(fscan.hasNextLine()==false) // 거짓이면 중단
				System.out.printf("%s",names[i-1]); //마지막줄
		}
				
	//3.names 배열의 이름을 다음처럼 콘솔에 출력한다.
	//홍길동,김길동,강호동,유재석
				
		fscan.close();
		fis.close();

		System.out.println("복사완료");	
	}
}
