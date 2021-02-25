package ch6;

public class Ex8 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);//실행되지않는다
		} catch(ArithmeticException ae) {
			System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		} //try-catch의 끝
		 System.out.println(6);
		}
		
	}

