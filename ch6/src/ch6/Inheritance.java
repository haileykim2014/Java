package ch6;

class Point {
	int x;
	int y;
}
//class Circle extends Point {//���
//	int r;
//}
class Circle { //����
	Point p = new Point(); //���������� �ʱ�ȭ
	int r;
	
}

public class Inheritance {
	public static void main(String[] args) {
		Circle c= new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		System.out.println("c.x="+c.p.x);
		System.out.println("c.y="+c.p.y);
		System.out.println("c.r="+c.r);
		
	}
	
}
