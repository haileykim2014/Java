package ch9;

public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
//		Unit[] group = new Unit[3]; //객체배열 - 참조변수 묶은것
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
//		group의 타입은 Unit[]
		for(int i=0;i<group.length; i++)
			group[i].move(100,200);
//		group[0].move(100,200);
//		group[1].move(100,200);
//		group[2].move(100,200);
	}
}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x="+x+",y="+y+"]");
	}
	void stimPack() {}
}
class Tank extends Unit{
	void move(int t, int y) {
		System.out.println("Tank[x="+x+",y="+y+"]");
	}
	void changeMode() {}	
}

class Dropship extends Unit{
	void move(int t,int y) {
		System.out.println("Dropship[x="+x+",y="+y);
	}
}