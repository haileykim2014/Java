package javastudy.java;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
//		c.BB(); 부모가 가지고있지않는 메소드
		
		Bus bus = (Bus)c; //형변환
		bus.run();
		bus.BB(); //자식이 가지고있는 메소드
	}

}
