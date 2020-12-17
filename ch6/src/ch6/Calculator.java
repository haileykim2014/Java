package ch6;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 키다");
	}
	int plus(int x,int y) {
		int result=x+y;
		return result;
		
	}
	double divide(int x, int y) {
		double result = (double)x/(double)y; //정수끼리 나눗셈이라 더블
		return result;
	}
	
}
