package sec08_abstract;

public class Dog extends Animal{
	public Dog() {
		this.kind = "������"; //������
	}
	
	@Override
	public void sound() { //ctrl+space //�ڽ�Ŭ�������� ������
		System.out.println("�۸�");
	}
}
