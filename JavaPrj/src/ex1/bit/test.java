package ex1.bit;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		//1.A���� J���� ���
		char[] nums = new char[10]; // �迭����
		for(int i=0;i<10;i++) { // 0����9���� �� 10���ݺ�
			nums[i] = (char)('A'+i); //�迭 �ʱ�ȭ(A~J)���ڳֱ�
			System.out.printf("%c",nums[i]); // �迭�ȿ� ���� �������
		}System.out.println();
		
		
		//2.J���� A���� ���
		for(int i=0;i<10;i++) {
			nums[i] =(char)('J'-i); //J���� A�����ֱ�
			System.out.printf("%c",nums[i]); //���			
		}System.out.println();
		
		int tmp;
		for(int i=0;i<5;i++) {
			tmp = nums[i]; // ���ٲٱ�
			nums[i] = nums[9-i];
			nums[9-i] = nums[i];//nums[0]�� nums[9]�� �¹ٲۻ�Ȳ
			System.out.printf("%c",nums[i]);
			//���ʰ������ٲٹǷ� 5���̸� �ٽ�A~J��������µ�
			
	}
}
}
