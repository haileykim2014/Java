package chap07.sec02;

public class CellPhone {
	
	String model ; // �ʵ�
	String color; //�ʵ�
	
	void powerOn() {System.out.println("������ ŵ�ϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void sendVoice(String message) {System.out.println("�ڱ�:"+message);}
	void receiveVoice(String message) {System.out.println("����:"+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
	
	}

