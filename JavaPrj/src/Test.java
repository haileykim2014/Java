import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class Test {
	public static void main(String[] args) throws IOException {
		int kor,eng,math;
		int total;
		float avg;
		
		kor = 0;
		eng = 0;
		math = 0;
		
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\yh\\\\git\\\\repository3\\\\JavaPrj\\\\data.txt");
		Scanner scan = new Scanner(fis);
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0f;
		scan.close();
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\yh\\git\\repository3\\JavaPrj\\data.txt");
		PrintStream fout = new PrintStream(fos);
		kor = kor + 1;
		eng = eng + 1;
		math = math +1;
		fout.printf("%d %d %d",kor,eng,math);
		fout.close();
		fos.close();
		
		System.out.printf("국어: %d\n", kor);
		System.out.printf("영어: %d\n", eng);
		System.out.printf("수학: %d\n", math);
		
				

		}
}