package sec08_abstract;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog(); //��ü����
		Cat cat = new Cat(); //��ü����
		
		dog.sound(); //�ڽĿ��� �����ǵȰͺҷ���
		cat.sound();
		System.out.println("----------------");

		Animal animal = null;//
		animal = new Dog();//�ڽİ�ü������ �θ�Ÿ�Ժ����� ����-�ڵ�Ÿ�Ժ�ȯ
		animal.sound(); //�ڽ��ʸ޼ҵ尡 ȣ��ȴ�.
		
		animal = new Cat();
		animal.sound();
		System.out.println("----------------");

		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	public static void animalSound(Animal animal) {//�����޼ҵ�
		animal.sound(); //�Ű������� Ŭ����Ÿ���ΰ��:Dog,Cat��� ȣ��ɶ�?
	}
}
