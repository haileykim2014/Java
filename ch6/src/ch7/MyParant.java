package ch7;

class MyParent{
	private		 int prv; //����Ŭ����
				 int dft; //����Ŭ����
	protected	 int prt; //����Ŭ����+�ڼ�(�ٸ���Ű��)
	public 		 int pub; //�������Ѿ���
	
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
	
		System.out.println(p.prv);//����
		System.out.println(p.dft);//ok
		System.out.println(p.prt);//ok
		System.out.println(p.pub);//ok
	}

}