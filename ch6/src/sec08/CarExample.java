package sec08;

public class CarExample {

	public static void main(String[] args) {
	 Car myCar = new Car(); //객체생성
	 
	 myCar.keyTurnOn(); //메소드호출
	 myCar.run();
	 
	 int speed = myCar.getSpeed(); //메소드호출
	 System.out.println(speed+"km/h");
	 
     //외부에서 메소드를 호출할때는 객체를만들고, 메소드를 호출해야한다.
	}
}
