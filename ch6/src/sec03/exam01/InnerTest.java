package sec03.exam01;

class A{
	int i=100;
	B b = new B();
}


class B{
	void method() {
		A a =new A();
		System.out.println(a.i);
	}
}

class C{
	B b =new B();
}


public class InnerTest {

	public static void main(String[] args) {
		B b = new B();
		b.method();

	}

}
