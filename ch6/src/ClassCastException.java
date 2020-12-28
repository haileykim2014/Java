
public class ClassCastException {

	public static void main(String[] args) {
//		Animal animal = new Dog(); //독개체를만들어서 에니멀에 대입한다
//		Dog dog = (Dog)animal; //강제타입변환
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { //왼쪽의객체가 오른쪽타입의 객체이냐
		Dog dog = (Dog) animal;
	} else {
		System.out.println("Dog으로 변환이 어렵습니다.");
	}
	}
	}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

