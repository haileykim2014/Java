package ch6;

public class CalculaotorExam {

	public static void main(String[] args) {
	Calculator myCalc =new Calculator();
	myCalc.powerOn();
	
	int result1 = myCalc.plus(10, 20); //result1변수선언
	System.out.println(result1);
	
	byte x =10; //1바이트
	byte y =4;
	double result2 = myCalc.divide(x,y);
	System.out.println(result2);
	
	}

}
