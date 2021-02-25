package array;

import java.util.Scanner;

public class Ex41_6 {

	public static void main(String[] args) {
		System.out.print("현재의 월을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
				int month =scanner.nextInt();//화면을통해 입력받은 숫자를 month에 저장
		switch(month){
			case 3:
			case 4:
		    case 5:
		    	System.out.println("현재의 계절은 봄입니다");
		    	break;
		    	case 6: case 7: case 8:
		    	System.out.println("현재의 계절은 여름입니다.");
		    	break;
		    	case 9: case 10: case 11:
		    	System.out.println("It's fall now");
		       	break;
		     default:
		    	 System.out.println("It's winter now");
		
		}

	}

}