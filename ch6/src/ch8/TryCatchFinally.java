package ch8;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");//����ó�����ʿ����ڵ�
			System.out.println("Ŭ������ ã�ҽ��ϴ�");
		}catch(ClassNotFoundException e){
			System.out.println("Ŭ������ ���������ʽ��ϴ�.");
		}finally {
			System.out.println("���α׷��� �����Ѱ� �����մϴ�");
		}
			
		}

	}


