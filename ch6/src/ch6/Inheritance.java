package ch6;

class Point {
	int x;
	int y;
}
class Circle extends Point {//»ó¼Ó
	int r;
}

public class Inheritance {
	public static void main(String[] args) {
		Circle c= new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		
		System.out.println("c.x="+c.x);
		System.out.println("c.y="+c.y);
		System.out.println("c.r="+c.r);
		
	}
	
}
