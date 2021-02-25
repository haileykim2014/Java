package javastudy;

public class CarExam {

	public static void main(String[] args) {
	//	Car c1 = new Car(); 
		//기본생성자 오류발생:사용자가 생성자가 추가했으므로 기본생성자없어짐
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차");
		
		System.out.println(c2.name);
		System.out.println(c3.name);

	}

}
