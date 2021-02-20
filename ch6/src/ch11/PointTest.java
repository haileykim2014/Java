package ch11;


public class PointTest {

	public static void main(String[] args) {
		//객체 생성
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);

		//거리계산
		double dist = Point.distance(p1,p2); //distance()메서드
		
		//결과출력
		System.out.printf("두점 A%s, B%s 사이의 거리:%.2f",p1.toStr(),p2.toStr(),dist); //toStr()메서드
	}

}

class Point{
	//필드생성	
	int x;
	int y;
	//생성자 정의	
	Point(int _x,int _y){
		x = _x;
		y = _y;
	}
	//객체 정보를 문자열로 반환하는 인스턴스 메소드를 만드시오
	String toStr() {
		return String.format("(%d,%d)", x,y);
	}
	//두 점 사이의 거리를 반환하는 클래스 메소드를 만드시오
	static double distance(Point p, Point q) { //클래스메소드니까 static
		double dx = p.x - q.x; //x좌표의 변화량
		double dy = p.y - q.y; //y좌표의 변화량
		System.out.println(p.x+","+q.x);
		System.out.println(p.y+","+q.y);
		return Math.sqrt((dx*dx)+(dy*dy));
	}
	
}