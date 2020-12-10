package array;

public class PrintfEx2 {
	public static void main(String[] args) {
//	System.out.printf("%d\n",15);
//	System.out.printf("%o\n",15); // 8진수
//	System.out.printf("%x\n",15); //16진수
//	System.out.printf("%s",Integer.toBinaryString(15));

//	float f =123.456789f;
//	System.out.printf("%f\n",f);
//	System.out.printf("%e\n",f);
		
		System.out.printf("[%5d]%n",1234567);
		System.out.printf("[%-5d]%n",10);
		System.out.printf("[%05d]%n",10);
		
		double d =1.2345678;
		System.out.printf("%f",d); // 1.234568
		System.out.printf("%14.6f",d);
	
	}
}
