package ch8;

public class Ex8_7 {

	public static void main(String[] args) {
		try { //Exception�� �� �ڼ��� �ݵ�ÿ���ó���� ������Ѵ�(�ʼ�)
			throw new RuntimeException(); //Exception�� ���Ƿ� �߻���Ų��.
		}catch(Exception e) {
			
			//RuntimeExcption�� �� �ڼ��� ����ó���� �������ʾƵ� �������̵ȴ�.
			throw new RuntimeException();
		}
	}
}
