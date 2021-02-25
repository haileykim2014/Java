package ch9;

public class PrintfEx1 {

	public static void main(String[] args) {
//		System.out.printf("%d%n",15); // n은개행문자
//		System.out.printf("%#o%n",15); //8진수
//		System.out.printf("%#x%n",15); //16진수
//		System.out.printf("%s",Integer.toBinaryString(15)); //2진수
//		
		double f = 123.456789f; //float보다 더 정확함
		System.out.printf("%f%n",f);
		System.out.printf("%e%n",f);
		System.out.printf("%g%n",f);
		
		double d = 1.23456789;
		System.out.printf("%14.6f",d);//총14자리 소수점6번째
	}

}
