package sec03.exam01;

public interface RemoteControl {
	int MAX_VOLME = 10;//�������̽����� ����Ǵ� �ʵ�� ��� ���(public static final)
	int MIN_VOLUME = 0;
	
	void turnOn(); //�߻�޼ҵ�
	void rutnOff(); //�߻�޼ҵ�
	void setVolume(int volume); //�߻�޼ҵ�
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó��");
		}else {
			System.out.println("��������");
		}
	}
	static void changeBattery() {
		System.out.println("��������ȯ");
	}
	

}
