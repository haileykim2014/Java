package javastudy.java;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
//		c.BB(); �θ� �����������ʴ� �޼ҵ�
		
		Bus bus = (Bus)c; //����ȯ
		bus.run();
		bus.BB(); //�ڽ��� �������ִ� �޼ҵ�
	}

}
