package sec08_abstract;
abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}
interface Fightable{//인터페이스의 모든 메서드는 public abstract.예외없이
	void move(int x,int y); //public abstract가 생략됨
	void attack(Fightable f); //public abstract가 생략됨
}
class Fighter extends Unit2 implements Fightable{
	public void move(int x,int y) { //오버라이딩규칙:조상보다 접근제어자가 좁으면안된다.
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
}
	

public class FighterTest {

	public static void main(String[] args) {
//		Fighter f = new Fighter();
		Fightable f = new Fighter();
		f.move(100,200);
		Fighter f2 = new Fighter();
		f.attack(f2);

	}

}

