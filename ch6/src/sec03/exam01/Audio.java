package sec03.exam01;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
				System.out.println("TVŴ");
	}

	@Override
	public void rutnOff() {
		System.out.println("TV��");

		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLME) {
			this.volume = RemoteControl.MAX_VOLME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���纼��"+this.volume);
	}


	
}
