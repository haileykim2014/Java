package ch8;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");//예외처리가필요한코드
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지않습니다.");
		}
			
		}

	}


