package sec08;

public class CarExample {

	public static void main(String[] args) {
	 Car myCar = new Car(); //��ü����
	 
	 myCar.keyTurnOn(); //�޼ҵ�ȣ��
	 myCar.run();
	 
	 int speed = myCar.getSpeed(); //�޼ҵ�ȣ��
	 System.out.println(speed+"km/h");
	 
     //�ܺο��� �޼ҵ带 ȣ���Ҷ��� ��ü�������, �޼ҵ带 ȣ���ؾ��Ѵ�.
	}
}
