package sec06;

public class MainStringArrayExample {

	public static void main(String[] args) {
		if(args.length!=2) { //2���� �Է������ʾҴٸ�
			System.out.println("���α׷��� ����");
			System.out.println("java sec06.MainStringArrayExample num1 num2");
			System.exit(0); //���α׷�����
		}
		String strNum1 = args[0];
		String strNum2 = args[1]; //�����̴��� ���ڿ���.ex "3"
		
		int num1 = Integer.parseInt(strNum1); //������ ���ڷ� ��ȯ����
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		
		
	}

}
