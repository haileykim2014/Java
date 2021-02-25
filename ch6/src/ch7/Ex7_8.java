package ch7;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){
		//조상클래스의 생성자 prudct(int price)
		super(100); //Tv의 가격을 100만원으로 한다.
	}
	public String toString() {return "TV";}
}

class Computer extends Product{
	Computer() {super(200);}
	
	public String toString() { return "Computer";}
}

class Buyer{ //고객, 물건을 사는 사람
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이부족하여 물건을 살 수없습니다.");
			return;
		}
		money -= p.price; //가진돈에서 구입한 제품의 가격을 뺸다.
		bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가한다.
		System.out.println(p+"를 구입하셨습니다."); //p.toString과 같음
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1()); //buy(Product p)
		b.buy(new Computer());
		
		System.out.println("현재남은 남돈은"+b.money+"만원입니다");
		System.out.println("현재 보너스점수는"+b.bonusPoint+"점입니다");
		

	}

}
