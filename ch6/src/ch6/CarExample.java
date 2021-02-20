package ch6;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다아");
			myCar.run();
		}
		if(myCar.isLeftGas()) { //직접메소드호출하여 조건식으로사용
			System.out.println("gas를 주입할 필요가없습니다");
		}else {
			System.out.println("gas를 주입하세요");
		}

	}

}
