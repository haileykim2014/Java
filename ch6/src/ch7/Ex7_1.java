package ch7;

class  Tv{ //�θ��� 5��
	boolean power; //��������
	int channel;//ä��
	
	void power() {power=!power;}
	void channelup() {++channel;}
	void channelDown() {--channel;}
}

       //�ڽĸ��2��+ �θ�5�� =7��
class SmartTv extends Tv{ //SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� �����
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //ĸ�ǻ��°� on(ture)�϶��� text�� �����ش�
			System.out.println(text);
		}
	}
}
public class Ex7_1 {

	public static void main(String args[]) {
		SmartTv stv =new SmartTv(); //��ü����
		stv.channel = 10; //����Ŭ�����κ��� ��ӹ��� ���
		stv.channelup(); //���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true; //ĸ��(�ڸ�)������Ѵ�.
		stv.displayCaption("Hello, World");
	}
}

