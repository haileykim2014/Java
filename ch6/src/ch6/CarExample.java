package ch6;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴپ�");
			myCar.run();
		}
		if(myCar.isLeftGas()) { //�����޼ҵ�ȣ���Ͽ� ���ǽ����λ��
			System.out.println("gas�� ������ �ʿ䰡�����ϴ�");
		}else {
			System.out.println("gas�� �����ϼ���");
		}

	}

}
