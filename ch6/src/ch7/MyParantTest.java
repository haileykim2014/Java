package ch7;

class MyParant{
	private int prv; //����Ŭ����
			int dft; //������Ű��
	protected int prt; //������Ű�� +�ڼ�
	public  int pub; //�������Ѿ���
	
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
	  System.out.println(p.prv); //����
	  System.out.println(p.dft); //ok
	  System.out.println(p.prt); //ok
	  System.out.println(p.pub); //ok
	  

	}

}
