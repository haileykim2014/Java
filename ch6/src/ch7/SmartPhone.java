package ch7;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) { 
		//phone은 매개변수를가지고있는생성자가있다
		super(owner);
}
	public void internetSearch() {
		System.out.println("인터넷을검색합니다");
	}
}