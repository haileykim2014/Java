package ch8;

public class Ex8_7 {

	public static void main(String[] args) {
		try { //Exception과 그 자손은 반드시예외처리를 해줘야한다(필수)
			throw new RuntimeException(); //Exception을 고의로 발생시킨다.
		}catch(Exception e) {
			
			//RuntimeExcption과 그 자손은 예외처리를 해주지않아도 컴파일이된다.
			throw new RuntimeException();
		}
	}
}
