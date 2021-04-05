package ex8.추상화;

public abstract class Exam { //공통분모 , 객체화되면안된다.
	private int kor;
	private int eng;
	private int math;
	//기본생성자
	public Exam() {
//		kor = 10; //내부적으로 정해진값
//		eng = 10;
//		math = 10;
		this(1);//Exam()호출할때 전달된 객체
	}
	//오버로드생성자
	public Exam(int value) {//값은 차이가있지만 기능은똑같다.
		this.kor = value; //사용자가 전달한 값으로 초기화
		this.eng = value;
		this.math = value;
	}
	
	public Exam(int kor,int eng,int math) {//값은 차이가있지만 기능은똑같다.
		this.kor = kor; //사용자가 전달한 값으로 초기화
		this.eng = eng;
		this.math = math;
	}
		
		
	public int total() {
		return this.kor + eng + math;
		
	}
	
	public int total(int ext) {//반드시재정의하도록강요못함
		return this.kor + eng + math;
		
	}

	public abstract float avg();//몸통을없앤다, 구현은 공통이 아니다.일괄처리
}
