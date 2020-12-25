package sec03.exam01;

public interface RemoteControl {
	int MAX_VOLME = 10;//인터페이스에서 선언되는 필드는 모두 상수(public static final)
	int MIN_VOLUME = 0;
	
	void turnOn(); //추상메소드
	void rutnOff(); //추상메소드
	void setVolume(int volume); //추상메소드
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}else {
			System.out.println("무음해제");
		}
	}
	static void changeBattery() {
		System.out.println("건전지교환");
	}
	

}
