package ch6;

public class Ex6_44 {

	public static void main(String[] args) {
		MyJava mm = new MyJava(); //��ü����
		long result1 = mm.add(5L,3L); //��ü�� �޼���ȣ��
		long result2 = mm.subrtact(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}

class MyJava{
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b; //���� ������ �̿Ͱ��� ���ٷ� ������ �� ���ִ�.
	}
	long subrtact(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a , double b) {
		return a/b;	}
}