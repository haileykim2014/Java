package ch9;

public class Ex6_1 {

	public static void main(String[] args) {
	Tv t;
	t = new Tv();
	t.channel = 7;
	t.channelUp();
	System.out.println("현재채널은" + t.channel + "입니다");
	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
		
}


