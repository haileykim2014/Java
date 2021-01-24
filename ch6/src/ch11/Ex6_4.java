package ch11;

import java.util.*;

public class Ex6_4 {

	public static void main(String[] args) {
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
		
		Card c1 = new Card(); //인스턴스 생성
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은"+c1.kind+c1.number+"크기는"+c1.width+","+c1.height);
		System.out.println("c2은"+c2.kind+c2.number+"크기는"+c2.width+","+c2.height);
		System.out.println("c1의 width와 height를 각가 50,80으로 변경합니다");

		Card.width = 50; //클래스변수는 공유하기때문에 같이바뀐다.
		Card.height = 80; //클래스변수 사용시 Card.width와 같이 클래스이름.클래스변수로 사용할것
		System.out.println("c1은"+c1.kind+c1.number+"크기는"+c1.width+","+c1.height);
		System.out.println("c2은"+c2.kind+c2.number+"크기는"+c2.width+","+c2.height);
	}
}
class Card{
	String kind; 
	int number;
	static int width = 100; //클래스변수
	static int height = 250; //클래스변수
	
}