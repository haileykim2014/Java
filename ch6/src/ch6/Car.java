package ch6;

public class Car {
	int gas; //�ʵ�
	
	void setGas(int gas) { //�Ű�����
		this.gas=gas;  
		/*this. : �Ű������� �̸��� �ʵ��̸��� �����Ұ�� �޼ҵ峻���� �켱������ �Ű��������ִ�
		 * ��ü�ڽ��� �������ִ� �����͸� ���
		 */
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�(gas�ܷ�:"+gas+")");
				gas-=1;// �Ǵ� gas--;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�"+gas+")");
				return;
			}
		}
	}
}
