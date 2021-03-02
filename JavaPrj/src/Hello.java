import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {
		int kor, eng, math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		//여기에 성적을 입력하는 코드를 작성하시오
	
		FileInputStream fis = new FileInputStream("C:\\Users\\yh\\git\\repository3\\JavaPrj\\data.txt");
		Scanner scan1 = new Scanner(fis);				
		kor = scan1.nextInt();
		eng = scan1.nextInt();
		math = scan1.nextInt();
				
		total = kor + eng + math;
		avg = total / 3.0f;
				
		//System.out.printf("total is %d\n", total);
		
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                 성적 출력                 │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.printf("국어 : %d\n",kor);
		System.out.printf("영어 : %d\n",eng);
		System.out.printf("수학 : %d\n",math);
		
		System.out.printf("총점 : %d\n",total);
		System.out.printf("평균 : %5.2f\n",avg); 
		System.out.println("──────────────────────────────────────────");

		//기본형식이 아닌형식
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("국어 성적을 입력하세요:");
//		
//		//String도 기본형식이 아닌형식//		String line = scan.next(); //공백까지만 출력
//		System.out.printf("line=%s\n",line);
		
//		line = scan.next(); //다음내용을 공백까지만 출력
//		System.out.printf("line=%s\n",line); 
//		
//		kor = scan.nextInt(); //단어를 정수형으로
//		System.out.printf("line=%d\n",kor);

		
		}
}