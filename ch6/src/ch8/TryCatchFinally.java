package ch8;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");//����ó�����ʿ����ڵ�
		}catch(ClassNotFoundException e){
			System.out.println("Ŭ������ ���������ʽ��ϴ�.");
		}
			
		}

	}


