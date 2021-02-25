package sec03.exam01;

class A{ //A는 B의 외부클래스
	int i=100;
	B b = new B();
	
	class B{ //B는 A의 내부클래스
		void method() {
//			A a =new A();
//			System.out.println(a.i);
			System.out.println(i);//객체생성없이 외부클래스의 멤버접근가능
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
