package ex7.���.IS_A;

public class NewExam extends Exam {// Exam�� ������ Ȯ������.���

	private int com;

	public NewExam() {
		super();// �θ�Ŭ������ ������ȣ��, ������� ȣ��Ǿ����//Exam();�ڵ����� ȣ��Ȱ�
		com = 10;
	}

	@Override // ctrl + space
	public int total() {
		return super.total() + com;
	}

	@Override
	public float avg() {
		return /* this */total() / 4.0f;
	}

}
