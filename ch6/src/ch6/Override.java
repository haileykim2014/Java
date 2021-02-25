package ch6;

class MyPoint3 extends Object{
	int x;
	int y;
	
	MyPoint3(int x, int y){ //생성
		this.x=x;
		this.y=y;
		
	}

	//object클래스의 toString()을 오버라이딩
	public String toString() {
		return"x:"+x+",y:"+y;
	}
}

public class Override {
	public static void main(String[] args) {
		MyPoint3 p =new MyPoint3(3,5);
		//	MyPoint3 p =new MyPoint3(0); 한번에초기화
		p.x=3;
		p.y=5;
//		System.out.println("p.x="+p.x);
//		System.out.println("p.x="+p.x);
//		System.out.println(p.toString());
		System.out.println(p); //참조변수로 toString이 출력된다.

	}
}