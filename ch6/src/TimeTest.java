class Time{
	private int hour; //0~23������ ���� ��������.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour<0||hour>23) return;
		
		this.hour= hour;
	}
	public int getHour() { return hour;}; //���� ���� ���ְ�
}


public class TimeTest {

	public static void main(String[] args) {
		Time t =new Time();
//		t.hour = 100; //���� : hour�� private��������Ǿ������Ƿ� ����Ŭ����������������
		t.setHour(21); //hour�� ���� 21�κ���
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}

}