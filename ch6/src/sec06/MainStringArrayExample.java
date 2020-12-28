package sec06;

public class MainStringArrayExample {

	public static void main(String[] args) {
		if(args.length!=2) { //2개를 입력하지않았다면
			System.out.println("프로그램의 사용법");
			System.out.println("java sec06.MainStringArrayExample num1 num2");
			System.exit(0); //프로그램종료
		}
		String strNum1 = args[0];
		String strNum2 = args[1]; //숫자이더라도 문자열임.ex "3"
		
		int num1 = Integer.parseInt(strNum1); //변수를 숫자로 변환해줌
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		
	}

}
