package pkg1;

public class Ex7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 =(FireEngine)car;
		fe2.water();
	
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive , Brrr");
	}
	void stop() {
		System.out.println("Stop");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}
