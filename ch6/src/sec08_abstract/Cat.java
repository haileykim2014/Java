package sec08_abstract;

public class Cat extends Animal{
	public Cat() {
		this.kind = "������"; //������
	}
	
	@Override
	public void sound() { //ctrl+space //�ڽ�Ŭ�������� ������
		System.out.println("�߿�");
	}
}
