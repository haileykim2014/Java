package sec06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 생성자호출
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("색깔:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed); 
		
		myCar.speed = 60; // 필드값을 수정하려면 !
		System.out.println("속도"+myCar.speed);
		

	}

}
