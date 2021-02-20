package ch7;

abstract class Unit{
	int t,y;
	abstract void move(int t, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable{
	void move(int x, int y); //public abstract 생략
	void attack(Fightable f); // public abstract 생략
}
class  Fighter extends Unit implements Fightable{
	//오버라이딩규칙:조상(public)보다 접근제어자가 좁으면 안된다.
	public void move(int x,int y) { //public 안붙이면 default
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
}
	
public class FighterTest {

	public static void main(String[] args) {
		Unit u = new Fighter();
		Fightable f = new Fighter();
		u.move(100, 200);
		u.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); //Fighetable에는 stop()이 없어서 호출불가

	}

}

