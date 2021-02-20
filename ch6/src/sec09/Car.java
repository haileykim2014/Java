package sec09;

public class Car {

	String model;
	int speed;
	
	Car(String model){
		this.model=model; //필드 인스턴스멤버
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i); //Car객체안에 있는 setSpeed
			System.out.println(this.model+"가 달립니다"+this.speed+"km/h");
		}
}
}