package exam03_constructor;

public class CarExample {

	public static void main(String[] args) {
	Car car1 = new Car(); //변수선언
	System.out.println("car1.company:"+car1.company);
	System.out.println("car1.model:"+car1.model);
	System.out.println("car1.color:"+car1.color);
	System.out.println("car1.maxSpeed:"+car1.maxSpeed);
	
	Car car2 = new Car("자가용"); // 두번째 스트링불러옴
	System.out.println("car2.company:"+car2.company);
	System.out.println("car2.model:"+car2.model);
	System.out.println("car2.color:"+car2.color); //기본값 null
	System.out.println("car2.maxSpeed:"+car2.maxSpeed); //기본값0
	
	Car car3 = new Car("자가용","빨강"); //세번째 스트링불러옴 
	System.out.println("car3.company:"+car3.company);
	System.out.println("car3.model:"+car3.model);
	System.out.println("car3.color:"+car3.color);
	System.out.println("car3.maxSpeed:"+car3.maxSpeed);	
	
	Car car4 =new Car("자가용","빨강",200);
	System.out.println("car4.company:"+car4.company);
	System.out.println("car4.model:"+car4.model);
	System.out.println("car4.color:"+car4.color);
	System.out.println("car4.maxSpeed:"+car4.maxSpeed);	
	}

}
