package ch7;

class  Tv{ //부모멤버 5개
	boolean power; //전원상태
	int channel;//채널
	
	void power() {power=!power;}
	void channelup() {++channel;}
	void channelDown() {--channel;}
}

       //자식멤버2개+ 부모5개 =7개
class SmartTv extends Tv{ //SmartTv는 Tv에 캡션(자막)을 보여주는 기능을
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //캡션상태가 on(ture)일때만 text를 보여준다
			System.out.println(text);
		}
	}
}
public class Ex7_1 {

	public static void main(String args[]) {
		SmartTv stv =new SmartTv(); //객체생성
		stv.channel = 10; //조상클래스로부터 상속받은 멤버
		stv.channelup(); //조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true; //캡션(자막)기능을한다.
		stv.displayCaption("Hello, World");
	}
}

