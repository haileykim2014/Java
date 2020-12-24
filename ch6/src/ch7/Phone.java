package ch7;

public abstract class Phone {
	//필드
	public String owenr;
	
	//생성자
	public Phone(String owner) {
		this.owenr = owenr;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}

}
