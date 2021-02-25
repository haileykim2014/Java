package ch6;

public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); //객체생성
		long result1 = mm.add(5L,3L); //add 메서드 호출
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		mm.printGugudan(3); //구구단 3단을 출력
		
		System.out.println("add(5L,3L)="+result1);
		System.out.println("subtract(5L,3L)="+result2);
		System.out.println("multiply(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);
		
	}

}

class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan&&dan<=9))
			return; //입력받은 단이 2~9단이 아니면, 메서드 종료하고 돌아가기
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		
		
		}
	}
	long add(long a, long b) {
		 long result = a+b;
		 return result; //작업을 마치면 호출한곳으로 돌아온다.  result1=8
		 // return a+b; // 위의 두줄을 이와같이 한줄로 간단히가능
	}
	long subtract(long a, long b) { return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {
		return a/b ;
	}
}
