package chap07.sec02;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		// 실행클래스
		//객체생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		
		System.out.println("모델:"+dmbCellPhone.model); //부모의 필드를 상속
		System.out.println("색상:"+dmbCellPhone.color);
		System.out.println("채널:"+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn(); //상속된 메소드들
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hi?");
		dmbCellPhone.receiveVoice("Hi.I'm hong");
		dmbCellPhone.sendVoice("Hi Hong. Nice to meet you");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
		
	}

}
