package sec07.exam07;

public class InstanceofExam {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
		Child child = (Child)parent;
		System.out.println("method-Child로 변환성공");
	} else {
		System.out.println("method1-Child 변환되지않음");
	}
	}
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		
	}

}
