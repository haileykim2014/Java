import java.util.Scanner;
public class Gugudan1128 {

	public static void main(String[] args) {
		
		//8,9단
		System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값:" +number);
		
		if(number<2) {
			System.out.println("잘못입력했다구");
		} else if(number>9 ) {
			System.out.println("너무큰금액이야");
		} else { for(int i=1; i<10; i++) {
			System.out.println(number*i);
		}
		}}}

		
	

//// 8,9단
//		System.out.println("구구단 중 출력할 단은 ?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 :" +number);
//		
//		if (number<2) {
//			System.out.println("입력한값을 잘못입력했슴니다");
//		}else if(number>9) {System.out.println("값을 잘못 입력했어");
//		} else {
//		
//		
//		for(int i=1;i<10;i++) {
//		System.out.println(number*i);
//		}
//		}
//	}
//
//}
