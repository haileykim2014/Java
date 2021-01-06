package ch9;

public class PrintfEx1 {

	public static void main(String[] args) {
		System.out.printf("%d%n",15); // n은개행문자
		System.out.printf("%#o%n",15); //8진수
		System.out.printf("%#x%n",15); //16진수
		System.out.printf("%s",Integer.toBinaryString(15)); //16진수

	}

}
