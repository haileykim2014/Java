package ex8.�߻�ȭ;

public abstract class Exam { //����и� , ��üȭ�Ǹ�ȵȴ�.
	private int kor;
	private int eng;
	private int math;
	//�⺻������
	public Exam() {
//		kor = 10; //���������� ��������
//		eng = 10;
//		math = 10;
		this(1);//Exam()ȣ���Ҷ� ���޵� ��ü
	}
	//�����ε������
	public Exam(int value) {//���� ���̰������� ������Ȱ���.
		this.kor = value; //����ڰ� ������ ������ �ʱ�ȭ
		this.eng = value;
		this.math = value;
	}
	
	public Exam(int kor,int eng,int math) {//���� ���̰������� ������Ȱ���.
		this.kor = kor; //����ڰ� ������ ������ �ʱ�ȭ
		this.eng = eng;
		this.math = math;
	}
		
		
	public int total() {
		return this.kor + eng + math;
		
	}
	
	public int total(int ext) {//�ݵ���������ϵ��ϰ������
		return this.kor + eng + math;
		
	}

	public abstract float avg();//���������ش�, ������ ������ �ƴϴ�.�ϰ�ó��
}
