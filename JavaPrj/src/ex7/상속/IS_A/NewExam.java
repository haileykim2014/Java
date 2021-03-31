package ex7.상속.IS_A;

public class NewExam extends Exam {// Exam의 내용을 확장하자.상속

	private int com;

	public NewExam() {
		super();// 부모클래스의 생성자호출, 가장먼저 호출되어야함//Exam();자동으로 호출된것
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
