package ch8;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");//예외처리가필요한코드
			System.out.println("클래스를 찾았습니다");
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지않습니다.");
		}finally {
			System.out.println("프로그램을 안전한게 종료합니다");
		}
			
		}

	}


