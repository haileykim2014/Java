class A{ //A�� �����̵����ʴ´�
	//public void method(B b)
	public void method(I i) {//�������̽� I�� ������ �͸����Ͷ�.
		i.method();
	}
}
//BŬ������ ����� ������ �и�
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}

public class interfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); //A�� B�� ���(����)
	}

}
