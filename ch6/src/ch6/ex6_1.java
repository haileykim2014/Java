package ch6;

public class ex6_1 { // Ŭ�����̸��� �ҽ����� ��ġ

	public static void main(String[] args) {
		Tv t;  //Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv(); // Tv�ν��Ͻ��� �����Ѵ�
		t.channel =7; // Tv�ν��Ͻ��� ������� channel�� ���� 7��
		t.channelDown(); // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ��
		System.out.println("����ä����"+t.channel+"�Դϴ�");
	}
}

class Tv {
	// Tv�� �Ӽ�(�������)
	String color; //����
	boolean power; // ��������(on/off)
	int channel; // ä��
	
	// Tv�� ���(�޼���)
	void power() {power=!power;} // Tv�� �Ѱų� ���±���� �ϴ� �޼ҵ�
	void channelUp() {++channel;} // Tv�� ä���� ���̴� ����� �ϴ� �޼ҵ�
	void channelDown() {--channel;} //Tv�� ä���� ���ߴ� ����� �ϴ� �޼ҵ�
		
	}
