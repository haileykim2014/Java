package ex4.struct;

public class Program {

	public static void main(String[] args) {
		
		String[] row1 = new String[3];
		row1[0] = "2020-10-01";
		row1[2] = "30";
		row1[1] = "30";
		row1[3] = "23";
		//�ε�����������
		//��ȯ�۾��߻�
		
		Covid19 row2 = new Covid19(); 
		//�ݵ�� new�����ڸ� ���ؼ�  heap�� ��������
		row2.deaths = 30;
		row2.positive = 30;
		row2.tests = 23;
		
		
		Covid19[] list = new Covid19[10]; 
		//new�����ڸ�������, heap�� �޸𸮻����ȵǰ� ���ÿ����ö󰡳�?
		//�迭����, ������ 10��,Ŭ�������̶������ؼ� .�������ڵ��ν�
		//--------------------------------------------------------
//		list[0] = new Covid19(); // Ŭ���������������. list
		list[0].date ="";
		list[0].deaths = 12;
		//--------------------------------------------------------
		list[1] = new Covid19(); // Ŭ���������������.
		list[1].date ="";
		list[1].deaths = 12;
		
		
		Covid19 row;
		//--------------------------------------------------------
		row = new Covid19(); //���������������
		row.date = "2020"; //row date�� ��¥���
		row.deaths = 20;
		
		list[0] = row;
		
		row = new Covid19();
		row.date = "2020";
		row.deaths = 20;
		
		list[1] = row;		

	}

}
