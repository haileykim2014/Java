package sec08_abstract;

public class Cat extends Animal{
	public Cat() {
		this.kind = "포유류"; //생성자
	}
	
	@Override
	public void sound() { //ctrl+space //자식클래스에서 재정의
		System.out.println("야옹");
	}
}
