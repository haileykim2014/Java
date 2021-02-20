package javastudy.java;

public class Truck extends Car {
	public Truck() {
		super(); 
		//부모 생성자가 String이었다면 기본super()로적용안됨
		//부모객체 나타내는키워드 
		//부모Car객체가 자동으로 생성된다.
		System.out.println("Truck의 기본생성자입니다");
	}

}
