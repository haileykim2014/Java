package sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		double result1=myCalcu.areaRectacgle(10);
		
		double result2=myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형의 넓이는"+result1);
		System.out.println("직사각형의 넓이는"+result2);
	}

}
