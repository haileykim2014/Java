package ch6;

public class Ex6_44 {

	public static void main(String[] args) {
		MyJava mm = new MyJava(); //객체생성
		long result1 = mm.add(5L,3L); //객체의 메서드호출
		long result2 = mm.subrtact(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		long result5 = mm.max(5, 3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result4);
		System.out.println(result5);
	}

}

class MyJava{ //메서드는 클래스영역에만 정의가능
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b; //위의 두줄을 이와같이 한줄로 간단히 할 수있다.
	}
	long max(long a, long b) { 
		
		return a > b ? a : b;
		}
	
	long subrtact(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a , double b) {
		return a/b;	}
}