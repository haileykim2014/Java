import java.util.Scanner;
public class Ex4_122 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� space�� �����ؼ� 5�� �̻� �Է���");
		
		while(scan.hasNext()) {
			n = scan.nextInt();
			if(n<10)
				continue;
			if(n>300)
				break;
			System.out.println(n);
		}

	}

}
