package ch6;

public class ComputerExam {

	public static void main(String[] args) {
	Computer myCom = new Computer(); //��������=��ü����
	
	int[] values1= {1,2,3};
	int result1 = myCom.sum1(values1); //values �迭�� ��
	System.out.println(result1);
	
	int result2 =myCom.sum1(new int[] {1,2,3}); //���� �Ű������� ����
	System.out.println(result2);
	
	int result3=myCom.sum2(1,2,3,4,5); //���� ������������ִ�.
			System.out.println(result3);
	
	}

}
