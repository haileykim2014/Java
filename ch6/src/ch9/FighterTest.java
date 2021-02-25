package ch9;

abstract class Unit2{ //추상클래스
	int x,y;
	abstract void move(int x, int y); //추상메서드
	void stop() {System.out.println("멈춥니다");
	}
}
	
interface Fightable{ //인터페이스의 모든메서드는 public abstract
	void move(int x, int y); //public abstract 생략
	void attack(Fightable f); //public abstract 생략
	
}
class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y){ //오버라이딩규칙: 조상public보다 접근제어자가 좁으면안됌
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
//		Fighter f2 = new Fighter();
//		f.attack(f2);

	}	
}

