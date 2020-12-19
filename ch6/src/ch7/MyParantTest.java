package ch7;

class MyParant{
	private int prv; //같은클래스
			int dft; //같은패키지
	protected int prt; //같은패키지 +자손
	public  int pub; //접근제한없음
	
	public void printMembers() {
		System.out.println(prv);//ok
		System.out.println(dft);//ok
		System.out.println(prt);//ok
		System.out.println(pub);//ok
	}

}

public class MyParantTest {

	public static void main(String[] args) {
	  MyParant p = new MyParant();
	  System.out.println(p.prv); //에러
	  System.out.println(p.dft); //ok
	  System.out.println(p.prt); //ok
	  System.out.println(p.pub); //ok
	  

	}

}
