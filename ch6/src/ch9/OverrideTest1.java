package ch9;

class MyPoint33 extends Object{
	int x;
	int y;
	MyPoint33(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x:"+x+",y:"+y;
	}
}


public class OverrideTest1 {
	public static void main(String[] args) {
		MyPoint33 p = new MyPoint33(1,2);
//		p.x =3;
//		p.y = 5;
		System.out.println(p);

	}
}
