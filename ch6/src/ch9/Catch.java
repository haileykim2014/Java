package ch9;

public class Catch {

	public static void main(String[] args) {
		
		try {
		String data1 = args[0];
		String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1+value2;
		System.out.println(data1+"+"+data2+"="+result);

	}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
		System.out.println("실행매개값의 수가 부족하거나 숫자로 변환할수없음.");
		System.out.println("실행방법");
		System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
	}catch(Exception e) {
		System.out.println("알수없는 오류 발생");
	}
	finally {
		System.out.println("다시실행하세요");
	}
		
	}
}
