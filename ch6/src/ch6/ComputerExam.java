package ch6;

public class ComputerExam {

	public static void main(String[] args) {
	Computer myCom = new Computer(); //변수선언=객체생성
	
	int[] values1= {1,2,3};
	int result1 = myCom.sum1(values1); //values 배열의 합
	System.out.println(result1);
	
	int result2 =myCom.sum1(new int[] {1,2,3}); //직접 매개값으로 생성
	System.out.println(result2);
	
	int result3=myCom.sum2(1,2,3,4,5); //값의 목록을받을수있다.
			System.out.println(result3);
	
	}

}
