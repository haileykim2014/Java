package ch11;

public class Refe {

	public static void main(String[] args) {
		/* 자전거 객체 생성*/
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		
		/* 객체 필드값 초기화*/
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
		
		/* 객체 필드값 초기화*/
		b2.name = "산악형 자전거";
		b2.weight = 10.68;
		b2.price = 429000;
		
		/* 객체 정보 출력*/
		System.out.printf("b1->{%s,%.2f,%d}\n",b1.name,b1.weight,b1.price);
		System.out.printf("b2->{%s,%.2f,%d}\n",b2.name,b2.weight,b2.price);
		

	}

}
/* 자전거 클래스 */
class Bicycle{
	/* 필드 */
	String name;
	double weight;
	int price;
	
	/* 메소드 */
	void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}
	void horn() {
		System.out.println("따르릉! 지나갈게요");
	}
}