package ch9;

public class Ex2_12 {

	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0)-'0'); //'3'-'0'=51-48 = 숫자3
		System.out.println('3'-'0'+1); // 4
		System.out.println(Integer.parseInt("3")+1); // 숫자3+1=4
		System.out.println("3"+1); //31
		System.out.println(3+'0'); // 51

	}

}
