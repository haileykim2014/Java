package ex7.���.IS_A;

public class NewExam extends Exam {// Exam�� ������ Ȯ������.���

	private int com;	

	public NewExam() {
		this(1);
	}

	public NewExam(int value) {
		//super();
		super(value);		
		this.com = value;
	}
	
	public NewExam(int kor,int eng,int math,int com) {
		//super();
		super(kor,eng,math);
		this.com = com;
	}
	
	@Override // ctrl + space
	public int total() {
		return super.total() + com;//�θ���Ż�� + ����
	}
	
	@Override
	public float avg() {
		
		return /*this*/total() / 4.0f;//�����
	}

}
