package chap07.sec02;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		// ����Ŭ����
		//��ü����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		
		
		System.out.println("��:"+dmbCellPhone.model); //�θ��� �ʵ带 ���
		System.out.println("����:"+dmbCellPhone.color);
		System.out.println("ä��:"+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn(); //��ӵ� �޼ҵ��
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
