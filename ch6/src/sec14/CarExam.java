package sec14;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(60);
		myCar.setStop(false);
		
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		
		
	}

}
