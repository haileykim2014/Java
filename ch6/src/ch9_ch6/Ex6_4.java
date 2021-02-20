package ch9_ch6;

public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); //객체생성
		long result5 = mm.min(3, 5);
		long result = mm.max(5, 3);
		long result1 = mm.add(5L,3L); //객체사용(객체의 메서드사용)
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		mm.printGugudan(5);
		
		System.out.println(result5);
		System.out.println("max(5L,3L)="+result);
		System.out.println("add(5L,3L)="+result1);
		System.out.println("subtract(5L,3L)="+result2);
		System.out.println("multiply(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);	
		System.out.println();
	}
}

class MyMath{ //클래스작성
	void printGugudan(int dan) {
		if(!(2<=dan && dan <= 9))
			return; //입력받은 단이 2~9단이 아니면,메서드종료하고 돌아가기
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	long min(long a, long b) {
		long result = 0;
		if(a < b) {
			result = a;
		}else {
			result = b;
		}
		return result;
	}
	long add(long a, long b) { //메서드작성
		long result = a + b;
		return result;
		}
	//두값을 받아서 둘중에 큰값을 반환하는 메서드를 작성하시오.
	long max(long a, long b){
		long result = 0;
		if(a > b) {
			result = a; // 조건이 참일떄만 실행
		}else {
			result = b; //조건식이 거짓일때 실행
		}
		return result;
		// return a > b ? a : b;
	}
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	}
	long multiply(long a , long b) {
		long result = a * b ;
		return result;
	}
	double divide(double a, double b) {
		double result = (double)a/b;
		return result;
	}
}
