package ch7;

class MyPoint3 extends Object{
	int x;
	int y;
	
	MyPoint3(int x,int y){
		this.x = x;
		this.y = y;
	}
	//object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+",y:"+y;
	}
}


public class OverrideTest1 {

	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(1,2);
//		p.x = 3;
//		p.y = 5;
//		System.out.println("p.x="+p.x);
//		System.out.println(p.toString());
		System.out.println(p);
		
	}

}
