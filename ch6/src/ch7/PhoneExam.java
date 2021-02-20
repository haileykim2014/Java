package ch7;

public class PhoneExam {

	public static void main(String[] args) {
   //Phone phone = new Phone(); //Phone은 추상클래스라서 실체클래스를만들수없다.
	//자식클래스를 만들어야한다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");//객체생성
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();

	}

}
