package ch7;

public abstract class Phone {
	//�ʵ�
	public String owenr;
	
	//������
	public Phone(String owner) {
		this.owenr = owenr;
	}
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�������� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}

}
