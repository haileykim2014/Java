
public class ClassCastException {

	public static void main(String[] args) {
//		Animal animal = new Dog(); //����ü������ ���ϸֿ� �����Ѵ�
//		Dog dog = (Dog)animal; //����Ÿ�Ժ�ȯ
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { //�����ǰ�ü�� ������Ÿ���� ��ü�̳�
		Dog dog = (Dog) animal;
	} else {
		System.out.println("Dog���� ��ȯ�� ��ƽ��ϴ�.");
	}
	}
	}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

