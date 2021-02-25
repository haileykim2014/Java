package sec08_abstract;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog(); //객체생성
		Cat cat = new Cat(); //객체생성
		
		dog.sound(); //자식에서 재정의된것불러움
		cat.sound();
		System.out.println("----------------");

		Animal animal = null;//
		animal = new Dog();//자식객체를만들어서 부모타입변수에 대입-자동타입변환
		animal.sound(); //자식쪽메소드가 호출된다.
		
		animal = new Cat();
		animal.sound();
		System.out.println("----------------");

		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	public static void animalSound(Animal animal) {//정적메소드
		animal.sound(); //매개변수가 클래스타입인경우:Dog,Cat모두 호출될때?
	}
}
