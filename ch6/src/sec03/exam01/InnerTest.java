package sec03.exam01;

class A{ //A�� B�� �ܺ�Ŭ����
	int i=100;
	B b = new B();
	
	class B{ //B�� A�� ����Ŭ����
		void method() {
//			A a =new A();
//			System.out.println(a.i);
			System.out.println(i);//��ü�������� �ܺ�Ŭ������ ������ٰ���
		}
	}
}

//class C{
//	B b =new B();
//}


public class InnerTest {

	public static void main(String[] args) {
//		B b = new B();
//		b.method();

	}

}
