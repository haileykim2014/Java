package sec09;

public class Car {

	String model;
	int speed;
	
	Car(String model){
		this.model=model; //�ʵ� �ν��Ͻ����
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i); //Car��ü�ȿ� �ִ� setSpeed
			System.out.println(this.model+"�� �޸��ϴ�"+this.speed+"km/h");
		}
}
}