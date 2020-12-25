class Time{
	private int hour; //0~23사이의 값을 가져야함.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour<0||hour>23) return;
		
		this.hour= hour;
	}
	public int getHour() { return hour;}; //값을 읽을 수있게
}


public class TimeTest {

	public static void main(String[] args) {
		Time t =new Time();
//		t.hour = 100; //오류 : hour는 private접근제어되어있으므로 같은클래스내에서만가능
		t.setHour(21); //hour의 값을 21로변경
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}

}
