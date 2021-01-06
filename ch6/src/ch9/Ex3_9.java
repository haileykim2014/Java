package ch9;

public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000; //10의 6제곱
		int b = 2_000_000;
		//10의 12제곱
		long c = (long)a * b; //int의 범위는 10의 9제곱
		
		System.out.println(c);

	}

}
