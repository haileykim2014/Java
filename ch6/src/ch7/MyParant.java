package ch7;

class MyParent{
	private		 int prv; //같은클래스
				 int dft; //같은클래스
	protected	 int prt; //같은클래스+자손(다른패키지)
	public 		 int pub; //접근제한없음
	
	public void printmembers() {
		System.out.println(prv); //ok
		System.out.println(dft); //ok
		System.out.println(prt); //ok
		System.out.println(pub); //ok
	}
}

public class MyParantTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
	
		System.out.println(p.prv);//오류
		System.out.println(p.dft);//ok
		System.out.println(p.prt);//ok
		System.out.println(p.pub);//ok
	}

}